
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        Airplanes planes = new Airplanes();
        Flights flights = new Flights();

        TUI ui = new TUI(reader, planes, flights);
        ui.start();
    }
}
