package BaiTapChuong3.UngDungTinhLuong;
import BaiTapChuong3.UngDungTinhLuong.NhanVienFullTime;
import BaiTapChuong3.UngDungTinhLuong.NhanVienPartTime;
import BaiTapChuong3.UngDungTinhLuong.configs;
public class Main {
    public static void main(String[] args) {
        NhanVienFullTime sep = new NhanVienFullTime("Dam Tien Thanh", 4);
        sep.setLoaiChucVu(configs.Nhan_Vien_Sep);
        sep.tinhLuong();
        sep.xuatthongtin();
        System.out.println();

        NhanVienFullTime linh = new NhanVienFullTime("Nguyen Dang Quang", 2);
        linh.setLoaiChucVu(configs.Nhan_Vien_Linh);
        linh.tinhLuong();
        linh.xuatthongtin();
        System.out.println();

        NhanVienPartTime partTime = new NhanVienPartTime("Vu Ngoc Diep", 180);
        partTime.tinhLuong();
        partTime.xuatthongtin();
    }
}
