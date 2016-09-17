package com.company;

import java.util.Arrays;


/**
 * Created by Витал on 15.09.2016.
 */
public class Main {

        public static void main(String[] args) {
            int[] array = { 4, 7, 8, 21, 8, 19, 8, 6, 32, 8 };

            System.out.println(Arrays.toString(ArrayInternal.getConcreteIndexesOfArray(array, 8)));
        }
    }

