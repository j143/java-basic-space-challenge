import com.sun.org.apache.xml.internal.utils.StringToIntTable;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    private static String _key;
    private static String _value;

    public static void main(String [] args) throws FileNotFoundException {
        loadItems();
    }

    public static void loadItems() throws FileNotFoundException {
        File file = new File("phase-1.txt");
        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            _key = line.split("=")[0];
            _value = line.split("=")[1];
            System.out.println(_key + " = " + _value);
            Item items = new Item();
            items.setItems(_key, new Integer(_value));
        }

    }
}
