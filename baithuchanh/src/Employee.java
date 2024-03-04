import java.util.Scanner;

public class Employee {
    public String HoTen;
    public int NamSinh;
    public int Tuoi;
    public String GioiTinh;
    public String Phongban;
    public String DuAn;
    public String DiaChi;
public void nhapthongtin(){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap ho ten: ");
    HoTen = scanner.nextLine();
    System.out.print("Nhap gioi tinh: ");
    GioiTinh = scanner.nextLine();
    System.out.print("Nhap phong ban: ");
    Phongban = scanner.nextLine();
    System.out.print("Nhap du an: ");
    DuAn = scanner.nextLine();
    System.out.print("Nhap dia chi: ");
    DiaChi = scanner.nextLine();
    System.out.print("Nhap nam sinh: ");
    NamSinh = scanner.nextInt();
}
public void tinhtuoi(){
    Tuoi = 2024 - NamSinh;
}
public void inthongtin(){
    System.out.println("Ho ten: " + HoTen);
    System.out.println("Nam sinh: " + NamSinh);
    System.out.println("Gioi tinh: " + GioiTinh);
    System.out.println("Tuoi: " + Tuoi);
    System.out.println("Phong ban: " + Phongban);
    System.out.println("Du an: " + DuAn);
    System.out.println("Dia chi: " + DiaChi);
}
public static void main(String[] args) {
    Employee ep = new Employee();
    ep.nhapthongtin();
    ep.tinhtuoi();
    ep.inthongtin();
}
}
