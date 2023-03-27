import java.util.Scanner;

public class Ex6 {

    // Method
    /**
     * Ex1
     * printType1 Chek number type [zero, negative, positive]*
     * 
     * @param num
     */
    public void printType1(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num < 0) {
            System.out.println(num + " is negative");
        } else {
            System.out.println(num + " is positive");
        }
    }

    /**
     * Ex2
     * printType2 Chek number type [odd, even]*
     * 
     * @param num
     */
    public void printType2(int num) {
        if (num == 0) {
            System.out.println(num + " is zero");
        } else if (num % 2 == 0) {
            System.out.println(num + " is even");
        } else {
            System.out.println(num + " is odd");
        }
    }

    /**
     * Ex3
     * CheckVowel [a, e, i, o, u]*
     * 
     * @param num
     */
    public void checkVowel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                c == 'A' || c == 'E' || c == 'I' || c == 'O'
                || c == 'U') {
            System.out.println("This character is a vowel.");
        } else {
            System.out.println("This character is not a vowel.");
        }
    }

    /**
     * Ex4
     * checkChar [Uppercase, Lowercaase, Not a letter]*
     * 
     * @param num
     */
    public void checkChar(char c) {
        if (Character.isUpperCase(c)) {
            System.out.println("This character is Uppercase");
        } else if (Character.isLowerCase(c)) {
            System.out.println("This character is Lowercase");
        } else {
            System.out.println("Not a letter");
        }
    }

    /**
     * Ex5
     * isPositive [Positive number]*
     * 
     * @param num
     */
    public void isPositive(int num, Scanner input) {
        while (num <= 0) {
            System.out.println("Please, enter a positive number");
            num = input.nextInt();
        }
        System.out.println("Positive number");
    }

    /**
     * Ex6
     * isOdd [Check is Odd]*
     * 
     * @param num
     */
    public void isOdd(int num, Scanner input) {
        do {
            System.out.println("Please, enter a number");
            num = input.nextInt();
        } while (num % 2 == 0);
        System.out.println("is Odd");
    }

    /**
     * Ex7
     * 
     * isOdd [Check is Odd]*
     * 
     * @param num
     */
    public void isDivideBy(int num, Scanner input) {
        System.out.print("Please enter number(N) : ");
        int n = input.nextInt();
        System.out.print("Please enter number(X) : ");
        int x = input.nextInt();
        String sum = "";
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                if (sum == "") {
                    sum = sum + i;
                } else {
                    sum = sum + "," + i;
                }
            }
        }
        System.out.println(sum);
    }

    /**
     * Ex8
     * 
     * isOdd [Check is Odd]*
     * 
     * @param num
     */
    public void printStarAdvance(int num, Scanner input) {
        System.out.print("Please enter number : ");
        int n = input.nextInt();
        String star = "*";
        System.out.println(star);
        for (int i = 1; i <= n; i++) {
            for (i = 1; i < n; i++) {
                star += "_";
                System.out.println(star + "*");
            }
        }
    }

    /*************************************************/
    // " Method "

    // Ex 1-2
    // public static void main(String[] args) {
    // Ex6 ex = new Ex6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please, enter a number: ");
    // int num = input.nextInt();
    // // ex.printType1(num);
    // // ex.printType2(num);
    // }

    // // Ex 3-4
    // public static void main(String[] args) {
    // Ex6 ex = new Ex6();
    // Scanner input = new Scanner(System.in);
    // System.out.println("Please, enter a charactor: ");
    // String text = input.next();
    // char c = text.charAt(0);
    // // ex.checkVowel
    // ex.checkChar(c);
    // }

    // Ex 5-6-7
    // public static void main(String[] args) {
    //     Ex6 ex = new Ex6();
    //     Scanner input = new Scanner(System.in);
    //     // System.out.println("Please, enter a number: ");
    //     // int num = input.nextInt();
    //     // ex.printType1(num);
    //     // ex.printType2(num);
    //     // ex.isPositive(num, input);
    //     //ex.isOdd(0, input);
    //     ex.isDivideBy(0, input);
    // }

    // // Ex 8
    // public static void main(String[] args) {
    //     Ex6 ex = new Ex6();
    //     Scanner input = new Scanner(System.in);
    //     ex.printStarAdvance(0, input);
    // }
}