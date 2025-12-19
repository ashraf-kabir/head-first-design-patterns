package factoryPattern;

public class NYStylePepperoniPizza extends Pizza {
  public NYStylePepperoniPizza() {
    name = "NY Style Pepperoni Pizza";
    dough = "Thin Crust Dough";
    sauce = "Crushed tomatoes";

    toppings.add("Thin-sliced, slightly spicy pepperoni");
  }
}
