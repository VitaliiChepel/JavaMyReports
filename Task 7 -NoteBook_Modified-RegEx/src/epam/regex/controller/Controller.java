package epam.regex.controller;



        import epam.regex.model.entity.NoteBookItem;
        import epam.regex.model.Model;
        import epam.regex.View;
        import java.util.Scanner;
        import java.util.regex.Matcher;
        import java.util.regex.Pattern;

        import static epam.regex.controller.RegularExpressions.*;


public class Controller {
    Model model;
    View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    // working method
    public void processUser() {
        Scanner sc = new Scanner(System.in);
        InputRegForm inputRegForm = new InputRegForm();
        inputRegForm.setName(inputIntValueWithScanner(sc,view.INPUT_NAME, regExpName));
        inputRegForm.setSurname(inputIntValueWithScanner(sc,view.INPUT_SURNAME, regExpName));
        inputRegForm.setMiddleName(inputIntValueWithScanner(sc,view.INPUT_MIDDLE_NAME, regExpName));
        inputRegForm.setIndex(inputIntValueWithScanner(sc,view.INPUT_INDEX, regExpIndex));
        inputRegForm.setCity(inputIntValueWithScanner(sc,view.INPUT_CITY, regExpCity));
        inputRegForm.setStreet(inputIntValueWithScanner(sc,view.INPUT_STREET, regExpStreet));
        inputRegForm.setBuilding(inputIntValueWithScanner(sc,view.INPUT_BUILDING, regExpBuilding));
        inputRegForm.setApartment(inputIntValueWithScanner(sc,view.INPUT_APARTMENT, regExpApartment));
        inputRegForm.setComment(inputIntValueWithScanner(sc,view.INPUT_COMMENT, regExpComment));
        inputRegForm.setNickName(inputIntValueWithScanner(sc,view.INPUT_NICK_NAME, regExpName));
        inputRegForm.setGroup(inputIntValueWithScanner(sc,view.INPUT_GROUP, regExpGroup));
        inputRegForm.setHomePhone(inputIntValueWithScanner(sc,view.INPUT_HOMEPHONE, regExpHomePhone));
        inputRegForm.setMobilePhone(inputIntValueWithScanner(sc,view.INPUT_MOBILEPHONE, regExpMobilePhone));
        inputRegForm.setSecondMobilePhone(inputIntValueWithScanner(sc,view.INPUT_SECOND_MOBILEPHONE, regExpSecondMobilePhone));
        inputRegForm.setEmail(inputIntValueWithScanner(sc,view.INPUT_EMAIL, regExpEmail));
        inputRegForm.setSkype(inputIntValueWithScanner(sc,view.INPUT_SKYPE, regExpSkype));
        inputRegForm.setCreationNoteDate(inputIntValueWithScanner(sc,view.INPUT_CREATION_NOTEDATE, regExpCreationNoteDate));
        inputRegForm.setLastChangeDate(inputIntValueWithScanner(sc,view.INPUT_DATE_LAST_CHANGES, regExplastChangeDate));


        NoteBookItem noteBookItem = new NoteBookItem();
        model.addItem();

        System.out.println(noteBookItem.toString());
    }



    public String inputIntValueWithScanner(Scanner sc, String message, String regExp) {
        boolean match = false;
        String inputValue = "";
        Pattern p = Pattern.compile(regExp);

        while( !match ) {
            view.printMessage(message);
            inputValue = sc.nextLine();
            Matcher m = p.matcher(inputValue);
            if (m.matches()){
                match = true;
            }
            else {
                view.printMessage(view.WRONG_INPUT_MESSAGE);
            }
        }
        return inputValue;

    }
}
