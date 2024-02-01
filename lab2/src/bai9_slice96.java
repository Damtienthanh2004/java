import java.util.Scanner;

public class bai9_slice96 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap vao mot chuoi bat ky: ");
        String n = scanner.nextLine();
        int demkytuthuong = 0;
        int demkytuhoa = 0;
        int demso = 0;
        for (int i = 0; i < n.length(); i++) {
            char s = n.charAt(i);
            if (Character.isLowerCase(s)) {
                demkytuthuong++;
            } else if (Character.isUpperCase(s)) {
                demkytuhoa++;
            } else if (Character.isDigit(s)) {
                demso++;
            }
        }
        System.out.println("so ky tu thuong: " + demkytuthuong);
        System.out.println("so ky tu hoa: " + demkytuhoa);
        System.out.println("so chu so: " + demso);

        scanner.close();
    }
}
