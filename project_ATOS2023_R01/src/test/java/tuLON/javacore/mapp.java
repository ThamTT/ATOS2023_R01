package tuLON;

import java.util.HashMap;
import java.util.Map;

public class mapp {
    public static void main(String args[]) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
//        Set<Integer> set = map.keySet();
//        for (Integer key : set) {
//            System.out.println(key + " " + map.get(key));
//        }
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
