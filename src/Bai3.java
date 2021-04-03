import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Nhap so nguyen a: ");
        long a = s.nextLong();
        if(a%5==0 && a%3==0){
            System.out.println("FizzBuzz");
        }
        else if(a%3==0){
            System.out.println("Fizz");
        }
        else if(a%5==0){
            System.out.println("Buzz");
        }
        else {
            System.out.println("a chi la so a ^^");
        }
    }
}
