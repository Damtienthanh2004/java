package BaiTapChuong4;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide108 {
    public static void main(String[] args) {
        TreeMap<Integer, Double> TreeMap = new TreeMap<>();
        TreeMap.put(1, 9d);
        TreeMap.put(4, 10.1d);
        TreeMap.put(2, 7.2d);
        TreeMap.put(8, 20.28d);
        System.out.println("Cac Phan tu co trong Treemap la: ");
        Set<Map.Entry<Integer, Double>> SetTreeMap = TreeMap.entrySet();
        System.out.println(SetTreeMap);
        TreeMap.replace(4, 20.11d);
        TreeMap.replace(2, 7.3d, 7.7d);
        System.out.println("Cac phan tu co trong TreeMap sau khi thay the: ");
        SetTreeMap = TreeMap.entrySet();
        System.out.println(SetTreeMap);
    }
}
