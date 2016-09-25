package epam.classes;

public class Main {

    public static void main(String[] args) {

        Robot robot = new Robot(14.1,19.1);
        Robot robotT = new Robot(21.2,12.2);
        Operator operator = new Operator("Dmytro", "Olefir");
        Operator operatorR = new Operator("Michail", "Cherevko");

        robot.setOperator(operator);
        operatorR.setRobot(robotT);

        System.out.println(robot.getOperator().getFirstName());

    }
}

