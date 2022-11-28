public class Bureaucrat {
    private final String name;
    private Integer grade;
    public Bureaucrat(String name_, Integer grade_) {
        this.name = name_;
        try {
            this.tryGrade(grade_);
        } catch (gradeTooLowException e) {
            this.grade = 150;
            System.out.println("Grade is too low. : " + this.grade);
        } catch (gradeTooHighException e) {
            this.grade = 1;
            System.out.println("Grade is too high. : " + this.grade);
        } catch (gradeIsOkay e) {
            this.grade = grade_;
        }
    }
    private void tryGrade(Integer grade_) {
        if (grade_ < 1)
            throw new gradeTooHighException();
        if (grade_ > 150)
            throw new gradeTooLowException();
        throw new gradeIsOkay();
    }
    public String getName() { return this.name; }
    public Integer getGrade() { return this.grade; }
    public void increaseGrade() {
        try {
            tryGrade(this.grade - 1);
        } catch (gradeTooHighException e) {
            System.out.println("Grade is too high. : " + this.grade);
        } catch (gradeIsOkay e) {
            this.grade -= 1;
            System.out.println("Grade is increased. : " + this.grade);
        }
    }
    public void decreaseGrade() {
        try {
            tryGrade(this.grade + 1);
        } catch (gradeTooLowException e) {
            System.out.println("Grade is too low. : " + this.grade);
        } catch (gradeIsOkay e) {
            this.grade += 1;
            System.out.println("Grade is decreased. : " + this.grade);
        }
    }
    public void introduceMyself() {
        System.out.println("======================");
        System.out.print("|| Name : ");
        for (int i = 0; i < 9; i++) {
            if (i < name.length())
                System.out.print(name.charAt(i));
            else
                System.out.print(" ");
        }
        System.out.println(" ||");
        System.out.print("|| Grade : ");
        for (int i = 0; i < 9; i++) {
            if (i < getGrade().toString().length())
                System.out.print(getGrade().toString().charAt(i));
            else
                System.out.print(" ");
        }
        System.out.println("||");
        System.out.println("======================");
    }

    public Boolean signForm(Form target) {
        if (target.beSigned(this)) {
            System.out.println("Sign is successed.");
            return (true);
        }
        else {
            System.out.println("Sign is failed");
            return (false);
        }
    }

    public Boolean executeForm(Form target) {
        if (signForm(target)) {
            if (target.execute(this))
                return (true);
        }
        return (false);
    }
};
