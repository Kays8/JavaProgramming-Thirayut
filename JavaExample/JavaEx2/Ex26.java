/*6. จงเขียนโปรแกรมด้วยภาษาจาวาที่รับตัวเลขทศนิยม 2 จำนวน (a และ b) ทางคีย์บอร์ด จากนั้นแสดงผลลัพธ์ของสมการ (a-b)(a+b) ทางจอภาพ
A =? 2.3
B = ? 3.2
(2.3 - 3.2)(2.3+3.2) = xxxxx
*/

    import java.util.Scanner;

    public class Ex26{
        public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.print("Enter Decimal 2 digits 1st digit : ");
    float Frist = input.nextFloat();
    System.out.print("Enter Decimal 2 digits 2nd digit : "); 
    float Second = input.nextFloat();
    float output = (Frist-Second)*(Frist+Second);
    System.out.println(" ( "+Frist+" - "+Second+" )"+"( "+Frist+" + "+Second+" ) "+" = "+output);
        }
    }
