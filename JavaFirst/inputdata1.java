import java.util.Scanner;

public class inputdata1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print(" Enter your name : ");
        String name = input.nextLine();

        System.out.print(" Enter your surname : ");
        String surname = input.nextLine();

        System.out.print(" Enter your nickname : ");
        String nickname = input.nextLine();

        System.out.print(" Enter your major : ");
        String major = input.nextLine();

        System.out.print(" Enter your student ID : ");
        int ID = input.nextInt();


        input.close();

        System.out.println("---------------------------------");
        System.out.println("My name is " + name);
        System.out.println("My surname is " + surname);
        System.out.println("My nickname is " + nickname);
        System.out.println("I am studying is " + major);
        System.out.println("My student ID is " + ID);
    }
}
