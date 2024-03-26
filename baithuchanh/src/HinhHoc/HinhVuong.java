package HinhHoc;

import java.util.Scanner;

public class HinhVuong extends HinhChuNhat {
    public HinhVuong(){
        Ten = "Hinh Vuong";
    }
    public void nhapcanh(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap canh: ");
        Dai = Rong = scanner.nextFloat();
    }
}
