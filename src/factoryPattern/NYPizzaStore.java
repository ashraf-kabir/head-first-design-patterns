package factoryPattern;

public class NYPizzaStore extends PizzaStore {
  Pizza createPizza(String item) {
    return switch (item) {
      case "cheese" -> new NYStyleCheesePizza();
      case "veggie" -> new NyStyleVeggiePizza();
      case "clam" -> new NYStyleClamPizza();
      case "pepperoni" -> new NYStylePepperoniPizza();
      default -> null;
    };
  }
}
