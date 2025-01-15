// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("How many times do you want to print 'hello'?");
//         int repetitions = sc.nextInt();
//         int counter = 0 ;
//        while( counter < repetitions){
//         System.out.println("hello");
//         counter++;
//        }
//         sc.close();
// }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int number = sc.nextInt();
//         int counter = 1 ;
//         while( counter <= number){
//         System.out.println(counter);
//         counter++;
//        }
//         sc.close();
// }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         int i = 1 ;
//         int sum = 0;
//         while( i<= n){
//         sum = sum+i;
//         i++;
//        }
//        System.out.print("sum is :" + sum);
//         sc.close();
// }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         for(int i = 0; i<=n; i++){
//         System.out.print(i +" ");
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         for(int i = 1; i<=n; i++){
//         System.out.println("****");
//         }
//         sc.close();
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();
//         while(n > 0){
//              int lastDigit = n % 10;
//              System.out.print(lastDigit );
//              n = n / 10;
//             }
//     System.out.println();
//     sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();
//         int rev = 0;
//         while(n > 0){
//              int lastDigit = n % 10;
//              rev = (rev*10) + lastDigit;
//              n = n / 10;
//             }
//     System.out.println(rev);
//     sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();
//         int counter = 1;
//         do{
//         System.out.println("hi");
//         counter++;
//         }while(counter <=n);       
//         sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();

//         for(int i =1; i<=n; i++){
//             if(i==3) {
//                 break;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//         sc.close();
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         do{
//             System.out.print("enter a number : " );
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
//                 break;
//             }
//             System.out.println(n);
//         }while(true);
//         sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();

//         for(int i =1; i<=n; i++){
//             if(i==3) {
//             continue;
//             }
//             System.out.println(i);
//         }
//         System.out.println("I am out of the loop");
//         sc.close();
//     }
// }  //1 2 4


// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
        
//         do{
//             System.out.print("enter a number : " );
//             int n = sc.nextInt();
//             if(n % 10 == 0) {
//                 continue;
//             }
//             System.out.println(n);
//         }while(true);
//     }
// }


// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : " );
//         int n = sc.nextInt();

//         if(n==2) {
//             System.out.println("n is prime");
//         }else{
//             boolean isPrime = true;
//             for(int i = 2; i<=Math.sqrt(n); i++){
//              if(n%i==0) {
//               isPrime = false;
//              }
//             }
//             if(isPrime == true){
//              System.out.println("n is prime");
//             }else{
//              System.out.println("n is not prime");
//             }
//         }
      
//         sc.close();
//     }
// }

//  import java.util.Scanner;
//  public class loop{
//     public static void main(String[]args) {
//         Scanner sc = new Scanner(System.in);
//         int number;
//         int choice;
//         int evenSum=0;
//         int oddSum=0;
//         do{
//             System.out.print("Enter the number ");
//             number=sc.nextInt();
//         if(number%2==0) {
//             evenSum+=number;
//             }else{oddSum+=number;
//          }
//         System.out.print("Do you want to continue ? Press 1 for yes or 0 for no");
//         choice=sc.nextInt();
//        }while(choice==1);
//        System.out.println("Sum of even numbers: "+evenSum);
//        System.out.println("Sum of odd numbers: "+oddSum);
//        sc.close();
//     }   
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter a number : ");
//         int n = sc.nextInt();
//         for(int i = 1; i<=10; i++){
//         System.out.println(n + "*" + i+"=" +n*i);
//         }
//         sc.close();
//     }
// }

// import java.util.*;
// public class loop {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("enter any positive integer : ");
//         int num = sc.nextInt();
//         int fact = 1;
//         for(int i = 1; i<=num; i++){
//           fact = fact * i;
//         }
//         System.out.println("factorial : " + fact);
//         sc.close();
//     }
// }