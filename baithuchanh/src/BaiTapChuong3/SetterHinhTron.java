package BaiTapChuong3;

public class SetterHinhTron {
    private final float PI = 3.14f;
    private float BanKinh;
    public void setbankinh(float BanKinh) {
        this.BanKinh = BanKinh;
    }
    public float getbankinh(){
        return BanKinh;
    }
    public float tinhchuvi() {
        return 2 * PI * BanKinh;
    }
    public float tinhdientich() {
        return PI * BanKinh * BanKinh;
    }
}
