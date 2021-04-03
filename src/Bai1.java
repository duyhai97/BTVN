import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        System.out.println("nhap so nguyen: ");
        long bb = aa.nextLong();

        if(bb>=0){
            System.out.println(bb + " La so nguyen duong");
        }
        else {
            System.out.println(bb + "la so nguyen am");
        }
    }
}
