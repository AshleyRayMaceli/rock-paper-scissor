public class RockPaperScissors {
  public static boolean checkWinner(String item1, String item2) {
    if ((item1.equals("rock") && item2.equals("scissors")) || (item1.equals("scissors") && item2.equals("paper")) || (item1.equals("paper") && item2.equals("rock"))) {
      return true;
    } else {
      return false;
    }
  }

  public static String playRPS (String player1, String player2) {

    boolean winnerResult = checkWinner(player1, player2);

    if (winnerResult == true) {
      return "Player 1 wins!";
    } else if (winnerResult == false && player1.equals(player2)) {
      return "It's a tie";
    } else {
      return "Player 2 wins!";
    }
  }
}
