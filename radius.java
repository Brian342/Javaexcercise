import java.util.Scanner;
//Write a program that accepts the radius of a circle and computes both it’s area and circumference
public class radius {
    public static void main(String[] args){
        int rad;
        double area,circumference;
        double pi =3.142;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius: ");
        rad = sc.nextInt();

        area = pi * Math.pow(rad, 2);
        circumference = 2 * pi *rad;

        System.out.println("The radius is: "+rad+" The area is: "+area+ " The circumference is: "+circumference);

        sc.close();
    }
}
