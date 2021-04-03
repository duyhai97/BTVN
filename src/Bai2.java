import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("nhap vao so a: ");
        long a = s.nextLong();
        System.out.println("nhap vao so b: ");
        long b = s.nextLong();
        System.out.println("nhap vap so c: ");
        long c = s.nextLong();

        if((a+b)>c && (b+c)>a && (a+c)>b){
            System.out.println(a + "," + b + "," + c + " la 3 canh cua 1 tam giac");
        }
        else {
            System.out.println(a + "," + b + "," + c + " khong phai 3 canh cua 1 tam giac");
        }
    }
}
