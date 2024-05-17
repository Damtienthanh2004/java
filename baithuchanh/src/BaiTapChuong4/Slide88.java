package BaiTapChuong4;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Slide88 {
    public static void main(String[] args) {
        HashMap<String, String> HMCity = new HashMap<>();
        HMCity.put("BG", "Bac Giang");
        HMCity.put("HN", "Ha Noi");
        HMCity.put("HP", "Hai Phong");
        HMCity.put("QN", "Quang Ninh");
        System.out.println("Danh sach cac thanh pho trong Hashmapcity: " + HMCity);
        Set<Map.Entry<String, String>> setCity = HMCity.entrySet();
        System.out.println(setCity);
        System.out.println("BG: " + HMCity.get("BG"));
        System.out.println("BN: " + HMCity.get("BN"));
        if (HMCity.containsValue("Ha Noi")){
            System.out.println("co thanh pho Ha Noi trong Hashmapcity");
        }
    }
}
