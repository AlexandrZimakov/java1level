package ru.gb.zimakov;

public class HomeWorkApp {
    public static void main (String[] args) {
        System.out.println(check(6,7));
        number(0);
        System.out.println(examination(8));
        print("Home", 3);
    }
    public static boolean check ( int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        }
        return false;
    }
    public static void number (int c)  {
        if(c <= -1){
            System.out.println("Отрацательное число");
        } else {
            System.out.println("Положительное число");
        }
    }
    public static boolean examination (int d) {
        if (d <= -1) {
            return true;
        }
        return false;
    }
    public static void print (String word, int times) {
        for(int i = 1; i <= times; i++ ) {
            System.out.println("" + word);
        }
    }
}
