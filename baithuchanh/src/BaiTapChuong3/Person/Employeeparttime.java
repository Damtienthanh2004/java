package BaiTapChuong3.Person;

import java.util.Scanner;

public class Employeeparttime extends Employee {
    public long soGioLamViec;
    public Employeeparttime(){
        chucVu = "Nhan vien parttime!!";
        luong = 30000;
    }
    public void nhapCong(){
        super.nhapthongtin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So gio lam viec: ");
        soGioLamViec = scanner.nextLong();
    }
    public void tinhLuong(){
        luong = luong*soGioLamViec;
    }
}
