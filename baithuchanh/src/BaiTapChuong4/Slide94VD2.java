    package BaiTapChuong4;
    import java.util. LinkedHashMap;
    import java.util. Set;
public class Slide94VD2 {
        public static void main(String args[]) {
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
        linkedHashMap.put(1, "Java");
        linkedHashMap.put(3,"C++");
        linkedHashMap.put(2,"Excel");
        linkedHashMap.put(4,"Python");
        System.out.println("Truoc khi xoa: ");
        show(linkedHashMap);
        linkedHashMap.remove(2);
        System.out.println("Sau khi xoa: ");
        show(linkedHashMap);
        }
        public static void show(LinkedHashMap<Integer, String> linkedHashMap) {
        Set<Integer> keySet = linkedHashMap.keySet();
        for (Integer key : keySet) {
        System.out.println(key + " " + linkedHashMap.get(key));
}
        }
    }

