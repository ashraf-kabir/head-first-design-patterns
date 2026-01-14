package singletonPattern;

/**
 * double-checked locking, first check to see if an instance is created
 * if not, then we synchronize
 * this way we only synchronize the first time
 */
public class SingletonVolatile {
  // static variable to hold the instance
  private volatile static SingletonVolatile uniqueInstance = new SingletonVolatile();

  // other variables

  // private constructor
  private SingletonVolatile() {}

  // this method will return the instance after checking
  public static SingletonVolatile getInstance() {
    if (uniqueInstance == null) {
      synchronized (SingletonVolatile.class) {
        if (uniqueInstance == null) {
          uniqueInstance = new SingletonVolatile();
        }
      }
    }
    return uniqueInstance;
  }

  // other methods
}
