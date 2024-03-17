import java.util.Scanner;
public class degreecelcius {
    public static void main(String[] args){
        // Write a program that accepts temperature in degrees Celsius and converts and outputs it in degrees Fahrenheit.

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in (degree celsius): ");
        int temp = sc.nextInt();

        double convert_degree_celsius_to_fahrenheit = temp * 9.0 / 5.0 + 32.0;

        System.out.println("The temp in degree celsius: "+temp+ " after converting: "+convert_degree_celsius_to_fahrenheit);
        sc.close();
    }
}
