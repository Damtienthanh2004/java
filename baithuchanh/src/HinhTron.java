import java.util.Scanner;

public class HinhTron {
    public float bankinh;
    public float chuvi;
    public float dientich;
    public final float PI = 3.14f;
    public void nhapbankinh(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("R = ");
        bankinh = scanner.nextFloat();
    }
    public void tinhchuvi(){
        chuvi = 2*PI*bankinh;
    }
    public void tinhdientich(){
        dientich = PI*bankinh*bankinh;
    }
    public void hienthithongtin(){
        System.out.println("chu vi = " + chuvi);
        System.out.println("dien tich = " + dientich);
    }
    public static void main(String[] args) {
        HinhTron ht = new HinhTron();
        ht.nhapbankinh();
        ht.tinhchuvi();
        ht.tinhdientich();
        ht.hienthithongtin();
    }
}
