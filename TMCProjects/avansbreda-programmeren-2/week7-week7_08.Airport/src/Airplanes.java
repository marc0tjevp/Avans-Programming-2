import java.util.HashMap;

public class Airplanes {
    private HashMap<String, String> planes;


    public Airplanes() {
        this.planes = new HashMap<String, String>();

    }

    public void add(String planeID, String capacity) {
        this.planes.put(planeID, capacity);
    }

    public String get(String planeID) {
        return planeID + " (" + this.planes.get(planeID) + " ppl)";
    }


    public String toString() {
        String buffer = "";

        for (String i : this.planes.keySet()) {
            buffer += i + " (" + this.planes.get(i) + " ppl)\n";
        }


        return buffer;

    }

}
