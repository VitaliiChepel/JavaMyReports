package com.epam.training;

import java.util.Random;

public class Model {

        private int LOWER_VALUE = 0;
        private int UPPER_VALUE = 100;
        private int randValue = 0;
        private int countOfAttempts = 0;
        private View view = new View();

    public boolean checkNumber(int value) {
            if(value == randValue) {
                view.printMessage(view.concatString(View.CONGRATULATIONS_MESSAGE , value));
                view.printMessage(view.concatString(View.ABOUT_ATTEMPTS_MESSAGE, countOfAttempts, View.ATTEMPTS));
                return true;
            }
            else if(value < randValue) {
                if (value > LOWER_VALUE) LOWER_VALUE = value;
                view.printMessage(view.concatString(View.FIGURE_DIAPASON_MESSAGE, view.stringRange(LOWER_VALUE, UPPER_VALUE)));
            }
            else {
                if (value < UPPER_VALUE) UPPER_VALUE = value;
                view.printMessage(view.concatString(View.FIGURE_DIAPASON_MESSAGE, view.stringRange(LOWER_VALUE, UPPER_VALUE)));
            }
            return false;
        }

        public void growCountOfAttempts() {
            countOfAttempts++;
        }

        public void decreaseCountOfAttempts() {
            countOfAttempts--;
        }

        public int getLOWER_VALUE() {
            return LOWER_VALUE;
        }

        public void setLOWER_VALUE(int lowerValue) {
            LOWER_VALUE = lowerValue;
        }

        public int getUPPER_VALUE() {
            return UPPER_VALUE;
        }

        public void setUPPER_VALUE(int upperValue) {
            UPPER_VALUE = upperValue;
        }

        public void setRandomValue(int min, int max) {
            Random accid = new Random();
            randValue = accid.nextInt(max - min + 1) + min;
        }

        public void setRandomValue() {
            setRandomValue(0, Integer.MAX_VALUE - 1);
        }
    }

