import java.util.Random;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RockPaperScissors {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/player1", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/player1.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/player2", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/player2.vtl");
      model.put("player1", request.queryParams("player1"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");

      String player1 = request.queryParams("player1");
      String player2 = request.queryParams("player2");
      String playRPS = playRPS(player1, player2);

      model.put("player1", player1);
      model.put("player2", player2);
      model.put("playRPS", playRPS);
      model.put("player1", request.queryParams("player1"));
      model.put("player2", request.queryParams("player2"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

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
