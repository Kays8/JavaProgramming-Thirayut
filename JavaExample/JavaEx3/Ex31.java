 import java.util.Scanner;
  public class Ex31{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = input.nextInt();
        if(number == 0){
           } else if (number%2 == 0){
                System.out.println("Even number");
            }else{
                System.out.println("Odd Number");
            }
        }
    }
  