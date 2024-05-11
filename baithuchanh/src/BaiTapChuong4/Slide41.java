package BaiTapChuong4;

import java.util.LinkedList;
import java.util.Scanner;
public class Slide41 {
public static void main (String[] args) {
    Scanner scanner = new Scanner (System. in);
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("Tháng 1");
    linkedList.add("Tháng 2");
    linkedList.add("Tháng 3");
    linkedList.add("Tháng 4");
    linkedList.add("Tháng 5");
    linkedList.add("Tháng 6");
    linkedList.add("Tháng 7");
    linkedList.add("Tháng 8");
    linkedList.add("Tháng 9");
    linkedList.add("Tháng 10");
    linkedList.add("Tháng 11");
    linkedList.add("Tháng 12");
    System.out.println("Nhap vao chi so cua phan tu can lay: ");
    int index = scanner.nextInt();
    if ((index < 0) || (index > (linkedList.size() - 1))) {
         System.out.println("chi so can lay phai lon hon 0 va nho hon " + (linkedList.size()-1));

} else {
        String node = linkedList. get (index);
        System.out.println("Phan tu co chi so = " + index + " trong linkedList la" + node);
    String firstNode = linkedList.getFirst();
    String lastNode = linkedList.getLast();
    System.out.println("Phan tu dau tien trong danh sach la " + firstNode + "; Phan tu cuoi cung trong danh sach la " + lastNode);
}
}
}
