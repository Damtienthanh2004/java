import java.util.Scanner;

public class slice74 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        int s = 0;
        System.out.println("nhap vao so nguyen n: ");
        n = scanner.nextInt();
        for(int i = 0; i <= n; i ++){
            if (i % 2 == 0) {
               s += i;       
            }
        }
    System.out.println("tong cac so chan trong mang la: " + s );
    }
}
