import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
    public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSetTraiCay = new HashSet<>();
        while (true) {
            System.out.print("Nhap ten trai cay: ");
            String tenTraiCay = scanner.nextLine();
            if (tenTraiCay.isEmpty()) break;
            hashSetTraiCay.add(tenTraiCay);
        }
        System.out.println("So phan tu co trong hashset: " + hashSetTraiCay.size());
        System.out.print("Nhap ten trai cay can kiem tra: ");
        String traiCayCanTim = scanner.nextLine();
        if (hashSetTraiCay.contains(traiCayCanTim)) {
            System.out.println("Da tim thay: " + traiCayCanTim);
        } else {
            System.out.println("Khong tim thay: " + traiCayCanTim);
        }
        if (!hashSetTraiCay.isEmpty()) {
            String traiCayCanXoa = hashSetTraiCay.iterator().next();
            hashSetTraiCay.remove(traiCayCanXoa);
            System.out.println("Da xoa: " + traiCayCanXoa);
        }
        
        System.out.println("Cac phan tu con lai trong HashSet:");
        for (String traiCay : hashSetTraiCay) {
            System.out.println(traiCay);
        }
        List<String> listTraiCay = new ArrayList<>();
        listTraiCay.add("Cam");
        listTraiCay.add("Tao");
        listTraiCay.add("Oi");

        hashSetTraiCay.addAll(listTraiCay);
        System.out.println("HashSet sau khi them phan tu tu List:");
        Iterator<String> iterator = hashSetTraiCay.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        hashSetTraiCay.removeAll(listTraiCay);
        System.out.println("HashSet sau khi xoa phan tu tu List:");
        for (String traiCay : hashSetTraiCay) {
            System.out.println(traiCay);
        }
    }
}