package BaiTapChuong3.Person;

import java.util.Scanner;

public class Employee extends Person {
    public String chucVu;
    public String maNhanVien;
    public long luong;
public void nhapthongtin(){
    super.nhapthongtin();
    Scanner scanner = new Scanner(System.in);
    System.out.println("Ma nhan vien: ");
    maNhanVien = scanner.nextLine();
}
public void xuatthongin(){
    super.xuatthongin();
    System.out.println("Chuc vu: " + chucVu);
        System.out.println("Ma nhan vien: " + maNhanVien);
        System.out.println("Luong: " + luong);
}
}