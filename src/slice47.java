import java.util.Scanner;

public class slice47 {
    public static void main(String[] args) {
        int a;
        int sum = 0;
        while (true) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao so nguyen a: ");
        a = scanner.nextInt();
        if (a==0) {
            break;
        }
        sum += a;
        if (sum > 100) {
            System.out.println("tong cac so da nhap vuot qua 100, ket thuc vong lap.");
            break;
        }
    }
    System.out.println("tong = " + sum);
    }
}
