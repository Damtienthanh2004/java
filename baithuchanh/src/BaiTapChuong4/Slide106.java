package BaiTapChuong4;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Slide106 {
    public static void main(String[] args) {
        TreeMap<Integer, Character> TreeMap = new TreeMap<>();
        TreeMap.put(6, 'A');
        TreeMap.put(5, 'B');
        TreeMap.put(1, 'C');
        TreeMap.put(2, 'E');
        TreeMap.put(8, 'F');
        Set<Entry<Integer, Character>> setTreeMap = TreeMap.entrySet();
        System.out.println("Cac entry co trong SetTreeMap: ");
        System.out.println(setTreeMap);
}
}
