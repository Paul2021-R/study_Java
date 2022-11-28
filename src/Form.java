import java.security.SecureRandom;
import java.util.Random;

interface Execute {
    Boolean execute(Bureaucrat target);
}
public class Form implements Execute{
    private Integer     signGrade;
    private Integer     executeGrade;
    private final String      nameForm;
    private Boolean     blank;
    protected void tryGrade(Integer grade_) {
        if (grade_ < 1)
            throw new gradeTooHighException();
        if (grade_ > 150)
            throw new gradeTooLowException();
        return ;
    }

    /** 생성자
     *
     * @param name_
     * @param sign_
     * @param execute_
     */
    public Form(String name_, Integer sign_, Integer execute_) {
        this.nameForm = name_;
        this.blank = false;
        try {
            tryGrade(sign_);
        } catch (gradeTooLowException e) {
            this.signGrade = 150;
            System.out.println("Grade is too low. : " + this.signGrade);
        } catch (gradeTooHighException e) {
            this.signGrade = 1;
            System.out.println("Grade is too high. : " + this.signGrade);
        }
        try {
            tryGrade(execute_);
        } catch (gradeTooLowException e) {
            this.executeGrade = 150;
            System.out.println("Grade is too low. : " + this.executeGrade);
        } catch (gradeTooHighException e) {
            this.executeGrade = 1;
            System.out.println("Grade is too high. : " + this.executeGrade);
        }
        this.signGrade = sign_;
        this.executeGrade = execute_;
        this.blank = false;
    }

    /** sign 처리 됨
     * sign 됨을 작성함. 여기서 포인트는 private로 만들고 접근하고 싶은데 잘 안된다.
     * @param agent
     * @return 싸인 여부를 반환함.
     */
    public Boolean beSigned(Bureaucrat agent) {
        if (agent.getGrade() > this.signGrade) {
                return (false);
        }
        else {
            this.blank = true;
            System.out.println(agent.getName() + " is signed " + this.nameForm + " .");
            return (true);
        }
    }

    /** getter
     *
     * @return
     */
    public String getName() {
        return this.nameForm;
    }
    public Boolean getBlank() {
        return this.blank;
    }

    protected Boolean setBlank(Boolean val) {
        this.blank = val;
        return getBlank();
    }

    protected Integer getGrade(char code){
        if (code == 0)
            return signGrade;
        else
            return executeGrade;
    }
    public void introduceMyself() {
        System.out.println("======================");
        System.out.print("|| Name : ");
        System.out.print(this.nameForm);
        if (this.nameForm.length() < 10) {
            for (int i = 0; i < 10 - nameForm.length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.print("|| Signed : ");
        System.out.print(this.blank);
        if (this.blank.toString().length() < 8){
            for (int i = 0; i < 8 - blank.toString().length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.print("|| S Grade : ");
        System.out.print(this.signGrade);
        if (this.signGrade.toString().length() < 9){
            for (int i = 0; i < 7 - signGrade.toString().length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.print("|| E Grade : ");
        System.out.print(this.executeGrade);
        if (this.executeGrade.toString().length() < 9){
            for (int i = 0; i < 7 - executeGrade.toString().length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.println("======================");
    }

    public Boolean execute(Bureaucrat target) {
        if (this.getBlank() == true) {
            if (this.getGrade((char) 1) >= target.getGrade()) {
                System.out.println(this.nameForm + " is executed.");
            }
            else {
                System.out.println(this.nameForm + " is not executed.");
                this.blank = false;
            }
        }
        return this.getBlank();
    };
}

class PresidentialPardonForm extends Form implements Execute {
    public PresidentialPardonForm(String name_) {
        super(name_, 25, 5); // 부모 클래스의 생성자를 호출하는 메서드 이다.
        // 자식 클래스 생성자 안에서 써야 하고, 반드시 '첫줄'에 써야 한다.
    }

    public Boolean execute(Bureaucrat target) {
        if (this.getBlank() == true) {
            if (this.getGrade((char) 1) > target.getGrade()) {
                System.out.println("Zaphod Beeblebrox is fired by " + target.getName());
            }
            else {
                System.out.println("Zaphod Beeblebrox is not fired by " + target.getName());
                this.setBlank(false);
            }
        }
        return this.getBlank();
    }
};

class RobotomyRequestedForm extends Form implements Execute {
    public RobotomyRequestedForm(String name_) {
        super (name_, 72, 45);
    }

    public Boolean execute(Bureaucrat target) {
        if (this.getBlank() == true) {
            if (this.getGrade((char) 1) > target.getGrade()) {
                Random ranVal = new Random();
                ranVal.setSeed(System.currentTimeMillis());
                Boolean ret = ranVal.nextBoolean();
                this.setBlank(ret);
            }
        }
        else
            this.setBlank(false);
        if (this.getBlank())
            System.out.println(target.getName() + " is Robotomized.");
        else
            System.out.println(target.getName() + " is failed to Robotomization.");
        return this.getBlank();
    }

};