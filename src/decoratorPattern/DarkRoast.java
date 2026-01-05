package decoratorPattern;

public class DarkRoast extends Beverage {
  public DarkRoast() {
    description = "Dark Roasted Coffee";
  }

  public double cost() {
    return .99;
  }
}
