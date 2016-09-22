package maxproject;

public class Main {

    public static void main(String[] args) {

        Employee emp = new Employee("Petro", "Petrov", 25, "high", "single");
        Employee emp1 = new Employee("Petro", "Petrov", 25, "high", "single");
        Employee emp2 = new Employee("Olga", "Klymova", 24, "secondary", "married");
        StudentChildRD student1 = new StudentChildRD("Olga", "Losko", 24, "secondary", "single", DirectionRD.AUTOMATED_TESTING);
        StudentChildRD student2 = new StudentChildRD("Vasyl", "Lobko", 32, "high", "single", DirectionRD.JAVA);


        System.out.println(emp.equals(emp1));
        System.out.println(emp1.equals(emp2));
        System.out.println(emp2.equals(student1));
        System.out.println(student2.equals(student1));
        System.out.println(emp.hashCode());
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(student1.hashCode());
        System.out.println(student2.hashCode());
    }
}