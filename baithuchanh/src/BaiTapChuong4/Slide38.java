package BaiTapChuong4;

import java.util.LinkedList;

public class Slide38 {
    public static void main(String[] args) {
        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Grapes");
        LinkedList<String> list2 = new LinkedList<>();
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Grapes");

        System.out.println("Danh sach 1: " + list1);
        System.out.println("Danh sach ban dau: " + list1);
        list1.addFirst("Yellow");
        System.out.println("Danh sach khi them phan tu vao dau: " + list1);
        list1.addLast("Green");
        System.out.println("Danh sach khi them phan tu vao cuoi: " + list1);
        String element = list1.get(2);
        System.out.println("Phan tu o vi tri thu 2: " + element);
        list1.remove(1);
        System.out.println("Danh sach khi xoa phan tu o vi tri thu 1: " + list1);
        list1.removeFirst();
        System.out.println("Danh sach khi xoa phan tu dau tien: " + list1);
        list1.removeLast();
        System.out.println("Danh sach khi xoa phan tu cuoi cung: " + list1);
        System.out.println("Danh sach 2: " + list2);
        list1.removeAll(list2);
        System.out.println("Danh sach 1 sau khi xoa cac phan tu cua list2: " + list1);

        list1 = new LinkedList<>();
        list1.add("Apple");
        list1.add("Banana");
        list1.add("Orange");
        list1.add("Grapes");

        list2 = new LinkedList<>();
        list2.add("Banana");
        list2.add("Cherry");
        list2.add("Grapes");

        list1.retainAll(list2);
        System.out.println("Cac phan tu chung giua danh sach 1 va danh sach 2: " + list1);
    }
}