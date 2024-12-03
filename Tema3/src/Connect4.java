import java.util.Scanner;

public class Connect4 {
    public static void main(String[] args) {
        final int N = 4; // Board size
        final char EMPTY = '-';
        final char PLAYER1 = 'X';
        final char PLAYER2 = 'O';
        char[][] board = new char[N][N];

        // Initialize the board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = EMPTY;
            }
        }

        boolean gameWon = false;
        boolean player1Turn = true;
        boolean boardFull = false;

        Scanner scanner = new Scanner(System.in);

        while (!gameWon && !boardFull) {
            // Display the board
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }

            // Current player's turn
            System.out.println("Turno del " + (player1Turn ? "Jugador 1 (X)" : "Jugador 2 (O)"));
            System.out.print("Elige una columna (0-" + (N - 1) + "): ");
            int column = scanner.nextInt();

            // Validate column input and find the first empty row in that column
            boolean validMove = false;
            for (int row = N - 1; row >= 0; row--) {
                if (column >= 0 && column < N && board[row][column] == EMPTY) {
                    board[row][column] = player1Turn ? PLAYER1 : PLAYER2;
                    validMove = true;
                    break; // Valid move; no need to check other rows
                }
            }

            if (!validMove) {
                System.out.println("Movimiento no válido. Inténtalo de nuevo.");
            } else {
                // Check if the current player has won
                gameWon = checkWinner(board, player1Turn ? PLAYER1 : PLAYER2, N);

                // Check if the board is full
                boardFull = true;
                for (int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (board[i][j] == EMPTY) {
                            boardFull = false;
                        }
                    }
                }

                // Switch turn
                player1Turn = !player1Turn;
            }
        }

        scanner.close();

        // Display the final board
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }

        if (gameWon) {
            System.out.println("¡" + (player1Turn ? "Jugador 2 (O)" : "Jugador 1 (X)") + " gana!");
        } else {
            System.out.println("¡Empate! El tablero está lleno.");
        }
    }

    private static boolean checkWinner(char[][] board, char checker, int N) {
        // Check rows
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= N - 4; j++) {
                if (board[i][j] == checker && board[i][j + 1] == checker &&
                    board[i][j + 2] == checker && board[i][j + 3] == checker) {
                    return true;
                }
            }
        }

        // Check columns
        for (int j = 0; j < N; j++) {
            for (int i = 0; i <= N - 4; i++) {
                if (board[i][j] == checker && board[i + 1][j] == checker &&
                    board[i + 2][j] == checker && board[i + 3][j] == checker) {
                    return true;
                }
            }
        }

        // Check diagonals (top-left to bottom-right)
        for (int i = 0; i <= N - 4; i++) {
            for (int j = 0; j <= N - 4; j++) {
                if (board[i][j] == checker && board[i + 1][j + 1] == checker &&
                    board[i + 2][j + 2] == checker && board[i + 3][j + 3] == checker) {
                    return true;
                }
            }
        }

        // Check diagonals (bottom-left to top-right)
        for (int i = 3; i < N; i++) {
            for (int j = 0; j <= N - 4; j++) {
                if (board[i][j] == checker && board[i - 1][j + 1] == checker &&
                    board[i - 2][j + 2] == checker && board[i - 3][j + 3] == checker) {
                    return true;
                }
            }
        }

        return false;
    }
}