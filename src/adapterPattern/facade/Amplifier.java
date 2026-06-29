package adapterPattern.facade;

public class Amplifier {
  public void on() {
    System.out.println("Amplifier on");
  }

  public void setStreamingPlayer(StreamingPlayer player) {
    System.out.println("Amplifier setting Streaming player to Streaming player");
  }

  public void setSurroundSound() {
    System.out.println("Amplifier surround sound on (5 speakers, 1 subwoofer)");
  }

  public void setVolume(int i) {
    System.out.printf("Amplifier setting volume to %s%n", i);
  }

  public void off() {
    System.out.println("Amplifier off");
  }
}
