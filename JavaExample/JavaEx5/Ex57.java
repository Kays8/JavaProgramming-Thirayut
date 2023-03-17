import java.util.Scanner;

public class Ex57 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("normal hour");
        double Normal_hour = scan.nextDouble();
        System.ou.println("ot_hour");
        double ot_hour = scan.nextDouble();
        System.ou.println("Normal_late");
        double Normal_late = scan.nextDouble();
        double n_pay = Normal_hour * Normal_late;
        double ot_pay = ot_hour * (1.5 * Normal_late);
        double total_pay = n_pay + ot_pay;
        System.out.println(n_pay + "บาท");
        System.out.println(ot_pay + "บาท");
        System.out.println(total_pay + "บาท");
    }
}
