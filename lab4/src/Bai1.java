import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Arr = new ArrayList<>();
        System.out.print("Nhap so phan tu ban muon nhap: ");
        int n = scanner.nextInt();
        System.out.println("Nhap cac phan tu:");
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            Arr.add(num);
        }
        int max = Arr.get(0); 
        for (int value : Arr) {
            max = Math.max(max, value);
        }
        System.out.println("Gia tri lon nhat la: " + max);
        System.out.print("Nhap gia tri muon xoa: ");
        int num = scanner.nextInt();
        Arr.removeAll(Collections.singleton(num));
        Collections.sort(Arr);
        System.out.println("Danh sach sau khi xoa va sap xep: " + Arr);
    }
}