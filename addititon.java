//Write a program that accepts three numbers and computes their sum, product and average. 
import java.util.Scanner;

public class addititon {

    public static void main(String[] args) {
    
    double avg, prod;

    Scanner scanner = new Scanner(System.in);

    System.out.println("Enter the 3 intergers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();

        int sum = num1 + num2 + num3;

        prod = num1 * num2 * num3;
        avg = sum / 3;

        System.out.println("your values are: "+num1+ " "+num2+" "+num3+": The sum is: "+sum +" The average is: "+avg+ " The product is: "+prod);

    }
    
}
