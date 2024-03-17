import java.util.Scanner;
public class measurement {
    public static void main(String[] args){
        /* Write a program that accepts measurements in cm and converts them into metres. If someone enters 200 for example, the output should take the form;
        200 cm = 2 metres.*/ 
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your measurement(in cm): ");
        int num = sc.nextInt();

        int convert_cm_to_meters = num / 100;

        System.out.println(num+" cm"+" = "+convert_cm_to_meters+" metres");

        
    }
}
