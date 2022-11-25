public class Form {
    private Integer     signGrade;
    private Integer     executeGrade;
    private final String      nameForm;
    private Boolean     blank;
    private void tryGrade(Integer grade_) {
        if (grade_ < 1)
            throw new gradeTooHighException();
        if (grade_ > 150)
            throw new gradeTooLowException();
        return ;
    }
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

    /**
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
    public String getName() {
        return this.nameForm;
    }
    public Boolean getBlank() {
        return this.blank;
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
        System.out.print("|| Grade : ");
        System.out.print(this.signGrade);
        if (this.signGrade.toString().length() < 9){
            for (int i = 0; i < 9 - signGrade.toString().length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.print("|| Grade : ");
        System.out.print(this.executeGrade);
        if (this.executeGrade.toString().length() < 9){
            for (int i = 0; i < 9 - executeGrade.toString().length(); i++)
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.println("======================");
    }
}