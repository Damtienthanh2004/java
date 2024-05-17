package BaiTapChuong4;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.Scanner;
public class Slide60 {
    public static void main(String[] args) {
        Set<String> LHS = new LinkedHashSet<String>();
        LHS.add("Java");
        LHS.add("Book");
        LHS.add("Facebook");
        LHS.add("Apple");
        System.out.println("Danh sach ban dau: " + LHS);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao phan tu muon xoa: ");
        String A = scanner.nextLine();
        if (LHS.contains(A)) {
            LHS.remove(A);
            System.out.println("Da xoa thanh cong !");
            System.out.println("Danh sach sau khi da xoa thanh cong: " + LHS );
        } else {
            System.out.println("Xoa khong thanh cong !");
        }
    }
}
