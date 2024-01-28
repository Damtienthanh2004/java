import java.util.Scanner;

public class bai3_slice93 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ten;
        int namsinh, tuoi, namhientai;
        System.out.println("nhap ten: ");
        ten = scanner.nextLine();
        System.out.println("nhap nam sinh: ");
        namsinh = scanner.nextInt();
        System.out.println("nhap nam hien tai: ");
        namhientai = scanner.nextInt();
        tuoi = namhientai - namsinh;
        if (tuoi < 16 ) { 
            System.out.println("ban " + ten + " o do tuoi vi thanh nien " );
        } else if (tuoi >= 16 && tuoi < 18) {
            System.out.println("ban " + ten + " o do tuoi truong thanh ");
        } else {
            System.out.println("ban " + ten + " da gia ");
        }
    }
}