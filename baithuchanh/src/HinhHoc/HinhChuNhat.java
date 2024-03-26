package HinhHoc;

import java.util.Scanner;

public class HinhChuNhat extends Hinhhoc {
    public float Dai;
    public float Rong;
    public HinhChuNhat(){
        Ten = "Hinh Chu Nhat";
    }
    public void nhapchieudai(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu dai: ");
        Dai = scanner.nextFloat();
    }
    public void nhapchieurong(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        Rong = scanner.nextFloat();
    }
    public void tinhchuvi(){
        ChuVi = (Dai + Rong)*2;
    }
    public void tinhdientich(){
        DienTich = Dai * Rong;
    }

}
