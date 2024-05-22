import java.util.Scanner;

public class DTT739Person {
    public String Name;
    public int Tuoi;
    public String GioiTinh;
    public void NhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap Ten : ");
        Name = scanner.nextLine();
        System.out.println("Nhap Tuoi: ");
        Tuoi = scanner.nextInt();
        System.out.println("Nhap Gioi Tinh: ");
        GioiTinh = scanner.nextLine();
    }
    public void XuatThongTin(){
        System.out.println("Ten: " + Name);
        System.out.println("Tuoi: " + Tuoi);
        System.out.println("Gioi Tinh: " + GioiTinh);
    }
    }
    public static void main(String[] args) throws Exception {
        
    }

