import java.util.Scanner;

public class slice40 {
    public static void main(String[] args) {
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap vao mot so ngay trong tuan (tu 1 den 7): ");
        a = scanner.nextInt();
        switch (a) {
            case 1:
                System.out.println("ngay thu hai");
                break;
            case 2:
                System.out.println("ngay thu ba");
                break;
            case 3:
                System.out.println("ngay thu tu");
                break;
            case 4:
                System.out.println("ngay thu nam");
                break;
            case 5:
                System.out.println("ngay thu sau");
                break;
            case 6:
                System.out.println("ngay thu bay");
                break;
            case 7:
                System.out.println("ngay chu nhat");
                break;
            default: 
            System.out.println("so ngay khong hop le");
        }
    }
}
