package BaiTapChuong3.UngDungTinhLuong;

public class NhanVien {
    protected String Name;
    protected long Luong;
    public NhanVien() {

    }
    public NhanVien(String Name){
        this.Name = Name;
    }
    protected String loainhanvien(){
        return "";
    }
    public void xuatthongtin(){
        System.out.println("Nhan Vien: " + Name);
        System.out.println("Chuc Vu: " + loainhanvien());
        System.out.println("Luong: " + Luong + "VND");
    }
    }
    

