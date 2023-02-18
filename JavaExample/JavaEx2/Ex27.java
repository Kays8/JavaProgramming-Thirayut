/*7.จงเขียนโปรแกรมด้วยภาษาจาวาเพื่อคำนวณหาราคาสินค้ารวม vat (7% ของราคาสินค้า) โดยรับชื่อสินค้า ราคาสินค้า ที่ซื้อสินค้าจากคีย์บอร์ด (สินค้า 1 ชนิด) แล้วแสดงราคาสินค้าทางจอภาพ
*/

import java.util.Scanner;
    public class Ex27{
        public static void main(String[] args){

            Scanner input = new Scanner(System.in);
            final double vat = 0.07;
            System.out.println("ProductName: ");
            String Product = input.nextLine();
            System.out.println("Price: ");
            Double Price = input.nextDouble();
            Double sum = (Price * vat);
            Double all = (Price * sum);
            System.out.println("ProductName: "+ Product + " Price: "+ Price +" vat: "+ sum + " final: "+ all);
        }
    }