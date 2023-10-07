package Chess;

import java.util.Scanner;

public class ChessBoard {
    String[][] board = new String[8][8];

    public void assignSquaresBlackAndWhite() {
        if (flipped()) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[7][0] = ConsoleColors.WHITE_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.BLACK_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.BLACK_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.WHITE_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.WHITE_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.BLACK_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.BLACK_BACKGROUND + "WK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.WHITE_BACKGROUND + "WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.WHITE_BACKGROUND + "WP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.BLACK_BACKGROUND + "WP" + ConsoleColors.RESET;
                }

            }
            this.board[0][0] = ConsoleColors.BLACK_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.WHITE_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.WHITE_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.BLACK_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.BLACK_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.WHITE_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.WHITE_BACKGROUND + "BK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.BLACK_BACKGROUND + "BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.BLACK_BACKGROUND + "BP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.WHITE_BACKGROUND + "BP" + ConsoleColors.RESET;
                }

            }
        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[0][0] = ConsoleColors.WHITE_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.BLACK_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.BLACK_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.WHITE_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.WHITE_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.BLACK_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.BLACK_BACKGROUND + "WK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.WHITE_BACKGROUND + "WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.WHITE_BACKGROUND + "WP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.BLACK_BACKGROUND + "WP" + ConsoleColors.RESET;
                }

            }
            this.board[7][0] = ConsoleColors.BLACK_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.WHITE_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.WHITE_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.BLACK_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.BLACK_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.WHITE_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.WHITE_BACKGROUND + "BK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.BLACK_BACKGROUND + "BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.BLACK_BACKGROUND + "BP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.WHITE_BACKGROUND + "BP" + ConsoleColors.RESET;
                }

            }
        }

        // return this.board;
    }

    public void assignSquaresRedAndWhite() {
        if (flipped()) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.RED_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[7][0] = ConsoleColors.WHITE_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.RED_BACKGROUND + "WR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.RED_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.WHITE_BACKGROUND + "WN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.WHITE_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.RED_BACKGROUND + "WB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.RED_BACKGROUND + "WK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.WHITE_BACKGROUND + "WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.WHITE_BACKGROUND + "WP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.RED_BACKGROUND + "WP" + ConsoleColors.RESET;
                }

            }
            this.board[0][0] = ConsoleColors.RED_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.WHITE_BACKGROUND + "BR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.WHITE_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.RED_BACKGROUND + "BN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.RED_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.WHITE_BACKGROUND + "BB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.WHITE_BACKGROUND + "BK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.RED_BACKGROUND + "BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.RED_BACKGROUND + "BP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.WHITE_BACKGROUND + "BP" + ConsoleColors.RESET;
                }

            }
        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[0][0] = ConsoleColors.WHITE_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.BLACK_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.BLACK_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.WHITE_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.WHITE_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.BLACK_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.BLACK_BACKGROUND + " WK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.WHITE_BACKGROUND + " WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.WHITE_BACKGROUND + " WP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.BLACK_BACKGROUND + " WP" + ConsoleColors.RESET;
                }

            }
            this.board[7][0] = ConsoleColors.BLACK_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.WHITE_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.WHITE_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.BLACK_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.BLACK_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.WHITE_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.WHITE_BACKGROUND + " BK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.BLACK_BACKGROUND + " BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.BLACK_BACKGROUND + " BP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.WHITE_BACKGROUND + " BP" + ConsoleColors.RESET;
                }

            }
        }

        // return this.board;
    }

    public void assignSquaresPurpleAndGreen() {
        if (flipped()) {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.PURPLE_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.GREEN_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[7][0] = ConsoleColors.GREEN_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.PURPLE_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.PURPLE_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.GREEN_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.GREEN_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.PURPLE_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.PURPLE_BACKGROUND + " WK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.GREEN_BACKGROUND + " WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.GREEN_BACKGROUND + " WP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.PURPLE_BACKGROUND + " WP" + ConsoleColors.RESET;
                }

            }
            this.board[0][0] = ConsoleColors.PURPLE_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.GREEN_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.GREEN_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.PURPLE_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.PURPLE_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.GREEN_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.GREEN_BACKGROUND + " BK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.PURPLE_BACKGROUND + " BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.PURPLE_BACKGROUND + " BP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.GREEN_BACKGROUND + " BP" + ConsoleColors.RESET;
                }

            }
        } else {
            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {
                    if (i % 2 == j % 2) {
                        board[i][j] = ConsoleColors.WHITE_BACKGROUND + "   " + ConsoleColors.RESET;
                    } else {
                        board[i][j] = ConsoleColors.BLACK_BACKGROUND + "   " + ConsoleColors.RESET;
                    }
                }
            }
            this.board[0][0] = ConsoleColors.WHITE_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[0][7] = ConsoleColors.BLACK_BACKGROUND + " WR" + ConsoleColors.RESET;
            this.board[0][1] = ConsoleColors.BLACK_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[0][6] = ConsoleColors.WHITE_BACKGROUND + " WN" + ConsoleColors.RESET;
            this.board[0][2] = ConsoleColors.WHITE_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[0][5] = ConsoleColors.BLACK_BACKGROUND + " WB" + ConsoleColors.RESET;
            this.board[0][3] = ConsoleColors.BLACK_BACKGROUND + " WK" + ConsoleColors.RESET;
            this.board[0][4] = ConsoleColors.WHITE_BACKGROUND + " WQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[1][i] = ConsoleColors.WHITE_BACKGROUND + " WP" + ConsoleColors.RESET;
                } else {
                    this.board[1][i] = ConsoleColors.BLACK_BACKGROUND + " WP" + ConsoleColors.RESET;
                }

            }
            this.board[7][0] = ConsoleColors.BLACK_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[7][7] = ConsoleColors.WHITE_BACKGROUND + " BR" + ConsoleColors.RESET;
            this.board[7][1] = ConsoleColors.WHITE_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[7][6] = ConsoleColors.BLACK_BACKGROUND + " BN" + ConsoleColors.RESET;
            this.board[7][2] = ConsoleColors.BLACK_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[7][5] = ConsoleColors.WHITE_BACKGROUND + " BB" + ConsoleColors.RESET;
            this.board[7][3] = ConsoleColors.WHITE_BACKGROUND + " BK" + ConsoleColors.RESET;
            this.board[7][4] = ConsoleColors.BLACK_BACKGROUND + " BQ" + ConsoleColors.RESET;
            for (int i = 0; i < 8; i++) {
                if (i % 2 == 1) {
                    this.board[6][i] = ConsoleColors.BLACK_BACKGROUND + " BP" + ConsoleColors.RESET;
                } else {
                    this.board[6][i] = ConsoleColors.WHITE_BACKGROUND + " BP" + ConsoleColors.RESET;
                }

            }
        }

        // return this.board;
    }

    public void chooseColor() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 for red-white, 2 for purple-green: ");

        if (scanner.nextLine().equals("2"))
            assignSquaresPurpleAndGreen();

        else if (scanner.nextLine().equals("1"))
            assignSquaresRedAndWhite();

        else
            assignSquaresBlackAndWhite();
    }

    public boolean flipped() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1 if you want to flip the board. ");
        if (scanner.nextLine().equals("1")) {
            return true;
        }
        return false;

    }

    public String toString() {
        String string = "";
        for (int i = 0; i < 8; i++) {
            string += "|";
            for (int j = 0; j < 7; j++) {
                string += board[i][j] + "  ";
            }
            string += board[i][7] + "|\n";
            // string += '\n';
        }
        return string;
    }

    public static void main(String[] args) {
        ChessBoard chess = new ChessBoard();
        chess.chooseColor();
        System.out.println(chess);
    }
}
