/*
*
* Java 1. Homework #3
* @author Marina Yurkova
* @version 18.12.21
*/

import java.util.Arrays;

class HomeWork3 {
    public static void main(String[] args) {
        invert1To0();
        countTo100();
        multiplyX2();
        diagonal();
        System.out.println(Arrays.toString(backTheLenLength(5, 1)));
    }

    static void invert1To0() {
        int[] arr = {1, 1, 0, 0, 1};
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] == 1) {
                arr[i] = 0;
            } else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void countTo100() {
        int[] arr = new int [100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    } 

    static void multiplyX2() {
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    static void diagonal() {
        int[][] diagonal = new int [7][7];
        for (int i = 0; i < diagonal.length; i++) {
            diagonal [i][i] = 1;
        }
        for (int i = 0; i < diagonal.length; i++) {
            System.out.println(Arrays.toString(diagonal[i]));
        }
    }

    static int[] backTheLenLength(int len, int initialValue) {
        int[] arr = new int [len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }
}