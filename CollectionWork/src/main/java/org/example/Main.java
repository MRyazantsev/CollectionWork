package org.example;

import java.util.Scanner;

/**
 * The main class where you can print tests for the LinkedList and ArrayList class methods.
 * @author Mikhail Ryazantsev.
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько различных тестов хотите сделать? (количество разных N) ");
        int N = sc.nextInt();
        int value;
        int[] n_array = new int[N];
        for(int i=0;i<N;i++){
            System.out.println("Сколько повторений метода в "+ (i+1) +"-м тесте (от 1 до 100000): ");
            value = sc.nextInt();
            n_array[i] = value;
        }
        System.out.println("Введите 1, чтобы вывести тесты всех методов.");
        System.out.println("Название метода, чтобы вывести тесты именно его (Add, Get, Delete, Set, Size).");
        System.out.println("0, чтобы закончить работу программы.");
        String cmd = "";
        testTable T1 = new testTable();
        cmd = sc.next();
        while(!cmd.equals("0")){
            if(cmd.equals("1")){
                T1.printTests(n_array);
            }
            else{
                T1.printTable(cmd, n_array);
            }
            System.out.println("Введите следующую команду (1, 0 или название метода): ");
            cmd = sc.next();
        }
    }
}