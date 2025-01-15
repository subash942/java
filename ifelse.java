// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the age :");
// int age = sc.nextInt();
// if(age>=18){
// System.out.println("You are adult");
// } else{
//     System.out.println("You are not adult");
// }

// sc.close();
//     }
// }


// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number :");
// int first = sc.nextInt();
// System.out.println("Enter the second number :");
// int second = sc.nextInt();
// if(first>second){
// System.out.println("first number is greater the second");
// } else{
//     System.out.println("second number is greater the first");
// }

// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the  number :");
// int number = sc.nextInt();
// if(number % 2 == 0){
//     System.out.println(" even");
// }else{
//     System.out.println(" odd");
// }
// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the age :");
// int age = sc.nextInt();
// if(age>=18){
// System.out.println("You are adult");
// } else if(age>=13 && age<18){
//     System.out.println("You are  teenager");
// }else{
//     System.out.println("You are child");
// }

// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the income :");
// int income = sc.nextInt();
// int tax;

// if(income<500000){
//     tax = 0;

// } else if(income >= 500000 && income < 1000000){
//     tax =(int) (income*0.2);
    
// }else{
//     tax =(int) (income*0.3);
    
// }
// System.out.println("tex is " + tax);
// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the first number :");
// int firstnum = sc.nextInt();
// System.out.println("Enter the second number :");
// int secondnum = sc.nextInt();
// System.out.println("Enter the third number :");
// int thirdnum = sc.nextInt();
// if(firstnum>secondnum && firstnum>thirdnum){
// System.out.println("first number is greater that is:" + firstnum);
// } else if(secondnum>thirdnum){
//     System.out.println("second number is greater that is: " + secondnum);
// }else{
//     System.out.println("third number is greater , that is: " + thirdnum);
// }

// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the a :");
// int a = sc.nextInt();
// System.out.println("Enter the b :");
// int b = sc.nextInt();
// System.out.println("Enter theoperator :");
//  char operator = sc.next().charAt(0);

//  switch(operator) {
//     case '+': System.out.println(a+b);
//               break;
//     case '-': System.out.println(a-b);
//               break;
//     case '*': System.out.println(a*b);
//               break;    
//     case '/': System.out.println(a/b);
//               break;  
//     case '%': System.out.println(a%b);
//               break; 
//      default : System.out.println("wroung operator");                       
//  }
//  sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the  number :");
// int number = sc.nextInt();
// if(number >1){
//     System.out.println(" positive");
// }else {
//     System.out.println(" negative");
// }
// sc.close();
//     }
// }

// import java.util.*;
// public class ifelse {
//     public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the  temp :");
// double temp = sc.nextDouble();
// if(temp >100){
//     System.out.println(" you have a fever");
// }else{
//     System.out.println("You don't have a fever ");
// }
// sc.close();
//     }
// }


// import java.util.*;
// public class ifelse {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);

//         System.out.println("Enter week number (1-7): ");
//         int week = sc.nextInt();

//         switch (week) {
//             case 1:
//                 System.out.println("Monday");
//                 break;
//             case 2:
//                 System.out.println("Tuesday");
//                 break;
//             case 3:
//                 System.out.println("Wednesday");
//                 break;
//             case 4:
//                 System.out.println("Thursday");
//                 break;
//             case 5:
//                 System.out.println("Friday");
//                 break;
//             case 6:
//                 System.out.println("Saturday");
//                 break;
//             case 7:
//                 System.out.println("Sunday");
//                 break;
//             default:
//                 System.out.println("Invalid input! Please enter week number between 1-7.");
//         }
//         sc.close();
//     }
// }

import java.util.*;

public class ifelse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the year: ");
        int year = sc.nextInt();

        boolean x = (year % 4) == 0;
        boolean y = (year % 100) != 0;
        boolean z = (year % 100 == 0) && (year % 400 == 0);

        if (x && (y || z)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }

        sc.close();
    }
}
