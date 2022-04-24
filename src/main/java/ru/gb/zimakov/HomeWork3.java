package ru.gb.zimakov;

public class HomeWork3 {
    public static void main(String[] args) {
        invert();
        empty();
        change();
        create();
        foo(5,3);
        minMax();
    }
    public static void invert(){
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] == 1){
                arr [i] = 0;
            } else {
                arr [i] = 1;
            }
            System.out.print(arr [i]);
        }
        System.out.println();
    }
    public static void empty(){
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr [i] = i + 1;
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
    }
    public static void change(){
        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr [i] < 6) {
                arr [i] *= 2;
            }System.out.println(arr [i]);
        }
    }
    public static void create(){
        int[][] arr = new int [5][5];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++){
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void foo(int len, int initialValue) {
        int[] arr = new int[len];
        for(int i = 0; i < len; i ++) {
            arr [i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        System.out.println();
    }

    public static void minMax() {
        int[] arr = {1,4,8,-2,4,7,-14,3};
        int max, min;
        max =arr[0];
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(max + " " + min);
    }
}
