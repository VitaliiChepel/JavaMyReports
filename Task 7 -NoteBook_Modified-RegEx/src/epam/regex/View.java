package epam.regex;


public class View {

    // Text's constants
    public static final String INPUT_NAME = "Enter your name";
    public static final String INPUT_SURNAME = "Enter your surname";
    public static final String INPUT_MIDDLE_NAME = "Enter your middle name";
    public static final String INPUT_NICK_NAME = "Enter your nickname";
    public static final String INPUT_COMMENT = "Enter your comment";
    public static final String INPUT_GROUP = "Enter your group";
    public static final String INPUT_HOMEPHONE = "Enter your home phone by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_MOBILEPHONE = "Enter your mobile phone number by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_SECOND_MOBILEPHONE = "Enter your second phone number by format +xx(xxx)xxx-xx-xx";
    public static final String INPUT_EMAIL = "Enter your email";
    public static final String INPUT_SKYPE = "Enter your skype";
    public static final String INPUT_INDEX = "Enter your index number-5 digits must have ";
    public static final String INPUT_CITY = "Enter your city name. ";
    public static final String INPUT_STREET = "Enter street name ";
    public static final String INPUT_BUILDING = "Enter bulding number ";
    public static final String INPUT_APARTMENT = "Enter apartment number ";
    public static final String INPUT_CREATION_NOTEDATE = "Enter date of creation note by format dd/mm/yyyy ";
    public static final String INPUT_DATE_LAST_CHANGES = "Enter date of last changes by format  dd/mm/yyyy ";
    public static final String WRONG_INPUT_MESSAGE = "You entered wrong info";

    /**
     * @param message
     */
    public void printMessage(String message) {
        System.out.println(message);
    }

}
