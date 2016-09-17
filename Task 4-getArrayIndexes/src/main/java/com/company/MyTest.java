package com.company;

/**
 * Created by Витал on 15.09.2016.
 */

import org.junit.Test;
import static org.junit.Assert.*;


    public class MyTest {

        @Test
        public void testGetCountEntryValueInArray() {
            int[] array = {4, 7, 8, 21, 8, 19, 8, 6, 32, 8};
            int result = ArrayInternal.getCountNeedIndexesInArray(array, 8);
            assertEquals(result, 4, 0.0);
        }

        @Test
        public void testGetNeedIndexesOfArray() {
            int[] array = {4, 7, 8, 21, 8, 19, 8, 6, 32, 8};
            int[] result = ArrayInternal.getConcreteIndexesOfArray(array, 8);
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] == 8) {
                    assertEquals(result[j++], i, 0.0);
                }
            }
        }

        @Test
        public void testGetCountIndexesOfArrayNotIncludeEntryValue() {
            int[] array = {4, 7, 8, 21, 8, 19, 8, 6, 32, 8};
            int result = ArrayInternal.getCountNeedIndexesInArray(array, 3);
            assertEquals(result, 0.0, 0.0);
        }

        @Test
        public void testGetIndexesOfArrayNotIncludeEntryValue() {
            int[] array = {4, 7, 8, 21, 8, 19, 8, 6, 32, 8};
            int[] result = ArrayInternal.getConcreteIndexesOfArray(array, 3);
            assertTrue(result.length == 0);
        }


        @Test
        public void testGetIndexesInEmptyArray() {
            int[] array = {};
            int[] result = ArrayInternal.getConcreteIndexesOfArray(array, 4);
            assertTrue(result.length == 0);
        }

        @Test
        public void testGetIndexesOfArrayWithOneElement() {
            int[] array = {7};
            int[] result = ArrayInternal.getConcreteIndexesOfArray(array, 7);
            for (int i = 0, j = 0; i < array.length; i++) {
                if (array[i] == 7) {
                    assertEquals(result [j++], i, 0.0);;
                }
            }
        }
    }