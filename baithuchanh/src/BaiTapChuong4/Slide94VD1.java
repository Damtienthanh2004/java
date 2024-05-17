package BaiTapChuong4;
import java.util.Map;
import java.util.LinkedHashMap;
public class Slide94VD1 {
    public static void main(String[] args) {
    LinkedHashMap<Integer, String> LHM = new LinkedHashMap<Integer, String>();
    LHM. put (100, "Cong" ); 
    LHM. put (101, "Nghe"); 
    LHM. put (102, "Thong");
    LHM. put (103, "Tin");
    for (Map.Entry<Integer, String> m: LHM. entrySet())
    System.out.println(m.getKey() + " " + m.getValue());
    System.out.println("Truoc khi xoa: " + LHM);
    LHM. remove (101);
    System.out.println("Sau khi xoa: " + LHM);
    }
}
