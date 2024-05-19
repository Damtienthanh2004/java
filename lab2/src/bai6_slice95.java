import java.util.Scanner;

public class Bai6_slice95 {
    public static void main(String[] args) {
        int n;
        int temp = 1;
        long giaithua = 1;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("nhap vao so nguyen duong n: ");
            n = scanner.nextInt();
     }
     while (n <= 0);
       while (temp <= n) {
        giaithua *= temp;
        temp ++;
       }
        System.out.println(n + "! = " + giaithua);
    }
}
