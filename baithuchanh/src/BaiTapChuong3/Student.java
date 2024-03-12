package BaiTapChuong3;
import java.util.Scanner;

public class Student {
    public String HoTen;
    public String MaSV;
    public String Khoa;
    public String GioiTinh;
    public int Tuoi;
    public int NamSinh;
    public void nhapthongtin () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        HoTen = scanner.nextLine();
        System.out.print("Nhap ma sinh vien: ");
        MaSV = scanner.nextLine();
        System.out.print("Nhap khoa: ");
        Khoa = scanner.nextLine();
        System.out.print("Nhap gioi tinh: ");
        GioiTinh = scanner.nextLine();
        System.out.print("Nhap nam sinh: ");
        NamSinh = scanner.nextInt();
    }
    public void tinhtuoi(){
        Tuoi = 2024 - NamSinh;
    }
    public void inthongtin () {
        System.out.println("Ho Ten: " + HoTen);
        System.out.println("Ma sinh vien: " + MaSV);
        System.out.println("Khoa: " + Khoa);
        System.out.println("Gioi tinh: " + GioiTinh);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Nam sinh: " + NamSinh);
    }
    public static void main(String[] args) {
        Student st = new Student();
        st.nhapthongtin();
        st.tinhtuoi();
        st.inthongtin();
    }
}
