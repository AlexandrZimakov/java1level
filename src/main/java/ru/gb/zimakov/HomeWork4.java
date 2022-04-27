package ru.gb.zimakov;
import java.util.Random;
import java.util.Scanner;

public class HomeWork4 {
    public static int SIZE = 5;
    private final static int DOTS_COUNT_TO_WIN = 4;
    public static final char DOT_EMPTY = '•';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static char[][] map;
    public static Scanner sc = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Победил человек");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
            aiTurn();
            printMap();
            if (checkWin(DOT_O)) {
                System.out.println("Победил Искуственный Интеллект");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }
        System.out.println("Игра закончена");
    }

    public static boolean checkWin(char symb) {
        int count = 0;
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; i++) {
                if (map[i][j] == symb) {
                    count++;
                } else {
                    break;
                }
            }
            if (count == DOTS_COUNT_TO_WIN) {
                return true;
            }
            count = 0;
        }
        int goriz = 0;
        for (int j = 0; j < map.length; j++) {
            for (int i = 0; i < map[i].length; j++) {
                if (map[j][i] == symb) {
                    goriz++;
                } else {
                    break;
                }
            }
            if (goriz == DOTS_COUNT_TO_WIN) {
                return true;
            }
            goriz = 0;
        }

        for (int j = 0; j < map.length; j++) {
            int dia = 0;
            for (int i = 0; i < map[j].length; i++) {
                int k = j + i;
                if (k < map.length) {
                    if (map[i][k] == symb) {
                        dia++;
                    } else {
                        break;
                    }
                    if (dia == DOTS_COUNT_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        for (int j = 0; j < map.length; j++) {
            int dia = 0;
            for (int i = 0; i < map[j].length; i++) {
                int k = j + i;
                if (k < map.length) {
                    if (map[k][i] == symb) {
                        dia++;
                    } else {
                        break;
                    }
                    if (dia == DOTS_COUNT_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        for (int j = 0; j < map.length; j++) {
            int diago = 0;
            for (int i = 0; i < map[j].length; i++) {
                int k = (map.length - 1) - i;
                int l = j + i;
                if (k >= 0 && l < map.length) {
                    if (map[l][k] == symb) {
                        diago++;
                    } else {
                        break;
                    }
                    if (diago == DOTS_COUNT_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        for (int j = 1; j < map.length; j++) {
            int diago = 0;
            for (int i = 0; i < map[j].length; i++) {
                int k = (map.length - 1) - j - i;
                if (k >= 0) {
                    if (map[i][k] == symb) {
                        diago++;
                    } else {
                        break;
                    }
                    if (diago == DOTS_COUNT_TO_WIN) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) return false;
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = rand.nextInt(SIZE);
            y = rand.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.println("Компьютер походил в точку " + (x + 1) + " " + (y + 1));
        map[y][x] = DOT_O;
    }

    public static void humanTurn() {
        int x, y;
        do {
            System.out.println("Введите координаты в формате X -диаг. Y-вертик.");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) return false;
        if (map[y][x] == DOT_EMPTY) return true;
        return false;
    }

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
