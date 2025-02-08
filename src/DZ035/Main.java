package DZ035;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("X", "1");
        map.put("Y", "2");
        map.put("Z", "3");
        System.out.println(map);
        ArrayList<String> arrayList = new ArrayList<>();
        for (var i : map.entrySet()){
            arrayList.add(i.getKey());
            arrayList.add(i.getValue());
        }
        HashMap<String,String> mapDesc = new HashMap<>();
        for (int i = 0; i < arrayList.size(); i = i + 2){
            mapDesc.put(arrayList.get(i + 1), arrayList.get(i));
        }
        System.out.println();
        System.out.println(mapDesc);
    }

}
