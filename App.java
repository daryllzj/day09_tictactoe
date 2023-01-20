package sdf;

import java.io.Console;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        String[] tttboard = new String[9];

        String winner = null;

        TicTacToe ttt = new TicTacToe();

        String turn = "X";

        for (int i = 0; i < tttboard.length; i++) {
            tttboard[i] = String.valueOf(i + 1);
        }

        ttt.printBoard(tttboard);

        System.out.println("Tic-Tac-Toe Game");
        System.out.println("X will go first");

        Console cons = System.console();

        while (winner == null) {

            int slot;
            String input = cons.readLine("> ");

            try {
                slot = Integer.parseInt(input);

                if (slot < 0 || slot >= 9) {

                    System.out.println("invalid input. within 1 to 9");
                    continue;
                }

                if (tttboard[slot - 1].equals(
                        String.valueOf(slot))) {
                    tttboard[slot - 1] = turn;

                    if (turn.equals("X")) {
                        turn = "O";
                    } else {
                        turn = "X";
                    }
                } else {
                    System.out.println(
                            "Slot already taken; re-enter slot number:");
                }

                System.out.println(
                        turn + "'s turn; enter a slot number to place "
                                + turn + " in:");

            } catch (Exception e) {
                System.out.println("invaid input. key numbers only");
            }

            ttt.printBoard(tttboard);
            winner = ttt.checkWinner(tttboard);

        }

        if (winner.equalsIgnoreCase("draw")) {
            System.out.println(
                    "It's a draw! Thanks for playing.");
        }

        // For winner -to display Congratulations! message.
        else {
            System.out.println(
                    "Congratulations! " + winner
                            + "'s have won! Thanks for playing.");
        }

    }
}
