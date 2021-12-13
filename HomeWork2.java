/*
*
* Java 1. Homework #2
* @author Marina Yurkova
* @version 13.12.21
*/

class HomeWork2 {
    public static void main (String[] args) {
        System.out.println (checkSum10To20(3, 5));
        System.out.println (checkPlusOrMinus (5));
        System.out.println (checkNegative (-6));
        printSymbNTimes ();
    }

    static boolean checkSum10To20(int a, int b) {
        return a + b >=10 && a + b <= 20;
    }
    
    static String checkPlusOrMinus(int a) {
        return a >= 0? "Positive" : "Negative";
    }
    
    static boolean checkNegative(int a) {
        return a < 0;
    }
    
    static void printSymbNTimes () {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print ("^");
            }
            System.out.println ();
        }
    }
}