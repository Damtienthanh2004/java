package BaiTapChuong4;

import java.util.HashSet;
import java.util.Scanner;

public class Slide54 {
    public static void main(String[] args) {
        int Number;
        HashSet<Integer> HSI = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        HSI.add(0);
        HSI.add(1);
        HSI.add(3);
        HSI.add(2);
        HSI.add(7);
        HSI.add(6);
        HSI.add(8);
        System.out.println("Cac phan tu trong ham Hashsetinterger: " + HSI);
        System.out.println("Nhap vao phan tu can them: ");
        Number = scanner.nextInt();
        if (!HSI.contains(Number)) {
            HSI.add(Number);
            System.out.println("Them thanh cong !");
            System.out.println("Cac phan tu HSI sau khi them: " + HSI);
        } else {
            System.out.println("Phan tu " + Number + " da ton tai !");
        }
    }
}
