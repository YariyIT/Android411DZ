package DZ034;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        String[] color = {"red", "orange", "aqua", "pink", "gray", "blue", "white", "black", "yellow", "brown"}; // Создаём массив
        HashMap<String, Color> colorHashMap = new HashMap<>();

        for (int i = 0; i < color.length; i++) {
            colorHashMap.put(color[i], new Color(color[i].toUpperCase()));
        }

        int i = 1;
        for (Map.Entry s : colorHashMap.entrySet()) {
            System.out.println(i + ") " + s.getKey() + ": " + s.getValue());
            i++;
        }
    }
}
