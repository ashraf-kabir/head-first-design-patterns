package adapterPattern.facade;

public class HomeTheaterTestDrive {
  public static void main(String[] args) {
    Amplifier amp = new Amplifier();
    Tuner tuner = new Tuner();
    StreamingPlayer player = new StreamingPlayer();
    Projector projector = new Projector();
    TheaterLights lights = new TheaterLights();
    Screen screen = new Screen();
    PopcornPopper popper = new PopcornPopper();

    HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(amp, tuner, player, projector, screen, lights, popper);
    homeTheaterFacade.watchMovie("No Country for Old Men");
    homeTheaterFacade.endMovie();
  }
}
