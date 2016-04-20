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


  // additional tests for checkWinner method here

  // now test playRPS method
  // @Test
  // public void playRPS_recieveInputForPlayer1_expectInputString() {
  //   RockPaperScissors testRockPaperScissors = new RockPaperScissors();
  //   String expected = "Player 1 wins!";
  //   assertEquals(expected, testRockPaperScissors.playRPS("rock", "scissors"));
  // }
}
