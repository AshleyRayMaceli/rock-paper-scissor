import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void checkWinner_rockBeatsScissors_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("rock", "scissors"));
  }

  @Test
  public void checkWinner_scissorsBeatsPaper_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("scissors", "paper"));
  }

  @Test
  public void checkWinner_paperBeatsRock_true() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(true, testGame.checkWinner("paper", "rock"));
  }

  @Test
  public void checkWinner_scissorsLosesToRock_false() {
    RockPaperScissors testGame = new RockPaperScissors();
    assertEquals(false, testGame.checkWinner("scissors", "rock"));
  }


  // additional tests for checkWinner method here

  // now test playRPS method
  @Test
  public void playRPS_announcePlayer1Wins_winningResultString() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 1 wins!";
    assertEquals(expected, testRockPaperScissors.playRPS("rock", "scissors"));
  }

  @Test
  public void playRPS_announceTie_winningResultString() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "It's a tie";
    assertEquals(expected, testRockPaperScissors.playRPS("rock", "rock"));
  }

  @Test
  public void playRPS_announcePlayer2Wins_winningResultString() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "Player 2 wins!";
    assertEquals(expected, testRockPaperScissors.playRPS("scissors", "rock"));
  }
}
