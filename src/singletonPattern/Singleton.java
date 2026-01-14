package singletonPattern;

public class Singleton {
  private static Singleton uniqueInstance; // static variable to hold the instance
  // other variables

  // private constructor
  private Singleton() {}

  // this method will return the instance after checking
  public static Singleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new Singleton();
    }
    return uniqueInstance;
  }

  // other methods
}
