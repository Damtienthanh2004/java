package BaiTapChuong2;
import java.util.Scanner;

public class giaiptbac2 {
    public static void main(String[] args) {
        double a,b,c,x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("nhap so c: ");
        c = scanner.nextDouble();
        System.out.println("phuong trinh: " + a + "x^2 + " + b + "x + " + c + " = 0 " );
        if (a==0) {
            if (b==0) {
                System.out.println("phuong trinh vo nghiem ");
                
            } else {
                System.out.println("phuong trinh co mot nghiem " + "x = " + (-c/b));

            } return;
            
        }
        double delta = b*b - 4*a*c;
        double x1, x2;
        if (delta > 0) {
            x1 = (double) ((-b + Math.sqrt(delta)) / (2*a));
            x2 = (double) ((-b - Math.sqrt(delta)) / (2*a));
            System.out.println("phuong trinh co 2 nghiem " + "x1 = " + x1 + " va x2 = " + x2);
        } else if (delta == 0) {
            x1 = (-b/(2*a));
            System.out.println("phuong trinh co nghiem kep " + "x1 = x2 = " + x1);

        } else {
            System.out.println("phuong trinh vo nghiem ");
        }
    }
}
