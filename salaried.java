public class salaried extends Employee{
    private double monthlysalary;

    public salaried(String name, int Employee_number, int pin_number, int age,double monthlysalary) {
        super(name, Employee_number, pin_number, age);
        this.monthlysalary = monthlysalary;
        
    }

    @Override
    public double pay() {
        return monthlysalary;
    }

    

}
