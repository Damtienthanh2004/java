package BaiTapChuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide86 {
    public static void main(String[] args) {
    
    HashMap<String, String> HM = new HashMap<>();
    HM.put("Java","JV");
    HM.put("Book", "BK");
    HM.put("Banana", "BN");
    HM.put("GYM", "GYM");
    Set<Map.Entry<String, String>> setHashMap = HM.entrySet();
    System.out.println("cac entry co trong setHashMap: ");
    System.out.println(setHashMap);
    }
}
