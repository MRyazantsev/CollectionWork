package org.example;

/**
 * testTable class provides access to the main methods for viewing test results:
 * printing the tests of all methods or a single method.
 */
public class testTable {
    linkedListWork L1;
    arrayListWork L2;

    /**
     * Constructor of class
     */
    public testTable(){
        L1 = new linkedListWork();
        L2 = new arrayListWork();
    }

    /**
     * A helper function that counts the number of digits in a number (used in printTable method).
     * @param value The number whose number of digits you need to find out.
     * @return number of digits you need to find out.
     */
    private static int number(int value){
        int result = 0;
        while(value>0){
            value = value / 10;
            result++;
        }
        return result;
    }

    /**
     * Method for stylized printing of tests of a given method for LinkedList and ArrayList class.
     * @param method for which method tests will be produced and printed.
     * @param n_array an array of the number of repetitions of the method in each test.
     */
    public void printTable(String method, int[] n_array){
        System.out.print("      |       Метод:  " + method);
        for(int i=0;i<10-method.length();i++){
            System.out.print(" ");
        }
        System.out.print("|\n  N   | LinkedList | ArrayList  |\n");
        System.out.print("------|------------|------------|\n");
        long num1, num2;
        for (int k : n_array) {
            switch (method) {
                case ("Add") -> {
                    num1 = this.L1.timeOfAdd(k);
                    num2 = this.L2.timeOfAdd(k);
                }
                case ("Get") -> {
                    num1 = this.L1.timeOfGet(k);
                    num2 = this.L2.timeOfGet(k);
                }
                case ("Delete") -> {
                    num1 = this.L1.timeOfDelete(k);
                    num2 = this.L2.timeOfDelete(k);
                }
                case ("Size") -> {
                    num1 = this.L1.timeOfSize(k);
                    num2 = this.L2.timeOfSize(k);
                }
                case ("Set") -> {
                    num1 = this.L1.timeOfSet(k);
                    num2 = this.L2.timeOfSet(k);
                }
                default -> {
                    System.out.println("Такого метода нет.");
                    num1 = 0;
                    num2 = 0;
                }
            }

            System.out.print(k);
            for (int j = 0; j < 6 - number(k); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print(num1);
            for (int j = 0; j < 12 - number((int) num1); j++) {
                System.out.print(" ");
            }
            System.out.print("|");
            System.out.print(num2);
            for (int j = 0; j < 12 - number((int) num2); j++) {
                System.out.print(" ");
            }
            System.out.print("| nanoseconds (10^-9 sec.)\n");
        }
        System.out.print("---------------------------------\n\n");
    }

    /**
     * Useful method for printing tests for all methods at once.
     * @param n_array an array of the number of repetitions of the method in each test.
     */
    public void printTests(int[] n_array){
        printTable("Add", n_array);
        printTable("Get", n_array);
        printTable("Delete", n_array);
        printTable("Size", n_array);
        printTable("Set", n_array);
    }
}
