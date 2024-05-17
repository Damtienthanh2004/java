package BaiTapChuong2;
import java.util.Scanner;

public class slice81 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        System.out.println("nhap vao so dong: ");
        a = scanner.nextInt();
        System.out.println("nhap vao so cot: ");
        b = scanner.nextInt();
        int[][] matran = new int[a][b];
        System.out.println("nhap cac phan tu trong ma tran: ");
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                System.out.print("nhap phan tu o vi tri ["+ i +"]["+ j +"]: ");
                matran[i][j] = scanner.nextInt();
            }
        }
        int max = matran[0][0];
        for (int i = 0; i < a; i++){
            for (int j = 0; j < b; j++){
                if (max < matran[i][j]) {
                    max = matran[i][j];
                }
            }
        }
        System.out.println("phan tu lon nhat trong ma tran = " + max);
    }
}
