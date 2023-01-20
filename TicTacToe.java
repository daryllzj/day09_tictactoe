package sdf;

import java.util.Arrays;

public class TicTacToe {

    public void printBoard(String[] board) {

        System.out.println("|---|---|---|");
        System.out.println("| " + board[0] + " | "+ board[1] + " | "+ board[2] + " |");
        System.out.println("| " + board[3] + " | "+ board[4] + " | "+ board[5] + " |");
        System.out.println("| " + board[6] + " | "+ board[7] + " | "+ board[8] + " |");
        System.out.println("|---|---|---|");
    }


    public String checkWinner(String[] board) {

            String line = "";
            String winner = "";
        for (int a = 0; a < 8; a++) {
            
 
            switch (a) {
            case 0:
                line = board[0] + board[1] + board[2];
                break;
            case 1:
                line = board[3] + board[4] + board[5];
                break;
            case 2:
                line = board[6] + board[7] + board[8];
                break;
            case 3:
                line = board[0] + board[3] + board[6];
                break;
            case 4:
                line = board[1] + board[4] + board[7];
                break;
            case 5:
                line = board[2] + board[5] + board[8];
                break;
            case 6:
                line = board[0] + board[4] + board[8];
                break;
            case 7:
                line = board[2] + board[4] + board[6];
                break;
            }

            if (line.equals("XXX")) {
                winner = "X";
            }
            else if (line.equals("OOO")) {
                winner = "O";
            } else {
                for (int i = 0; i < board.length; i++) {
                    if (Arrays.asList(board).contains(String.valueOf(i+1))) {
                        break;
                    } else if (i == 8){
                        winner = "draw";
                    }
                }
            }
           
    
            }
            return winner;
    
}
}
