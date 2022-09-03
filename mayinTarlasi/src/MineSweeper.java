import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    private final char[][] minedMap; //Mayınlı
    private char[][] gameMap; //GameMap

    public MineSweeper(int rowNumber, int colNumber) {
        this.minedMap = createMinedMap(rowNumber, colNumber);
        this.gameMap = createEmptyMap(rowNumber, colNumber);
    }

    private char[][] createMinedMap(int rowNumber, int colNumber) {
        char[][] map = new char[rowNumber][colNumber];
        Random rnd = new Random();
        int totalMineCount = (rowNumber * colNumber / (4));
        System.out.println();

        for (int i = 0; i < rowNumber; i++) {
            for (int j = 0; j < colNumber; j++) map[i][j] = '-';
        }
        for (int k = 0; k < totalMineCount; ) {
            int randomRow = rnd.nextInt(map.length);
            int randomCol = rnd.nextInt(map[0].length);
            if (map[randomRow][randomCol] == '*') continue;
            map[randomRow][randomCol] = '*';
            k++;
        }
        System.out.println("Mayınların Konumu ve Toplam Mayın Sayısı : " + totalMineCount);
        printMap(map);
        System.out.println("===========================");
        return map;
    }

    private char[][] createEmptyMap(int rowNumber, int colNumber) {
        char[][] map = new char[rowNumber][colNumber];
        for (int i = 0; i < rowNumber; i++)
            for (int j = 0; j < colNumber; j++)
                map[i][j] = '-';
        return map;
    }

    public void startGame() {
        System.out.println("Mayın Tarlası Oyuna Hoşgeldiniz !");
        boolean isGameOver = false;
        int rowIndex, columnIndex, totalMoveCount = 0;
        Scanner scanner;
        while (!isGameOver) {
            //STEP1 - print gamemap
            printMap(gameMap);
            //STEP2 - input-ask -> row, column = LOCATION
            scanner = new Scanner(System.in);
            System.out.println("Satır Giriniz : ");
            rowIndex = scanner.nextInt();
            //STEP3 - check frame of location in "minedMap" and get mineCount in frame
            if (rowIndex < 0 || rowIndex >= gameMap.length) {
                System.out.println("Lütfen 0 ile " + (gameMap.length - 1) + " arasında satır sayısı giriniz");
                continue;
            }
            System.out.println("Sütun Giriniz : ");
            columnIndex = scanner.nextInt();
            if (columnIndex < 0 || columnIndex >= gameMap[0].length) {
                System.out.println("Lütfen 0 ile " + (gameMap[0].length - 1) + " arasında sütun sayısı giriniz");
                continue;
            }
            if (minedMap[rowIndex][columnIndex] == '*') {
                System.out.println("Game Over!!");
                isGameOver = true;
            } else if (gameMap[rowIndex][columnIndex] != '-' && gameMap[rowIndex][columnIndex] != '*') {
                System.out.println("Lütfen farklı bir satır ve sütun giriniz!!!");
                continue;
            } else {
                //STEP4 - set mineCount at location of "gameMap" and RETURN of STEP1
                int mineCountInFrame = 0;
                int minRowIndex = Math.max(rowIndex - 1, 0);
                int maxRowIndex = rowIndex + 1 >= minedMap.length ? rowIndex : rowIndex + 1;

                int minColIndex = Math.max(columnIndex - 1, 0);
                int maxColIndex = columnIndex + 1 >= minedMap[0].length ? columnIndex : columnIndex + 1;
                for (int i = minRowIndex; i <= maxRowIndex; i++) {
                    for (int j = minColIndex; j <= maxColIndex; j++) {
                        if (minedMap[i][j] == '*') mineCountInFrame++;
                    }
                }
                gameMap[rowIndex][columnIndex] = Character.forDigit(mineCountInFrame, 10);
//                gameMap[rowIndex][columnIndex] = (char) mineCountInFrame;
                totalMoveCount++;
            }
            if (totalMoveCount == (gameMap.length * gameMap[0].length - ((gameMap.length * gameMap[0].length) / 4))) {
                System.out.println("Oyunu Kazandınız !");
                printMap(gameMap);
                isGameOver = true;
            }
            System.out.println("===========================");
        }


    }

    private void printMap(char[][] map) {
        for (char[] chars : map) {
            for (char aChar : chars) System.out.print(aChar + " ");
            System.out.println();
        }
    }
}
