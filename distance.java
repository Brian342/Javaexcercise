import java.util.Scanner;
public class distance {
    public static void main(String[] args){
        /*  Write a program that accepts distance traveled in metres and the time taken 
        in minutes and then outputs the speed in kilometers per hour (km/h).
         E.g. if someone enters a distance (in metres) of 500 and a time (in minutes) 
         of 15 the output for speed should be 2 km/h.*/

         Scanner input = new Scanner(System.in);

         System.out.print("Enter your distance in (metres): ");
         int distance = input.nextInt();

         System.out.print("Enter time in (minutes): ");
         int time = input.nextInt();

        
        double convert_metres_to_km = distance / 1000.0;
        double convert_minutes_to_hour = time / 60.0;

        double speed = convert_metres_to_km / convert_minutes_to_hour;

        System.out.print("The speed is: "+Math.round(speed)+ " km/h");
        input.close();


    }
    
}
