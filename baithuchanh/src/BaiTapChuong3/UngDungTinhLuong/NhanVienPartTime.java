package BaiTapChuong3.UngDungTinhLuong;
import BaiTapChuong3.UngDungTinhLuong.configs;
public class NhanVienPartTime extends NhanVien {
    private int giolamviec;
    public NhanVienPartTime(String Name, int giolamviec){
        this.Name = Name;
        this.giolamviec = giolamviec;
    }
    @Override
    public String loainhanvien() {
         return"nhan vien thoi vu";
    }
    public void tinhLuong(){
        Luong = configs.Luong_Nhan_Vien_PartTime_Moi_Gio * giolamviec;
    }
}
