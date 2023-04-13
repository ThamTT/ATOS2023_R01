package lanhD;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class baiTapBuoi2 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(100, "A");
        map.put(101, "B");
        map.put(102, "C");
        // show map
        Set<Integer> set = map.keySet();
        for (Integer key : set) {
            System.out.println(key + " " + map.get(key));
    }

}}
