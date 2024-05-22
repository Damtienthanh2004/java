import java.util.Scanner;

public class DTT739Person {
    public String Name;
    public int Tuoi;
    public String GioiTinh;
    public void NhapThongTin(){
        Scanner scanner = new Scanner(System.in);
        System.err.println("Nhap ten: ");
        Name = scanner.nextLine();
        System.out.println("Nhap tuoi: ");
        Tuoi = scanner.nextInt();
        System.out.println("Nhap gioi tinh: ");
        GioiTinh = scanner.nextLine();
    }
    public void XuatThongTin(){
        System.out.println("Ten: " + Name + "Tuoi: " + Tuoi + "Gioi tinh: " + GioiTinh);
    }
    }
    public static void main(String[] args) throws Exception {

    }

