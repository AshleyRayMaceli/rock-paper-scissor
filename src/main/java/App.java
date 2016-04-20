import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
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
      RockPaperScissors newRockPaperScissors = new RockPaperScissors();
      String gameRPS = newRockPaperScissors.playRPS(player1, player2);

      model.put("player1", player1);
      model.put("player2", player2);
      model.put("playRPS", gameRPS);
      model.put("player1", request.queryParams("player1"));
      model.put("player2", request.queryParams("player2"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }
}
