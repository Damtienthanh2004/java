package BaiTapChuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide56 {
    public static void main(String[] args) {
        String Name;
        HashSet<String> HSH = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        HSH.add("Java");
        HSH.add("Book");
        HSH.add("Apple");
        HSH.add("Samsung");
        HSH.add("Lenovo");
        HSH.add("Facebook");
        System.out.println("Cac phan tu trong mang HSH: " + HSH);
        System.out.println("Nhap vao phan tu muon xoa: ");
        Name = scanner.nextLine();
        if (HSH.contains(Name)) {
            HSH.remove(Name);
            System.out.println("Da xoa thanh cong !");
            System.out.println("Danh sach sau khi da xoa thanh cong: " + HSH );
        } else {
            System.out.println("Xoa khong thanh cong !");
        }
    }
}
