import java.util.Scanner;

public class Ex24{
    public static void main(String[] args) {
        int a,b,temp;
        a = 17;
        b = 25;
        System.out.println("Before swapping: a = "+a+", b = "+b);
        temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping: a = "+a+", b = "+b);
    }
}