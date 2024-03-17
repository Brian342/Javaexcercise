public class part_time extends Employee{
    private int  hoursWorked;
    private double hourRate;


    public part_time(String name, int Employee_number, int pin_number, int age, int hoursWorked, double hourRate) {
        super(name, Employee_number, pin_number, age);
        this.hoursWorked = hoursWorked;
        this.hourRate = hourRate;
    }

    @Override
    public double pay() {
        double calculatepay = hourRate * hoursWorked ;
        if(hoursWorked>160){
            calculatepay += (hoursWorked - 160) *hourRate * 1.5;
        }
        return calculatepay;
    }

}
