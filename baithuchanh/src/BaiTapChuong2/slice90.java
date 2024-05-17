package BaiTapchuong2;
import java.util.Scanner;

public class slice90 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char kytu;
        String chuoi;
        System.out.println("nhap vao mot chuoi bat ky: ");
        chuoi = scanner.nextLine();
        System.out.println("cac ky tu co trong chuoi tren la: ");
        for (int i = 0; i < chuoi.length(); i++){
            kytu = chuoi.charAt(i);
            System.out.println(kytu);
        }
    }
}
