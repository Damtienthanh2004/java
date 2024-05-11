package BaiTapChuong4;

import java.util.ArrayList;
import java.util.Scanner;

public class Slide23 {
    public static void main(String[] args) {
        ArrayList<Integer> Arr = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap so phan tu: ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; i++){
            System.out.println("Nhap phan tu thu " + i + ": ");
            int So = scanner.nextInt();
            Arr.add(So);
        }
        int Max = Arr.get(0);
        for(int i = 1; i < Arr.size(); i++){
            if (Arr.get(i).compareTo(Max)>0) {
                Max = Arr.get(i);
            }
        }
        System.out.println("Phan tu lon nhat trong Arr = " + Max);
    }
}
