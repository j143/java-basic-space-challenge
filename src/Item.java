
import java.util.HashMap;
import java.util.Map;

public class Item {
    String name;
    Integer weight;

    Map<String, Integer> items;

    public Item() {
        items = new HashMap<>();
    }

    public void setItems(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
        items.put(name, weight);
    }
}
