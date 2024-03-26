package BaiTapChuong3.Person;

import java.util.Scanner;

public class Employeefulltime extends Employee {
    public long soNgayLamViec;
    public Employeefulltime(){
        chucVu = "Nhan Vien Fulltime!!";
        luong = 50000;
    }
    public void nhapSoNgay(){
        super.nhapthongtin();
        Scanner scanner = new Scanner(System.in);
        System.out.println("So ngay lam viec: ");
        soNgayLamViec = scanner.nextLong();
    }
    public void tinhLuong(){
        luong = soNgayLamViec*luong;
    }
}
