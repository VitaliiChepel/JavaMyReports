package epam.regex;

public class Main {


        public static void main(String[] args) {
            Model model = new Model();
            View view = new View();
            Controller controller = new Controller(model, view);
            //controller.view=view;

            controller.processUser();
            view.printMessage(model.notebook.toString());
        }
    }