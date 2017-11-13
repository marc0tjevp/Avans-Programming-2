
import java.util.ArrayList;
import java.util.HashMap;

public class Flights {
    private ArrayList<String> flights;

    public Flights() {
        this.flights = new ArrayList<String>();
    }

    public void add(String entry) {
        this.flights.add(entry);
    }

    public String toString() {
        String buffer = "";

        for (String i : this.flights) {
            buffer += i + "\n";
        }

        return buffer;

    }

}
