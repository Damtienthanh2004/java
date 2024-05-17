package BaiTapChuong4;
import java.util.Map;
import java.util.LinkedHashMap;
public class Slide94VD1 {
    public static void main(String[] args) {
    LinkedHashMap<Integer, String> HM = new LinkedHashMap<Integer, String>();
    HM. put (100, "Cong" ); 
    HM. put (101, "Nghe"); 
    HM. put (102, "Thong");
    HM. put (103, "Tin");
    for (Map.Entry<Integer, String> m: HM. entrySet())
    System.out.println(m.getKey()+" "+m.getValue());
    System.out.println("Truoc khi xoa: "+HM);
    HM. remove (101);
    System.out.println("Sau khi xoa: "+HM);
    }
}
