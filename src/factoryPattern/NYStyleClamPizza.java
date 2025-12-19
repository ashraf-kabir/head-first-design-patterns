package factoryPattern;

public class NYStyleClamPizza extends Pizza {
  public NYStyleClamPizza() {
    name = "NY Style Sauce and Clam Pizza";
    dough = "Thin Crust Dough";
    sauce = "Extra-virgin olive oil";

    toppings.add("Fresh clams (littlenecks) or canned clams (drained)");
  }
}
