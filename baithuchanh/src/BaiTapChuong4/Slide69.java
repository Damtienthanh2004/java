package BaiTapChuong4;

import java.util.Scanner;
import java.util.TreeSet;

public class Slide69 {
    public static void main(String[] args) {
        TreeSet<Integer> TS = new TreeSet<>();
        Scanner scanner = new Scanner(System.in);
        TS.add(0);
        TS.add(2);
        TS.add(4);
        TS.add(3);
        TS.add(6);
        TS.add(9);
        TS.add(10);
        System.out.println("Danh sach ban dau: " + TS);
        System.out.println("Nhap vao phan tu muon them: ");
        int n = scanner.nextInt();
        if(!TS.contains(n)){
            TS.add(n);
            System.out.println("Da them thanh cong !");
            System.out.println("Danh sach su khi them: " + TS);
        } else {
            System.out.println("Them that bai !");
        }
    }
}
