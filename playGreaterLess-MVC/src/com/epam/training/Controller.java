package com.epam.training;

import java.util.Scanner;

public class Controller {

        Model model;
        View view;

        public Controller(Model model, View view) {
            this.model  = model;
            this.view = view;
        }

        public void processUser(){
            Scanner sc = new Scanner(System.in);

            model.setLOWER_VALUE(0);
            model.setUPPER_VALUE(100);
            model.setRandomValue(model.getLOWER_VALUE(), model.getUPPER_VALUE());

            do {
                model.growCountOfAttempts();
            }
            while(!model.checkNumber(entryIntValueWithScanner(sc)));
        }

        public int entryIntValueWithScanner(Scanner sc) {
            int result=0;
            view.printMessage(view.concatString(View.REMINDER_FOR_GUESS, model.getLOWER_VALUE(),
                    View.AND, model.getUPPER_VALUE() ));

            while( true ) {
                while (!sc.hasNextInt()) {
                    view.printMessage(view.concatString(View.WRONG_ENTRY_DIAPASON_MESSAGE,
                            View.NEED_DIAPASON_MESSAGE,
                            view.stringRange(model.getLOWER_VALUE(), model.getUPPER_VALUE())));
                    sc.next();
                }

                if ((result = sc.nextInt()) < model.getLOWER_VALUE() ||
                        result > model.getUPPER_VALUE()) {
                    view.printMessage(view.concatString(View.WRONG_ENTRY_DIAPASON_MESSAGE,
                            view.stringRange(model.getLOWER_VALUE(), model.getUPPER_VALUE())));
                    model.decreaseCountOfAttempts();
                    continue ;
                }
                break;
            }
            return result;
        }

    }

