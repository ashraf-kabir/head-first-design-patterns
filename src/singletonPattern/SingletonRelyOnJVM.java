package singletonPattern;

public class SingletonRelyOnJVM {
  // static variable to hold the instance
  private static SingletonRelyOnJVM uniqueInstance = new SingletonRelyOnJVM();

  // other variables

  // private constructor
  private SingletonRelyOnJVM() {}

  // this method will return the instance after checking
  public static SingletonRelyOnJVM getInstance() {
    return uniqueInstance;
  }

  // other methods
}
