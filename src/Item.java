import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Item {
    String name;
    int weight;

    Map<String, Integer> items;

    public Item() {
        items = new HashMap<>();
    }

    public void main(String name, int weight) {
        this.name = name;
        this.weight = weight;
        items.put(name, weight);
    }
}
