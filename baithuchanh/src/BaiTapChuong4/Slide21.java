package BaiTapChuong4;

import java.util.ArrayList;
public class Slide21 {
    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<String>(3);
        color.add("Pink");
        color.add("green");
        color.add("black");
        color.remove("brown");
        color.add("yellow");
        color.add("wind");
        System.out.println(color.get(4));
        System.out.println(color.contains("brown"));
        System.out.println(color.size());
        System.out.println("Danh sach ban dau: " + color);

        color.add(1, "grey");
        System.out.println("Danh sach khi them phan tu 'grey' vao vi tri thu nhat: " + color);

        String element = color.get(2);
        System.out.println("Phan tu o vi tri thu 2 la: " + element);

        boolean contains = color.contains("black");
        System.out.println("Danh sach co chua phan tu 'black' khong ? " + contains);

        color.remove("grey");
        System.out.println("Danh sach sau khi xoa phan tu 'grey': " + color);

        color.remove(0);
        System.out.println("Danh sach khi xoa phan tu dau: " + color);

        boolean isEmpty = color.isEmpty();
        System.out.println("Danh sach co rong khong ? " + isEmpty);
    }
}
