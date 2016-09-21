package epam.regex;

import java.util.ArrayList;

/**
 * Created by Витал on 20.09.2016.
 */
public class View {

    public static final String WRONG_INPUT_MESSAGE = "You entered wrong info";
    public static final String INPUT_SURNAME = "Enter your surname";
    public static final String INPUT_NAME = "Enter your name";
    public static final String INPUT_MIDDLE_NAME = "Enter your middle name";
    public static final String INPUT_NICK_NAME = "Enter your nickname";
    public static final String INPUT_COMMENT = "Enter your comment";
    public static final String INPUT_GROUP = "Enter your group";
    public static final String INPUT_HOMEPHONE = "Enter your home phone by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_MOBILEPHONE = "Enter your mobile phone number by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_SECOND_MOBILEPHONE = "Enter your second phone number by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_EMAIL = "Enter your email";
    public static final String INPUT_SKYPE = "Enter your skype";
    public static final String INPUT_ADDRESS = "Enter index, city, street, house number, flat number";
    public static final String INPUT_CREATION_NOTEDATE = "Enter date of creation note by format dd/mm/yyyy ";
    public static final String INPUT_DATE_LAST_CHANGES = "Enter date of last changes by format  dd/mm/yyyy ";


    public void printMessage(String message) {
        System.out.println(message);
    }
}