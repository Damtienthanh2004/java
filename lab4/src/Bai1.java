import java.util.*;

public class Bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> Arr = new ArrayList<>();
        System.out.print("Nhap so phan tu ban muon nhap : ");
        int n = scanner.nextInt();
        for(int i = 0; i < n; ++i){
            int num = scanner.nextInt();
            Arr.add(num);
        }
        int max = -1;
        for(int value : Arr)
            max = Math.max(max , value);
        System.out.println("Gia tri lon nhat la : " + max);

        ArrayList<Integer> tmp = new ArrayList<>();
        System.out.print("Gia tri muon xoa : ");
        int num = scanner.nextInt();
        tmp.add(num);
        Arr.removeAll(tmp);
        Collections.sort(Arr);
        System.out.println("Danh sach sau khi xoa: " + Arr);
    }
}