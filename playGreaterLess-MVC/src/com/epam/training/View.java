package com.epam.training;


public class View {


        public static final String WRONG_ENTRY_DIAPASON_MESSAGE = "Your entry value is in wrong diapason. So, min and max values was interchanged.";
        public static final String REMINDER_FOR_GUESS = "You should guess figure from " ;
        public static final String WRONG_ENTRY_VALUE_MESSAGE = "You entered wrong value ";
        public static final String NEED_DIAPASON_MESSAGE = "You should enter number from the diapason ";
        public static final String CONGRATULATIONS_MESSAGE = "Congratulations! You entered right figure. You is winner. Figure is " ;
        public static final String ABOUT_ATTEMPTS_MESSAGE = "You guessed using  ";
        public static final String ATTEMPTS = "attempts";
        public static final String AND = " and ";
        public static final String FIGURE_DIAPASON_MESSAGE = "Figure is in the diapason ";


        public static String stringRange(int bottom, int tip) {
            return "[ " + bottom + " ; " + tip + " ]";
        }

        public void printMessage(String message){
            System.out.println(message);
        }

        public String concatString(Object ... str) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length; i++){
                stringBuilder.append(str[i]);
            }
            return stringBuilder.toString();
        }

    }

