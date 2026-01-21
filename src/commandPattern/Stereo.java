package commandPattern;

public class Stereo {
  String location;

  public Stereo(String location) {
    this.location = location;
  }

  public void on() {
    System.out.println(location + " stereo is On");
  }

  public void off() {
    System.out.println(location + " stereo is Off");
  }

  public void setCd() {
    System.out.println(location + " stereo is set for CD");
  }

  public void setDvd() {
    System.out.println(location + " stereo is set for DVD");
  }

  public void setRadio() {
    System.out.println(location + " stereo is set for Radio");
  }

  public void setVolume(int volume) {
    System.out.println(location + " stereo volume set to " + volume);
  }
}
