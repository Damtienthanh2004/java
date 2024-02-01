import java.util.Scanner;

public class bai8_slice96 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n , a;
    float sum = 0;
    System.out.print("nhap vao so cac so nguyen n: ");
    n = sc.nextInt();
    for(int i = 1; i <= n; i ++){
        System.out.print("nhap vao so nguyen thu " + i + ": ");
        a = sc.nextInt();
        sum += a;
    }
    System.out.print("trung binh cong = " + (sum/n));
    }
}
