
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {

        HashMap<String, String> test = new HashMap<String, String>();
        
        test.put("matti", "mage");
        test.put("mikael", "mixu");
        test.put("arto", "arppa");
        
        test.get("mikael");
    }

}