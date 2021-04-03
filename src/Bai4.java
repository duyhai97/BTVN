import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("nhap so nguyen a: ");
        long a = s.nextLong();
        int count = 0;
        if(a<2) count = 0;
        else {
            for (int i = 2; i <= a ; i++) {
                if(a%i==0) count ++;
            }
        }
        if(count > 1) System.out.println(a + " khong phai 3SNT");
        else System.out.println(a + " la SNT");
    }
}
