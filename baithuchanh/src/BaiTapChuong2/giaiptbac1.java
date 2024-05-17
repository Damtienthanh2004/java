import java.util.Scanner;

public class giaiptbac1 {

    public static void main(String[] args) {
        double a,b,x;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so a: ");
        a = scanner.nextDouble();
        System.out.println("nhap so b: ");
        b = scanner.nextDouble();
        System.out.println("phuong trinh: " + a  + "x + " + b + " = 0");
        if (a==0) {
            if (b==0) {
                System.out.println("phuong trinh vo so nghiem ");
                
            } else {
                System.out.println("phuong trinh vo nghiem ");
            }

        } else {
            x = -b/a;
            System.out.println("phuong trinh co nghiem x = " + x);
        }
    }
}