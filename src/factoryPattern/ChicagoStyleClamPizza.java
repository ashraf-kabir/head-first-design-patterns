package factoryPattern;

public class ChicagoStyleClamPizza extends Pizza {
  public ChicagoStyleClamPizza() {
    name = "Chicago Style Sauce and Clam Pizza";
    dough = "Thin crust Dough";
    sauce = "\"New England Clam Chowder\" style with creamy sauce.";

    toppings.add("Fresh or canned baby clams");
  }
}
