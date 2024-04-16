package BaiTapChuong3.UngDungTinhLuong;
import BaiTapChuong3.UngDungTinhLuong.configs;;
public class NhanVienFullTime extends NhanVien {
    private int NgayLamThem;
    private int LoaiChucVu;
    public NhanVienFullTime(String Name, int NgayLamThem){
        this.Name = Name;
        this.NgayLamThem = NgayLamThem;
        }
    
        public void setLoaiChucVu(int loaiChucVu) {
            this.LoaiChucVu = LoaiChucVu;
        }
    
        @Override
        public String loainhanvien() {
            return "Nhan vien full time";
        }
    
        public void tinhLuong() {
            long luongCoBan = (LoaiChucVu == configs.Nhan_Vien_Linh)
                                ? configs.Luong_Nhan_Vien_FullTime_Linh
                                : configs.Luong_Nhan_Vien_FullTIme_Sep;
            Luong = luongCoBan + NgayLamThem * configs.Luong_Nhan_Vien_PartTime_Moi_Gio;
    }
}
