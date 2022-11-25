import javax.management.StandardEmitterMBean;

class gradeTooHighException extends RuntimeException {}
class gradeTooLowException extends RuntimeException {}
class gradeIsOkay extends RuntimeException {}

public class Main {
    public static void main(String[] args) {
        System.out.println("If can I make some class with Java and c++?!");

        Bureaucrat agent = new Bureaucrat("John", 140);
        agent.introduceMyself();
        for (int i = 0; i < 150; i++) {
            agent.increaseGrade();
        }
        for (int i = 0; i < 200; i++) {
            agent.decreaseGrade();
        }
        agent.introduceMyself();

        Form testForm = new Form("test", 20, 1);
        testForm.introduceMyself();

        Bureaucrat agent1 = new Bureaucrat("Tom", 150);
        Bureaucrat agent2 = new Bureaucrat("Brad", 1);
        agent1.signForm(testForm);
        agent2.signForm(testForm);

    }
}