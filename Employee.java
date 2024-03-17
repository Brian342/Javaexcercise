public abstract class Employee {
    private  String name;
    private int Employee_number;
    private int pin_number;
    private int age;
   
   // Constructor to initialize the details of an employee.
    public Employee(String name, int Employee_number, int pin_number, int age){
            this.name = name;
            this.Employee_number = Employee_number;
            this.pin_number= pin_number;
            this.age = age;
    }
    //setters and getters.
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public int getEmployeenumber(){
        return Employee_number;
    }
    public void setEmployeenumber(int Employee_number){
        this.Employee_number = Employee_number;
    }
    public int getPin() {
        return pin_number;
    }
    public  void setPin(int pin) {
        this.pin_number = pin;
    }
    public int getage(){
        return age;
    }
    public void setage(int age){
        this.age = age;
    }
    public abstract double pay();//abstract method for calculating the salary of an employee.
        
    @Override
    public  String toString() {
       return "Name: "+this.getname()+ 
       "\n" + "Employee Number :"+this.getEmployeenumber()+
       "\n" + "Pin:"+this.getPin() +
       "\n" + "Age:"+this.getage();
    }

}
