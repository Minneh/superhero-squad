import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class App {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";



  get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("hero", request.session().attribute("hero"));
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    post("/heroes", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();

      ArrayList<Hero> heroes = request.session().attribute("heroes");
      if (heroes == null) {
        heroes = new ArrayList<Hero>();
        request.session().attribute("heroes", heroes);
      }

      String name = request.queryParams("name");
      int age = Integer.parseInt(request.queryParams("age"));
      String specialPower = request.queryParams("specialPower");
      String weakness = request.queryParams("weakness");
      Hero newHero = new Hero(name, age, specialPower, weakness);
      heroes.add(newHero);

      model.put("template", "templates/success.vtl");
      return new ModelAndView(model, layout);
     }, new VelocityTemplateEngine());

  }
}
