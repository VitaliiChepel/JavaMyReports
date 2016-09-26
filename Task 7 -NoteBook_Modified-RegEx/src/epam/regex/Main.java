package epam.regex;

import epam.regex.controller.Controller;
import epam.regex.model.Model;


public class Main {

    public static void main(String[] args) {

        // Initialization
        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);
        // Run
        controller.processUser();
        view.printMessage(model.toString());

        System.out.println();

    }
}

