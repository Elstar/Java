package sergiy.dmb;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        // The type of game 0 - PvP, 1 - CvP
        byte gameType = 0;
        Random randomStep = new Random();
        byte winner = 2;
        int whoNextStep;
        char[] plauerSigns = {'x', '0'};
        char[][] square = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        gameType = getGameType();
        whoNextStep = randomStep.nextInt(2);
        while (winner == 2) {
            if (gameType == 0) {
                //PvP
                getCoordinatesFromPlayer(plauerSigns[whoNextStep], square);
            } else {
                //CvP
                if (whoNextStep == 0) {
                    getCoordinatesFromComputer(plauerSigns[whoNextStep], square);
                    System.out.println("Ход сделал компьютер");
                } else
                    getCoordinatesFromPlayer(plauerSigns[whoNextStep], square);
            }
            showSquare(square);
            if (whoNextStep == 0) whoNextStep++;
            else whoNextStep--;
            winner = isWinnerHave(square);
        }

        if (winner == 3)
            System.out.println("Ничия!");
        else
            System.out.println("Победил " + plauerSigns[winner] + "!");
    }

    static void showSquare(char[][] square) {
        for(int i=0; i<square.length; i++) {
            System.out.println(String.format("%c %c %c", square[i][0], square[i][1], square[i][2]));
        }
    }

    /**
     * Check field for free
     * @return
     */
    static boolean checkFieldIsFree(char[][] square, int x, int y) {
        if (square[x][y] == '-') {
            return true;
        } else {
            return false;
        }
    }

    /**
     * 0 - x is winner, 1 - y is winner, 2 - have no winner, 3 - both winner
     * @param square
     * @return
     */
    static byte isWinnerHave(char[][] square) {
        byte winner = 2;
        char[] equelString = new char[3];
        for (int i=0; i<3; i++) {
            //Проверка горизонтальных линий
            equelString = square[i];
            winner = whoIsWinner(equelString);
            if (winner<2) return winner;

            //Проверка вертикальных линий
            equelString = setEqualString(square[0][i], square[1][i], square[2][i]);
            winner = whoIsWinner(equelString);
            if (winner<2) return winner;
        }
        equelString = setEqualString(square[0][0], square[1][1], square[2][2]);
        winner = whoIsWinner(equelString);
        if (winner<2) return winner;

        equelString = setEqualString(square[0][2], square[1][1], square[2][0]);
        winner = whoIsWinner(equelString);
        if (winner<2) return winner;
        if (noHaveFreeField(square)) return 3;
        return 2;
    }

    static boolean noHaveFreeField(char[][] square) {
        for (char[] line:square) {
            for (char field:line) {
                if (field == '-') return false;
            }
        }
        return true;
    }

    static byte whoIsWinner(char[] equelString) {
        char[][] winnerLines = {
                {'x', 'x', 'x'},
                {'0', '0', '0'}
        };
        if (Arrays.equals(equelString, winnerLines[0])) return 0;
        if (Arrays.equals(equelString, winnerLines[1])) return 1;
        return 2;
    }

    static char[] setEqualString(char a, char b, char c) {
        char[] equelString = {a, b, c};
        return equelString;
    }

    static byte getGameType() {
        Scanner sc = new Scanner(System.in);
        byte gameType;

        System.out.println("Введите 0 для игры с человеком или 1 для игры с компьютером");
        do {
            while (!sc.hasNextByte()) {
                System.out.println("Ошибка при вводе типа игры. Введите 0 или 1");
                sc.next();
            }
            gameType = sc.nextByte();
            if (gameType != 0 && gameType != 1) {
                System.out.println("Ошибка при вводе типа игры. Введите 0 или 1");
            }
        } while (gameType !=0 && gameType != 1);

        if (gameType == 0) {
            System.out.println("Спасибо за выбор. Вы будете играть с другим игроком");
        } else {
            System.out.println("Спасибо за выбор. Вы будете играть с компьютером");
        }
        System.out.println("Ввод координат нужно делать в формате строка/столбец, пример 11, 13, 22 ...");

        return gameType;
    }

    static void getCoordinatesFromPlayer(char stepBy, char[][] square) {
        Scanner sc = new Scanner(System.in);
        int coordStep;
        int x, y;

        System.out.print("Ходит " + stepBy + " введите координаты хода: ");
        do {
            while (!sc.hasNextInt()) {
                System.out.println("Ошибка при вводе координат хода");
                sc.next();
            }
            coordStep = sc.nextInt();
            if (!isCoordinatesRight(coordStep)) {
                System.out.println("Ошибка при вводе координат хода");
            }
        } while (!isCoordinatesRight(coordStep));

        x = coordStep / 10 -1;
        y = coordStep % 10 -1;

        if (checkFieldIsFree(square, x, y)) square[x][y] = stepBy;
        else {
            System.out.println("Данная клетка уже занята введите координату свободной клетки");
            getCoordinatesFromPlayer(stepBy, square);
        }
    }
    
    static boolean isCoordinatesRight(int coord) {
        int[] trueCoord = {11, 12, 13, 21, 22, 23, 31, 32, 33};
        for (int coordinate:trueCoord)
            if (coordinate == coord) return true;
        return false;
    }

    static void getCoordinatesFromComputer(char stepBy, char[][] square) {
        int x, y;
        Random random = new Random();
        x = random.nextInt(3);
        y = random.nextInt(3);
        if (checkFieldIsFree(square, x, y)) square[x][y] = stepBy;
        else {
            getCoordinatesFromComputer(stepBy, square);
        }
    }
}
