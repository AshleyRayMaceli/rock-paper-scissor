import org.junit.*;
import static org.junit.Assert.*;

public class RockPaperScissorsTest {

  @Test
  public void playRPS_recieveInputForPlayer1_expectInputString() {
    RockPaperScissors testRockPaperScissors = new RockPaperScissors();
    String expected = "rock";

    assertEquals(expected, testRockPaperScissors.playRPS(""));
  }
}
