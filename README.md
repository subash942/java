import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the rate of interest (in percentage): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (in years): ");
        int time = scanner.nextInt();

        double interest = (principal * rate * time) / 100;

        System.out.println("Simple Interest: " + interest);
        System.out.println("Total Amount: " + (principal + interest));
    }
}
