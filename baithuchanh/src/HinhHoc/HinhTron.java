package HinhHoc;
import java.util.Scanner;
 
public class HinhTron extends Hinhhoc {
    public float bankinh;
    public HinhTron(){
        Ten = "Hinh Tron";
    }
    public void nhapbankinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("R = ");
        bankinh = scanner.nextFloat();
    }
    public void tinhchuvi(){
        ChuVi = 2*PI*bankinh;
    }
    public void tinhdientich(){
        DienTich = PI*bankinh*bankinh;
    }
    }
    