package org.example;

import java.util.ArrayList;
/**
 * The class in which the test results are calculated for ArrayList.
 */
public class arrayListWork{
    ArrayList<String> list;
    /**
     * Constructor of class
     */
    public arrayListWork(){
        list = new ArrayList<String>();
    }
    /**
     * Calculating "Get" method test results for a ArrayList class.
     * @param N number of repetitions of the method.
     * @return Time for which the method will work N number of times.
     */
    public long timeOfGet(int N){
        list.add("A");
        long test1;
        long test2;
        long test3;
        long start_time;
        long end_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.get(0);
        }
        end_time = System.nanoTime();

        test1 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.get(0);
        }
        end_time = System.nanoTime();

        test2 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.get(0);
        }
        end_time = System.nanoTime();

        test3 = end_time-start_time;

        list.clear();

        return(test1+test2+test3)/3;
    }
    /**
     * Calculating "Add" method test results for a ArrayList class.
     * @param N number of repetitions of the method.
     * @return Time for which the method will work N number of times.
     */
    public long timeOfAdd(int N){
        long test1;
        long test2;
        long test3;
        long start_time;
        long end_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.add("A");
        }
        end_time = System.nanoTime();

        test1 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.add("A");
        }
        end_time = System.nanoTime();

        test2 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.add("A");
        }
        end_time = System.nanoTime();

        test3 = end_time-start_time;

        list.clear();

        return(test1+test2+test3)/3;
    }
    /**
     * Calculating "Delete" method test results for a ArrayList class.
     * @param N number of repetitions of the method.
     * @return Time for which the method will work N number of times.
     */
    public long timeOfDelete(int N){
        long test1;
        long test2;
        long test3;
        long start_time;
        long end_time;

        for(int i = 0;i < N;i++){
            list.add("A");
        }

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.remove("A");
        }
        end_time = System.nanoTime();

        test1 = end_time-start_time;

        for(int i = 0;i < N;i++){
            list.add("A");
        }

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.remove("A");
        }
        end_time = System.nanoTime();

        test2 = end_time-start_time;

        for(int i = 0;i < N;i++){
            list.add("A");
        }

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.remove("A");
        }
        end_time = System.nanoTime();

        test3 = end_time-start_time;

        list.clear();

        return(test1+test2+test3)/3;
    }
    /**
     * Calculating "Size" method test results for a ArrayList class.
     * @param N number of repetitions of the method.
     * @return Time for which the method will work N number of times.
     */
    public long timeOfSize(int N){
        list.add("A");
        long test1;
        long test2;
        long test3;
        long start_time;
        long end_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.size();
        }
        end_time = System.nanoTime();

        test1 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.size();
        }
        end_time = System.nanoTime();

        test2 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.size();
        }
        end_time = System.nanoTime();

        test3 = end_time-start_time;

        list.clear();

        return(test1+test2+test3)/3;
    }
    /**
     * Calculating "Set" method test results for a ArrayList class.
     * @param N number of repetitions of the method.
     * @return Time for which the method will work N number of times.
     */
    public long timeOfSet(int N){
        list.add("A");
        long test1;
        long test2;
        long test3;
        long start_time;
        long end_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.set(0, "A");
        }
        end_time = System.nanoTime();

        test1 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.set(0, "A");
        }
        end_time = System.nanoTime();

        test2 = end_time-start_time;

        start_time = System.nanoTime();
        for(int i = 0;i < N;i++){
            list.set(0, "A");
        }
        end_time = System.nanoTime();

        test3 = end_time-start_time;

        list.clear();

        return(test1+test2+test3)/3;
    }
}
