import java.util.Scanner;
public class right_angle {
    public static void main(String[] args){
        //Write a program that computes the area of a right-angled triangle.
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();

        double area = 1/2.0*(base * height);
        System.out.print("The base is: "+base+ " The height is: "+height+" The area is: "+area);

        sc.close();
    }
}
