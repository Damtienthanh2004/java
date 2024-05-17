import java.util.Scanner;

public class slice35 {
    public static void main(String[] args) {
        double a, b, sonhonhat;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        a = scanner.nextDouble();
        System.out.println("nhap vao so b: ");
        b = scanner.nextDouble();
        if (a > b) {
            System.out.println("so nho nhat la: " + b);
        }
        else {
            System.out.println("so nho nhat la: " + a);
        }
    }
}
