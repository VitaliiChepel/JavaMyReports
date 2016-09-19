package com.company;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main {




    public static void main(String[] args) {

        int LOWER_VALUE = 0;
        int UPPER_VALUE = 100;

        int randomValue = randomValue(LOWER_VALUE, UPPER_VALUE);
        play(randomValue, LOWER_VALUE, UPPER_VALUE);

    }

    public static int randomValue(int min, int max) {

        if (min > max) {
            min = max + min;
            max = min - max;
            min = min - max;

            System.out.println("Your entry value is in wrong diapason. So, min and max values was interchanged.");
        }

        Random r = new Random();
        int randomDigit = r.nextInt(max - min + 1) + min;
        return randomDigit;
    }

    public static int randomValue() {
        Random r = new Random();
        int randomDigit = r.nextInt(Integer.MAX_VALUE);
        return randomDigit;
    }

    public static void play(int accid, int bottom, int tip)
    {
        int count = 0;
        int figure = 0;

        System.out.println("You should guess figure from " + showDiapason(bottom, tip));

        while(true) {

            Scanner scanner = new Scanner(System.in);
            try {
               figure = scanner.nextInt();
            }
            catch (InputMismatchException e) {
                System.out.println("You entered wrong value.");
                System.out.println("You should enter number from the diapason " + showDiapason(bottom, tip));
                continue;
            }
            count++;

            if(figure == accid) {
                System.out.println("Congratulations! You entered right figure. You is winner. Figure is " + accid);
                System.out.println("You guessed using " + count + " attempts");
                return;
            }
            else if(figure < accid) {
                if (figure > bottom) bottom = accid;
                System.out.println("Figure is in the diapason " + showDiapason(bottom, tip));
            }
            else {
                if (figure < tip) tip = figure;
                System.out.println("Figure is in the diapason " + showDiapason(bottom, tip));
            }

        }
    }

    public static String showDiapason(int bottom, int tip) {
        return "[ " + bottom + " , " + tip + " ]";
    }
}