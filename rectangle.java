import java.util.Scanner;
public class rectangle {

    public static void main(String[] args){
        //Write a program that accepts the width and length of a rectangle and computes both it’s area and perimeter.
        
        Scanner Sc = new Scanner(System.in);

        System.out.print("Enter the width: ");
        int  width = Sc.nextInt();
        System.out.print("Enter the length: ");
        int length = Sc.nextInt();

        double area = width *  length;
        int perimeter  = 2*(width+length);

        System.out.println("The width is: "+width+ "\n The length is: "+length+"\n The area is: "+area+ "\n The perimeter is: "+perimeter);


    }
}
