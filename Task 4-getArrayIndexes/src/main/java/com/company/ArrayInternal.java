package com.company;

public class ArrayInternal {

    private ArrayInternal() {}

    public static int getCountNeedIndexesInArray(int[] array, int number) {
        int count = 0;

        for (int i = 0;  i < array.length; i++) {
            if (array[i] == number) count++;
        }
        return count;
    }

    public static int [] getConcreteIndexesOfArray(int[] array, int number) {
        int countNeedIndexes = getCountNeedIndexesInArray(array, number);
        int [] newArray = new int[countNeedIndexes];

        if (countNeedIndexes == 0) return newArray;
        else {
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] == number) {
                    newArray[j++] = i;
                }
            }
        }
        return newArray;
    }
}