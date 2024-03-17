public class inheritance_polymorphisim {
    public  static void main(String[] args) {
       Employee emp1 = new salaried("James", 1, 213, 
       30, 60000);
       Employee emp2 = new casual("Michael", 2, 456, 
       37, 4.5,10);
       Employee emp3 = new part_time("Alice",3,516,
       29,20,4.5);

       double salary1 = emp1.pay();
       double salary2 = emp2.pay();
       double salary3 = emp3.pay();

       System.out.println("Employee 1: " + emp1.getname() + " Employeenumber: "+emp1.getEmployeenumber()+
       "\n" +" pin: "+emp1.getPin()+ " Age: " + emp1.getage()+" monthlysalary: " +salary1);
       System.out.println();
       System.out.println("Employee 2: " + emp2.getname() + " Employeenumber: "+emp2.getEmployeenumber()+
       "\n" +" pin: "+emp2.getPin()+ " Age: " + emp2.getage()+" monthlysalary: " +salary2);
       System.out.println();
       System.out.println("Employee 3: " + emp3.getname() + " Employeenumber: "+emp3.getEmployeenumber()+
       "\n" +" pin: "+emp3.getPin()+ " Age: " + emp3.getage()+" monthlysalary: " +salary3);
       System.out.println();




}
}