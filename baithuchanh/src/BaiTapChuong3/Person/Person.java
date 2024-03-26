package BaiTapChuong3.Person;
import java.util.Scanner;
public class Person {
    public String ten;
    public String tuoi;
    public String gioiTinh;

    public void nhapthongtin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ten: ");
        ten = sc.nextLine();
        System.out.println("nhap tuoi: ");
        tuoi = sc.nextLine();
        System.out.println("nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
    }
    public void xuatthongin(){
        System.out.println("Ten la: " + ten);
        System.out.println("tuoi: " + tuoi);
        System.out.println("gioi Tinh: " + gioiTinh);
    }
}
