 
            A payroll system for a certain organization maintains information about various types of employees 
            including Salaried, Casual and PartTime. All the employee receive a pay at the end of the month. 
            The salaried employees are paid a fixed monthly salary regardless of the hours worked. The Casual 
            workers are paid at the end of the month for the days worked based on a specified daily rate. The 
            PartTime employees are engaged on need basis and are paid by the hours worked and the hourly rate. 
            Further, part-time workers receive overtime pay (1.5 times the hourly rate) for all hours in excess of 160 per month. 
            The company wants to write a Java application that performs its payroll calculations polymorphically.
            Required
            a) Write the abstract class Employee maintaining name, employee number , pin number and age information for all categories of employees . 
                The class has methods to access and update the instance variables and a toString method to print employee information. 
                The class has an abstract method pay() that returns a double value representing the employee pay.
            b) Using inheritance, write the classes Salaried, Casual and PartTime include appropriate constructors and methods
            c) Write a driver program that exhaustively tests the classes above. Demonstrate polymorphism and dynamic binding. 
            // 1- Create classes for each type of employees (Salaried, Casual and Part Time).
            // 2- Implement a method to calculate gross pay for each type of employee.
            // 3- Display total earnings for all