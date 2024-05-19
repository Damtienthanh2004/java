import java.util.Scanner;

public class Bai10_slice96 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        do{
            System.out.print("Nhap vao mot chuoi bat ky: ");
            n = sc.nextLine();
        } while(n.length() > 80);
        System.out.print("Nhap ki tu : ");
        char a = sc.next().charAt(0);
        int sum = 0;
        for(int i = 0;i < n.length(); ++i){
            if(n.charAt(i) == a)
                ++sum;
        }
        System.out.println("Ki tu " + a + " xuat hien " + sum + " lan");
    }
}
