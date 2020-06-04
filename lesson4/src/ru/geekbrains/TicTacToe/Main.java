package ru.geekbrains.TicTacToe;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static final char DOT_EMPTY = ' ';
    private static final char DOT_AI = 'O';
    private static final char DOT_HUMAN = 'X';
    private static int fieldSizeX;
    private static int fieldSizeY;
    private static char[][] field;
    private static final Scanner SCANNER = new Scanner(System.in);
    private static final Random RANDOM = new Random();

    public static void main(String[] args) {
        int fieldSize = 3;
        while (true) {
            init(fieldSize);
            printField();
            playOnce(fieldSize);
            System.out.println("Играть сначала?");
            if (SCANNER.next().equals("no")) {
                break;
            }
        }
    }

    private static void playOnce(int fieldSize) {
        while (true) {
            humanTurn();
            printField();
            if (isWinnerExists(DOT_HUMAN)) {
                System.out.println("Победил Игрок!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }

            aiTurn();
            printField();
            if (isWinnerExists(DOT_AI)) {
                System.out.println("Победил Компьютер!");
                break;
            }
            if (isDraw()) {
                System.out.println("Ничья!");
                break;
            }

        }
    }

    private static void init(int fieldSize) {
        fieldSizeX = fieldSize;
        fieldSizeY = fieldSize;

        field = new char[fieldSizeY][fieldSizeX];

        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                field[y][x] = DOT_EMPTY;
            }
        }
    }

    private static void printField() {
        System.out.println("=============");

        for (int y = 0; y < fieldSizeY; y++) {
            System.out.print("| ");
            for (int x = 0; x < fieldSizeX; x++) {
                System.out.print(field[y][x] + " | ");
            }
            System.out.println();
        }
    }

    private static boolean isValidField(int x, int y) {
        return x >= 0 && x < fieldSizeX && y >= 0 && y < fieldSizeY;
    }

    private static boolean isNotEmptyField(int x, int y) {
        return field[y][x] != DOT_EMPTY;
    }

    private static void humanTurn() {
        int x;
        int y;
        do {
            System.out.print("Введите координаты хода X и Y (от 1 до " + fieldSizeY + ") через пробел >>> ");
            x = SCANNER.nextInt() - 1;
            y = SCANNER.nextInt() - 1;
        } while (!isValidField(x, y) || isNotEmptyField(x, y));
        field[y][x] = DOT_HUMAN;
    }

    private static void aiTurn() {
        int x;
        int y;
        do {
            x = RANDOM.nextInt(fieldSizeX);
            y = RANDOM.nextInt(fieldSizeY);
        } while (isNotEmptyField(x, y));
        field[y][x] = DOT_AI;
    }

    private static boolean isDraw() {
        for (int y = 0; y < fieldSizeY; y++) {
            for (int x = 0; x < fieldSizeX; x++) {
                if (field[y][x] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

   /* private static boolean isWinnerExists(char symb) {
        if (field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
        if (field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
        if (field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
        if (field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
        if (field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
        if (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }*/

    private static boolean isWinnerExists(char symb) {
        boolean cols, rows, diag1, diag2;
        for (int y = 0; y < fieldSizeY; y++) {
            cols = true;
            rows = true;
            for (int x = 0; x < fieldSizeX; x++) {
                cols &= (field[y][x] == symb);
                rows &= (field[x][y] == symb);
            }
            if (cols || rows) return true;
        }
        diag1 = true;
        diag2 = true;
        for (int i = 0; i < 3; i++) {
            diag1 &= (field[i][i] == symb);
            diag2 &= (field[3 - i - 1][i] == symb);
        }
        if (diag1 || diag2) return true;
        return false;
    }

    /*Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4
    private static boolean isWinnerExists(char symb) {
        boolean colsleft, colsright, rowsleft, rowsright, diagleft1, diagright1, diagleft2, diagright2;
        for (int y = 0; y < fieldSizeY; y++) {
            colsleft = true;
            colsright = true;
            rowsleft = true;
            rowsright = true;
            for (int x = 0; x < fieldSizeX - 1; x++) {
                colsleft &= (field[y][x] == symb);
                colsright &= (field[y][x + 1] == symb);
                rowsleft &= (field[x][y] == symb);
                rowsright &= (field[x + 1][y] == symb);
            }
            if (colsleft || colsright || rowsleft || rowsright) return true;
        }
        diagleft1 = true;
        diagright1 = true;
        diagleft2 = true;
        diagright2 = true;
        for (int i = 0; i < 4; i++) {
            diagleft1 &= (field[i][i] == symb);
            diagright1 &= (field[i + 1][i + 1] == symb);
            diagleft2 &= (field[5 - i - 1][i] == symb);
            diagright2 &= (field[5 - i - 2][i] == symb);
        }
        if (diagleft1 || diagright1 || diagleft2 || diagright2) return true;
        return false;
    }*/

}



