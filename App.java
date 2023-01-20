package sdf;

import java.io.Console;

public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        
        String[] tttboard = new String[9];

        String winner = null;

        TicTacToe ttt = new TicTacToe();

        for (int i = 0; i < tttboard.length; i++) {
            tttboard[i] = String.valueOf(i +1);
        }

        ttt.printBoard(tttboard);

        Console cons = System.console();

        while (winner == null) {

            int slot;
            String input = cons.readLine(">");

            try {
                slot = Integer.parseInt(input);

                if (slot < 0 || slot >= 9) {

                    System.out.println("invalid input. within 1 to 9");
                    continue;
                }

            } catch (Exception e) {
                System.out.println("invaid input. key numbers only");
            }
            
            winner = ttt.checkWinner(tttboard);
        }

    }
}
