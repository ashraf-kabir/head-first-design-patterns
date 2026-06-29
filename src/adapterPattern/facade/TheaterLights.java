package adapterPattern.facade;

public class TheaterLights {
  public void dim(double val) {
    System.out.printf("Theater ceiling Lights dimming to %s%%%n", val);
  }

  public void on() {
    System.out.println("Theater Ceiling Lights on");
  }
}
