package org.example;

public class Game {
    final int ROWS = 10;
    final int COLS = 10;
    String[][] gameBoard;

    // constructor for game board
    public Game() {
        gameBoard = new String[ROWS][COLS];
        initializeGameBoard();
    }

    // 🌱 for cells
    private void initializeGameBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                gameBoard[i][j] = "🌱";
            }
        }
    }

    // method that show board in console
    public void printGameBoard() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                System.out.print(gameBoard[i][j]);
            }
            System.out.println();
        }
    }

    // for Buildings on the board
    public void placeBuilding(int x, int y, String symbol) {
        if (x >= 0 && x < ROWS && y >= 0 && y < COLS) {
            if (gameBoard[x][y].equals("🌱")) {  // check, if the cell is frei
                gameBoard[x][y] = symbol;
                System.out.println("The building is built.");
            } else {
                System.out.println("This place is already occupied! Choose another one.");
            }
        } else {
            System.out.println("Incorrect coordinates!");
        }
    }
}
