public class casual extends Employee{
    private double dailyRate;
    private int daysWorked;

    public casual(String name, int Employee_number, int pin_number, int age, double dailyRate,int daysWorked) {
        super(name, Employee_number, pin_number, age);
        this.dailyRate = dailyRate;
        this.daysWorked=daysWorked;

    }

    @Override
    public double pay() {
        return dailyRate * daysWorked;
    }

}
