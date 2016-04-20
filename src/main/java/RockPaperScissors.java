import java.util.ArrayList;
import java.util.Random;

public class RockPaperScissors {
  public static void main(String[] args) {}

    public static Boolean checkWinner(String item1, String item2) {
      if ((item1 == "rock" && item2 == "scissors") || (item1 == "scissors" && item2 == "paper")) {
        return true;
      } else {
        return false;
      }
    }



    // public static String playRPS (String player1, String player2) {
    //
    //   checkWinner(player1, player2);
    //
    //   if (checkWinner("", "") == true) {
    //     return "Player 1 wins!";
    //   } else if (checkWinner("", "") == false) {
    //     return "Player 2 wins!";
    //   } else {
    //     return "Tie";
    //   }
    // }

    // public static String playRPS (String player1, String player2) {
    //   if (checkWinner("", "") == true) {
    //     return "Player 1 wins!";
    //   } else if (checkWinner("", "") == false) {
    //     return "Player 2 wins!";
    //   } else {
    //     return "Tie";
    //   }
    // }

}
