import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
    public class Bai4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashSet<String> hashSetTraiCay = new HashSet<>();

        // Nhập tên các loại trái cây
        while (true) {
            System.out.print("Nhap ten trai cay: ");
            String tenTraiCay = scanner.nextLine();
            if (tenTraiCay.isEmpty()) break;
            hashSetTraiCay.add(tenTraiCay);
        }

        // Hiển thị số phần tử trong HashSet
        System.out.println("So phan tu co trong hashset: " + hashSetTraiCay.size());

        // Kiểm tra sự tồn tại của một loại trái cây
        System.out.print("Nhap ten trai cay can kiem tra: ");
        String traiCayCanTim = scanner.nextLine();
        if (hashSetTraiCay.contains(traiCayCanTim)) {
            System.out.println("Da tim thay: " + traiCayCanTim);
        } else {
            System.out.println("Khong tim thay: " + traiCayCanTim);
        }

        // Xóa một loại trái cây bất kỳ và hiển thị các phần tử còn lại
        if (!hashSetTraiCay.isEmpty()) {
            System.out.println("nhap trai cay can xoa: ");
            String a = scanner.nextLine();
            a = hashSetTraiCay.iterator().next();
            hashSetTraiCay.remove(a);
            System.out.println("Da xoa: " + a);
        }
        
        System.out.println("Cac phan tu con lai trong HashSet:");
        for (String traiCay : hashSetTraiCay) {
            System.out.println(traiCay);
        }

        // Tạo một List mới và thêm các phần tử của List này vào HashSet ban đầu
        List<String> listTraiCay = new ArrayList<>();
        listTraiCay.add("Cam");
        listTraiCay.add("Tao");
        listTraiCay.add("Xoai");

        hashSetTraiCay.addAll(listTraiCay);

        // Hiển thị lại HashSet sử dụng Iterator
        System.out.println("HashSet sau khi them phan tu tu List:");
        Iterator<String> iterator = hashSetTraiCay.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // Xóa các phần tử của List có trong HashSet và hiển thị lại HashSet
        hashSetTraiCay.removeAll(listTraiCay);
        System.out.println("HashSet sau khi xoa phan tu tu List:");
        for (String traiCay : hashSetTraiCay) {
            System.out.println(traiCay);
        }
    }
}