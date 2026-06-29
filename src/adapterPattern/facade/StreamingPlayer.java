package adapterPattern.facade;

public class StreamingPlayer {
  String movie;

  public void on() {
    System.out.println("Streaming Player on");
  }

  public void play(String movie) {
    this.movie = movie;
    System.out.printf("Streaming Player playing \"%s\"%n", movie);
  }

  public void stop() {
    System.out.printf("Streaming Player stopped \"%s\"%n", movie);
  }

  public void off() {
    System.out.println("Streaming Player off");
  }
}
