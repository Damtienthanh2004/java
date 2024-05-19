import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

class Student {
    String Hoten;
    double Diem;
    Student(String ten, double diem) {
        this.Hoten = ten;
        this.Diem = diem;
    }
    public String toString() {
        return "Ho Ten: " + Hoten + ", Diem: " + Diem;
    }
}
public class Bai3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Student> students = new LinkedList<>();
        HashMap<String, Student> studentMap = new HashMap<>();
        while (true) {
            System.out.print("nhap ho ten cua sinh vien: ");
            String Hoten;
            Hoten = scanner.nextLine();
            if (Hoten.isEmpty()) {
                break;
            }
            System.out.print("nhap diem cua sinh vien: ");
            double Diem;
            Diem = scanner.nextDouble();
            scanner.nextLine();
            Student st = new Student(Hoten, Diem);
            students.add(st);
            studentMap.put(Hoten.toLowerCase(), st); 
        }
        System.out.println("\nsinh vien phai thi lai:");
        int count = 0;
        for (Student st : students) {
            if (st.Diem <= 5) {
                System.out.println(st);
                count++;
            }
        }
        System.out.println("so luong sinh vien phai thi lai: " + count);
        if (!students.isEmpty()) {
            double diemmax = students.get(0).Diem;
            for (Student st : students) {
                if (st.Diem > diemmax) {
                    diemmax = st.Diem;
                }
            }
            System.out.println("\nsinh vien co diem cao nhat: ");
            for (Student st : students) {
                if (st.Diem== diemmax) {
                    System.out.println(st);
                }
            }
        }
        System.out.println("\nnhap vao ho ten sinh vien can tim kiem: ");
        String timkiemten;
        timkiemten = scanner.nextLine().toLowerCase();
        if (studentMap.containsKey(timkiemten)) {
            System.out.println("thong tin sinh vien can tim la: " + studentMap.get(timkiemten));
        } else {
            System.out.println("khong tim thay thong tin sinh vien can tim " + timkiemten);
        }
    }
}