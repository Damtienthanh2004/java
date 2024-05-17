package BaiTapChuong2;
import java.util.Scanner;

public class slice30 {
    public static void main(String[] args) {
        int n,tong;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap so n: ");
        n = scanner.nextInt();
        while (n <= 0) {
            System.out.println("vui long nhap so nguyen duong: ");
            n = scanner.nextInt();
        }
        while (n > 0) {
            tong = n%10;
            sum += tong;
            n /= 10;
        }
    System.out.println("tong cac chu so = " + sum);
    }
}
