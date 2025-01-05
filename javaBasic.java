//Average of three number
// import java.util.*;
// public class javaBasic {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the value of A:");
// float A = sc.nextFloat();
// System.out.println("Enter the value of B:");
// float B = sc.nextFloat();
// System.out.println("Enter the value of C:");
// float C = sc.nextFloat();
// float Average = (A + B + C) / 3 ;
//    System.out.println("Average :" + Average);
//    sc.close();
//     }
// }


//Area of squre
// import java.util.*;
// public class javaBasic {
//     public static void main (String args[]){
//         Scanner sc = new Scanner(System.in);
//         float Side = sc.nextFloat();
//         float Area = Side * Side;
//         System.out.println(Area);
//         sc.close();
//     }
// }


// Enter three item
import java.util.*;
public class javaBasic {
    public static void main (String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Enter the value of pencil:");
float pencil = sc.nextFloat();
System.out.println("Enter the value of pen:");
float pen = sc.nextFloat();
System.out.println("Enter the value of eraser:");
float eraser= sc.nextFloat();
float Totalcast = (pencil + pen + eraser)  ;
   System.out.println("Bill is :" + Totalcast);

   float newTotal = Totalcast + (0.18f * Totalcast);
   System.out.println("Bill with 18% tax : "+newTotal);

   sc.close();
    }
}