

public class person {
    public String HoTen;
    public String QueQuan;
    public String NgheNghiep;
    public int NamSinh;
public person(){
    HoTen = "Dam Tien Thanh";
    QueQuan = "Bac Giang";
    NgheNghiep = "Sinh Vien";
    NamSinh = 2004;
}
public void inthongtin(){
    System.out.println(HoTen + "-" + QueQuan + "-" + NgheNghiep + "-" + NamSinh);
}
public void inthongtin(String Ten, String QueQuan, String NgheNghiep, int NamSinh){
    System.out.println(Ten + "-" + QueQuan + "-" + NgheNghiep + "-" + NamSinh);
}
}
