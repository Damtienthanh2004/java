import java.util.LinkedList;
import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LinkedList<Integer> LL = new LinkedList<>();
        System.out.print("Nhap so phan tu n: ");
        int n = scanner.nextInt();
        for(int i = 0; i<n; i++){
            int num = scanner.nextInt();
            LL.add(num);
        }
        int count = 0;
        int sum = 0;
        for (Integer integer : LL) {
            if(integer %2 == 0){
                sum += integer;
                count ++;
            }
        }
        if(count > 0) {
            double avg = (double) sum/count;
            System.out.println("Trung binh cong cua cac so chan la: " + avg);
        }else{
            System.out.println("Khong co so chan nao trong danh sach");
        }
    }
}
