package epam.patterns;

import java.util.Arrays;

/**
 * Created by Витал on 26.09.2016.
 */
public class StrategyApp {
    public static void main(String[] args) {

        StrategyClient c = new StrategyClient();
        int [] arr0 = {1,3,2,1};
        c.setStrategy(new SelectionSort());
        c.executeStrategy(arr0);


        int [] arr1 = {11, 4, 2, 7, 8, 54};
        c.setStrategy(new InsertingSort());
        c.executeStrategy(arr1);

        int [] arr2 = {3, -8, 2, 0, 33, 1, 3, 2};
        c.setStrategy(new BubbleSort());
        c.executeStrategy(arr2);
    }
}


//Context
class StrategyClient {
    Sorting strategy;
    public void setStrategy(Sorting strategy) {
            this.strategy = strategy;
        }
    public void executeStrategy (int[] arr){
        strategy.sort(arr);
        }
}



// Strategy
interface Sorting {
    void sort(int[] arr);
}

//Bubble sorting strategy (Сортировка пузырьком)
class BubbleSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка пузырьком");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barrier = arr.length - 1; barrier >= 0; barrier--) {
            for (int i = 0; i < barrier; i++) {
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}

//Selection sorting strategy (Сортировка выборками)
class SelectionSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка выборками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int i = barrier + 1; i < arr.length; i++) {
                if (arr[i] < arr[barrier]) {
                    int tmp = arr[i];
                    arr[i] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}

//Inserting sorting strategy (Сортировка вставками)
class InsertingSort implements Sorting {
    public void sort(int[] arr) {
        System.out.println("Сортировка вставками");
        System.out.println("до:\t" + Arrays.toString(arr));
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int index = barrier;
            while (index - 1 >= 0 && arr[index] < arr[index - 1]) {

                int tmp = arr[index];
                arr[index] = arr[index - 1];
                arr[index - 1] = tmp;
                index--;
            }
        }
        System.out.println("после:\t" + Arrays.toString(arr));
    }
}