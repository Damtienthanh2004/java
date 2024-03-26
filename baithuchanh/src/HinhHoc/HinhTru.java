package HinhHoc;

import java.util.Scanner;
public class HinhTru extends HinhTron {
    public float ChieuCao;
    public HinhTru(){
        Ten = "Hinh tru";
    }
    public void nhapchieucao(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap chieu cao: ");
        ChieuCao = scanner.nextFloat();
    }
    public void tinhthetich(){
        nhapbankinh();
        tinhdientich();
        TheTich = DienTich * ChieuCao;
    }
}
