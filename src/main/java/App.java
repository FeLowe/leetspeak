import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class MAIN CLASS NAME {

  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/index.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/results", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/results.vtl");


      // YOUR "BUSINESS LOGIC" GOES HERE / 
      // String inputtedNumberAsString = request.queryParams("userNumber");
      // Integer inputtedNumber = Integer.parseInt(inputtedNumberAsString);
      //
      // PingPong myPingPong = new PingPong();
      // ArrayList<Object> results = myPingPong.runPingPong(inputtedNumber);
      //
      // model.put("results", results);

      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

  }

}
