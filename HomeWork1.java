/*
*
* Java 1. Homework #1
* @author Marina Yurkova
* @version 10.12.21 corrected 13.12.21
*/

class HomeWork1 {
    public static void main(String[] args) {
        printThreeWords();
        System.out.println(checkSumSign(1, -2));
        printColor();
        compareNumbers();
    }

    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    static String checkSumSign(int a, int b) {
        return a + b >= 0? "Positive" : "Negative";
    }

    static void printColor() {
        int value = 50;
        if (value <=0) {
            System.out.println("Red");
        } else if (value <=100) {
            System.out.println("Yellow");
        } else {
            System.out.println ("Green");
        }
    }

    static void compareNumbers() {
        int a = 1, b = 2;
        System.out.println((a >= b)? "a >= b" : "a < b");
    }
}