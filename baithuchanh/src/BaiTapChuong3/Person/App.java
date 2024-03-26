package BaiTapChuong3.Person;

public class App {
    public static void main(String[] args) {
        System.out.println("nhan vien parttime");
        Employeeparttime Ept = new Employeeparttime();
        Ept.nhapCong();
        Ept.tinhLuong();
        Ept.xuatthongin();
    

        System.out.println("nhan vien fulltime");
        Employeefulltime Eft = new Employeefulltime();
        Eft.nhapSoNgay();
        Eft.tinhLuong();
        Eft.xuatthongin();
    }
}
