package lab3;
import java.util.HashMap;
import java.util.Set;

public class MyHashMap {
    private final HashMap<String, Integer> pocket = new HashMap<>();

    public MyHashMap() {
    }

    public void add(String key, Integer value) {
        this.pocket.put(key, value);
    }

    public void printElem() {
        Set<String> keys = this.pocket.keySet();

        for (String key : keys) {
            System.out.println("Ключ: " + key);
        }

    }
}
