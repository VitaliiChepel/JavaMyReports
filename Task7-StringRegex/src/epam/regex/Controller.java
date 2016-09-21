package epam.regex;

import java.util.ArrayList;
import java.util.Scanner;

import epam.regex.Entities.Notebook;

import java.util.Date;

/**
 * Created by Витал on 20.09.2016.
 */
public class Controller {

    // Constructor
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void processUser() {
        Scanner sc = new Scanner(System.in);
        String userEnter;
        ArrayList<String> address = new ArrayList<>();

        while (true) {
            view.printMessage(view.INPUT_SURNAME);
            userEnter = sc.nextLine();
            if (userEnter.matches("[A-Za-z]{1,25}+")) {
                model.setNotebookSurname(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_NAME);
            userEnter = sc.nextLine();
            if (userEnter.matches("[A-Za-z]{1,25}+")) {
                model.setNotebookName(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_MIDDLE_NAME);
            userEnter = sc.nextLine();
            if (userEnter.matches("[A-Za-z]{1,25}+")) {
                model.setNotebookMiddleName(userEnter);
                break;


            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_NICK_NAME);
            userEnter = sc.nextLine();
            if (userEnter.matches("^[A-Za-z][A-Za-z0-9._-]{4,25}$")) {
                model.setNotebookNickName(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_COMMENT);
            userEnter = sc.nextLine();
            if (userEnter.matches("^[a-zA-Z0-9._-]{2,120}$")) {
                model.setNotebookComment(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_GROUP);
            userEnter = sc.nextLine();
            if (userEnter.matches(Group.PARENTS.toString()) ||
                    userEnter.matches(Group.RELATIVES.toString()) ||
                    userEnter.matches(Group.COLLEAGUES.toString()) ||
                    userEnter.matches(Group.FRIENDS.toString()) ||
                    userEnter.matches(Group.OTHERS.toString())) {
                model.setNotebookGroup(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_HOMEPHONE);
            userEnter = sc.nextLine();
            if (userEnter.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$")) {
                model.setNotebookHomePhone(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_MOBILEPHONE);
            userEnter = sc.nextLine();
            if (userEnter.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$")) {
                model.setNotebookMobilePhone(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_SECOND_MOBILEPHONE);
            userEnter = sc.nextLine();
            if (userEnter.matches("^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$")) {
                model.setNotebookSecondMobilePhone(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_EMAIL);
            userEnter = sc.nextLine();
            if (userEnter.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b")) {
                model.setNotebookEmail(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_SKYPE);
            userEnter = sc.nextLine();
            if (userEnter.matches("^[A-Za-z][A-Za-z0-9._-]{3,20}$")) {
                model.setNotebookSkype(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }


        while (true) {
            view.printMessage(view.INPUT_ADDRESS);
            userEnter = sc.nextLine();
            if (userEnter.matches("([0-9]+),([A-Za-z]+),([A-Za-z]+),([A-Za-z][A-Za-z0-9_]+),([A-Za-z][A-Za-z0-9_]+)")) {
                address.add(userEnter);
                model.setNotebookAddress(address);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_CREATION_NOTEDATE);
            userEnter = sc.nextLine();
            if (userEnter.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")) {
                model.setNotebookCreationNoteDate(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }

        while (true) {
            view.printMessage(view.INPUT_DATE_LAST_CHANGES);
            userEnter = sc.nextLine();
            if (userEnter.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)")) {
                model.setNotebookLastChangeDate(userEnter);
                break;
            } else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
                continue;
            }
        }
    }
}


