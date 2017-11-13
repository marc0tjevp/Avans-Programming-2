import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String, String> dict;

    public Dictionary() {
        this.dict = new HashMap<String, String>();
    }

    public String translate(String word) {
        if (this.dict.containsKey(word)) {
            return this.dict.get(word);
        } else {
            return null;
        }
    }

    public void add(String word, String translation) {
        this.dict.put(word, translation);
    }

    public int amountOfWords() {
        return this.dict.size();
    }

    public ArrayList<String> translationList() {
        ArrayList<String> test = new ArrayList<String>();

        for (String i : this.dict.keySet()) {
            test.add(i + " = " + this.dict.get(i));
        }

        return test;
    }

}
