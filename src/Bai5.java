import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Giai phuong trinh bac 2: ");
        System.out.println("Nhap a: ");
        double a = s.nextDouble();
        System.out.println("Nhap b: ");
        double b = s.nextDouble();
        System.out.println("Nhap c: ");
        double c = s.nextDouble();
        double delta = b*b - 4*a*c;
        if (a ==0) System.out.println("phuong trinh co nghiem x=" + -c/b);
        else {
            if (delta < 0) System.out.println("Phuong trinh vo nghiem");
            else if (delta == 0) System.out.println("phuong trinh co nghiem kep x1=x2=" + -b / 2 * a);
            else {
                System.out.println("phuong trinh co 2 nghiem phan biet x1=" + (-b + Math.sqrt(delta)) / 2 * a);
                System.out.println("x2= " + (-b + Math.sqrt(delta)) / 2 * a);
            }
        }
    }

}
