package com.ojas.polymorphism.employeemanager;

class Employee1{
    
    int  employeeId;
    String  employeeName;
    double basicSalary;
    double grossSalary;
    
    public Employee1() {
        super();
    }

    public Employee1(int employeeId, String employeeName, double basicSalary) {
        super();
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.basicSalary = basicSalary;
        
    }

 

    public double getBasicSalary() {
        return basicSalary;
    }

 
    public void setBasicSalary(double basicSalary) {
        this.basicSalary = grossSalary;
    }
    
    
}


class Manager extends Employee1{
    
    Manager(){
        
    }
    
    public Manager(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
        
    }
    @Override

    public void setBasicSalary(double basicSalary) {
         grossSalary = basicSalary + ((15 * basicSalary) / 100);
    }
    
    
    public void displayManager() {
        System.out.println( "Manager [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
                + ", grossSalary=" + grossSalary + "]");
    }
        
}

class Trainee extends Employee1{

    Trainee(){
        
    }
    public Trainee(int employeeId, String employeeName, double basicSalary) {
        super(employeeId, employeeName, basicSalary);
        
    }
   
    @Override
    public void setBasicSalary(double basicSalary) {
         grossSalary = basicSalary + ((10 * basicSalary) / 100);
    }


    public void displayTrainee() {
        System.out.println( "Trainee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", basicSalary=" + basicSalary
                + ", grossSalary=" + grossSalary + "]");
    }
    
}
public class EmployeeManager {
	public static void main(String[] args) {
			
		Manager m = new Manager(11,"venu",2000.00);
		m.setBasicSalary(4000);
		m.displayManager();
		
		Trainee  t = new Trainee(12,"gopal",1000.00);
		t.setBasicSalary(2000);
		t.displayTrainee();
	
	}

}
