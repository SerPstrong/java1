package lesson4.hw;

import java.util.Random;
import java.util.Scanner;

public class XOGame {

    static final String ANSI_RESET = "\u001B[0m"; //������ ����
    static final String ANSI_BLUE = "\u001B[34m"; //����� ����
    static final String ANSI_RED = "\u001B[31m";  //������� ���� - ��������� ���

    static final int SIZE_X = 9;
    static final int SIZE_Y = 9;
    static final int DOTS_TO_WIN = 5;

    static final char DOT_X = 'X';
    static final char DOT_O = 'O';
    static final char DOT_EMPTY = '.';

    static char[][] map;

    static long baseKarma = (long) Math.pow(5, DOTS_TO_WIN);

    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    static int lastHumanX = -1;
    static int lastHumanY = -1;
    static int lastAiX = -1;
    static int lastAiY = -1;

    public static void main(String[] args) {
        initMap();

        System.out.println(ANSI_BLUE + "����� ���������� � ���� ��������-������!" + ANSI_RESET);
        System.out.println("������: ��������� ����� �� " + ANSI_BLUE + DOTS_TO_WIN + ANSI_RESET + " �������� � ���.");
        System.out.println(ANSI_BLUE + "X" + ANSI_RESET + " - �������, " + ANSI_BLUE + "O" + ANSI_RESET + " - ���������.");
        System.out.println("�� �������� � ���� ����!");
        printMap();

        while (true) {

            humanTurn();
            if (checkWin(DOT_X)) {
                printMap();
                System.out.println("�� ��������!!!");
                break;
            }

            if (isFull()) {
                printMap();
                System.out.println("�����!");
                break;
            }

            aiTurn();
            printMap();

            if (checkWin(DOT_O)) {
                System.out.println("������������� ��������� �������!!!");
                break;
            }

            if (isFull()) {
                System.out.println("�����!");
                break;
            }
        }
    }

    private static void initMap() {
        map = new char[SIZE_Y][SIZE_X];
        clearMap();
    }

    private static void clearMap() {
        for (int y = 0; y < SIZE_Y; y++) {
            for (int x = 0; x < SIZE_X; x++) {
                map[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printMap() {
        System.out.println();
        System.out.print("  ");
        System.out.print(ANSI_BLUE);
        for (int x = 1; x <= SIZE_X; x++) {
            System.out.print(x + " ");
        }
        System.out.print(ANSI_RESET);
        System.out.println();
        for (int y = 0; y < SIZE_Y; y++) {
            System.out.print(ANSI_BLUE + (y + 1) + ANSI_RESET + " ");
            for (int x = 0; x < SIZE_X; x++) {
                if (((y == lastHumanY) && (x == lastHumanX)) || ((y == lastAiY) && (x == lastAiX))) {
                    System.out.print(ANSI_RED + map[y][x] + ANSI_RESET + " ");
                } else {
                    System.out.print(map[y][x] + " ");
                }
            }
            System.out.println();
        }

    }

    private static void humanTurn() {
        int x, y;
        do {
            System.out.println("������� ���������� � ������� Y X (��� �������)");
            y = sc.nextInt() - 1;
            x = sc.nextInt() - 1;
        } while (!isCellValid(y, x));
        lastHumanY = y;
        lastHumanX = x;
        map[y][x] = DOT_X;
    }

    private static boolean isCellValid(int y, int x) {
        if (x < 0 || y < 0 || x >= SIZE_X || y >= SIZE_Y) {
            return false;
        }
        return map[y][x] == DOT_EMPTY;
    }

    private static void aiTurn() {
        int x, y;
        long currentKarma, maxKarma;
        int maxKarmaX = 0, maxKarmaY = 0;

        //1-� ������: ���� ���� ����������� - ��������
        for (y = 0; y < SIZE_Y; y++) {
            for (x = 0; x < SIZE_X; x++) {
                if (isCellValid(y, x)) {
                    map[y][x] = DOT_O;
                    if (checkWin(DOT_O)) {
                        lastAiX = x;
                        lastAiY = y;
                        return;  //��� � ������ ������ - ��������� �������!
                    }
                    map[y][x] = DOT_EMPTY;
                }
            }
        }
        //�������� �� �������. ������ 2 - �� ���������
        for (y = 0; y < SIZE_Y; y++) {
            for (x = 0; x < SIZE_X; x++) {
                if (isCellValid(y, x)) {
                    map[y][x] = DOT_X;
                    if (checkWin(DOT_X)) {
                        map[y][x] = DOT_O; //���� ��������� ����� ������� ����� �������� - ���������
                        lastAiX = x;
                        lastAiY = y;
                        return;
                    }
                    map[y][x] = DOT_EMPTY;
                }
            }
        }

        //������ 3 - ������� �������� ����������� �������
        //���������� ������ �� ���� � ������ �� ��������� ����� � ���������� �������� �������� ����
        //������ ���������� �� ��������� � ������ getKarma() (�������� � ������ ������� ����������)
        maxKarma = -1;
        for (y = 0; y < SIZE_Y; y++) {
            for (x = 0; x < SIZE_X; x++) {
                if (isCellValid(y, x)) {
                    //�����, � profitForAI() � damageForHuman() ����� �������� ������� ������������ � �����
                    //��������� ���������� ����� �������� ���� � ������� "��������" ���� � ������� "���������".
                    //������������ ����� ���� �������� ����������� 2 � ������ "��������"
                    currentKarma = profitForAI(y, x) * 2 + damageForHuman(y, x);
                    if (currentKarma > maxKarma) {
                        maxKarma = currentKarma;
                        maxKarmaY = y;
                        maxKarmaX = x;
                    }
                }
            }
        }

        lastAiX = maxKarmaX;
        lastAiY = maxKarmaY;
        map[maxKarmaY][maxKarmaX] = DOT_O; //����� � ���� � ������������ ������
    }

    private static long profitForAI(int y, int x) {
        return getKarma(y, x, DOT_O, DOT_X);
    }

    private static long damageForHuman(int y, int x) {
        return getKarma(y, x, DOT_X, DOT_O);
    }


    private static long getKarma(int y, int x, char goodSymbol, char wallSymbol) {
        long karma = 0;
        karma += getLineKarma(y, x, goodSymbol, wallSymbol, 0, 1);
        karma += getLineKarma(y, x, goodSymbol, wallSymbol, 1, 0);
        karma += getLineKarma(y, x, goodSymbol, wallSymbol, 1, 1);
        karma += getLineKarma(y, x, goodSymbol, wallSymbol, 1, -1);
        return karma;
    }

    private static long getLineKarma(int startY, int startX, char goodSymbol, char wallSymbol, int stepY, int stepX) {
        //������� � ����� �� ������ goodSymbol, ������� ��������� �� ������ �����
        //� ������ ��������� �� ���������� �� ����� DOTS_TO_WIN-1 (� ������������ (stepY, stepX) � (-stepY, -stepX))
        //�.�. ����� ���� goodSymbol � ������ (y, x) �� ������ ���� wallSymbol
        int i;
        int x, y;
        long karma1 = 0;  //� ����������� (stepY, stepX)
        long karma2 = 0;  //� ����������� (-stepY, -stepX)
        long karma3 = 0;  //����� �� ������� ����������
        long profitKarma = 0; //�������� �����
        double temp;
        int maxLength;  //����� ����������� ��������� ����� � ������ ������������
        //���� DOTS_TO_WIN ����������, �� ����� �� �������
        int goodCount;

        //���� � ������� stepY, stepX
        maxLength = 1;
        x = startX;
        y = startY;
        goodCount = 0;
        for (i = 1; i < DOTS_TO_WIN; i++) {
            x += stepX;
            y += stepY;
            if (x < 0 || x >= SIZE_X || y < 0 || y >= SIZE_Y) break; //����� �� ������� ����
            if (map[y][x] == wallSymbol) break;
            if (map[y][x] == goodSymbol) {
                goodCount++;  //������� goodSymbol
                karma1 += 2 * DOTS_TO_WIN / i; //������� ������� �� ���������� (�� ������, ����� ������� ����� � ����������)
            }
            maxLength++;
        }
        //������� �� ����� ����������
        if (goodCount > 0) {
            karma1 += baseKarma / Math.pow(5, DOTS_TO_WIN - goodCount); //��� ������ ������ - ��� ������ �����
        }

        //���� � ������� -stepY, -stepX
        x = startX;
        y = startY;
        goodCount = 0;
        for (i = 1; i < DOTS_TO_WIN; i++) {
            x -= stepX;
            y -= stepY;
            if (x < 0 || x >= SIZE_X || y < 0 || y >= SIZE_Y) break; //����� �� ������� ����
            if (map[y][x] == wallSymbol) break;
            if (map[y][x] == goodSymbol) {
                goodCount++;  //������� goodSymbol
                karma2 += 2 * DOTS_TO_WIN / i; //������� ������� �� ���������� (�� ������, ����� ������� ����� � ����������)
            }
            maxLength++;
        }

        if (goodCount > 0) {
            karma2 += baseKarma / Math.pow(5, DOTS_TO_WIN - goodCount); //��� ������ ������ - ��� ������ �����
        }

        //����� ����������� ������ ���� ������������ ����� ���������� ���� ������ ���� ����� DOTS_TO_WIN
        if (maxLength >= DOTS_TO_WIN) {
            if (karma1 > 0 && karma2 > 0) { //���� � ��� � ������ ����������� ���� goodSymbols
                karma3 = (karma1 + karma2) / 2; //����� �� ������� ����������
            }
            profitKarma = karma1 + karma2 + karma3;
        }

        return profitKarma; //���������� ����������� (�����������)
    }

    public static boolean isFull() {
        for (int y = 0; y < SIZE_Y; y++) {
            for (int x = 0; x < SIZE_X; x++) {
                if (map[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkWin(char symbol) {

        for (int y = 0; y < SIZE_Y; y++) {
            for (int x = 0; x < SIZE_X; x++) {
                //�������, � ����� ������������ ����� ��������� �� ��������� ����� (y, x)
                if (x <= SIZE_X - DOTS_TO_WIN) {  //����� ��������� ������
                    if (checkRow(y, x, 0, 1, symbol)) return true;
                    if (y <= SIZE_Y - DOTS_TO_WIN) { //����� ��������� ������ � ����
                        if (checkRow(y, x, 1, 1, symbol)) return true;
                    }
                    if (y >= DOTS_TO_WIN - 1) { //����� ��������� ������ � �����
                        if (checkRow(y, x, -1, 1, symbol)) return true;
                    }
                }
                if (y <= SIZE_Y - DOTS_TO_WIN) { //����� ��������� ����
                    if (checkRow(y, x, 1, 0, symbol)) return true;
                }
            }
        }
        return false;
    }

    public static boolean checkRow(int startY, int startX, int stepY, int stepX, char symbol) {
        for (int i = 0; i < DOTS_TO_WIN; i++) {
            if (map[startY][startX] != symbol) return false;
            startY += stepY;
            startX += stepX;
        }
        return true;
    }

}