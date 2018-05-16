package codePackage;

public class Stuff extends Person
{
    String stuffDesignation;
    Double stuffSalary;
    String companyName;
    
    public void stuffInfo(){
        System.out.println("Input Stuff name: ");
        name=input.next();
        System.out.println("Input Stuff Designation: ");
        stuffDesignation=input.next();
        System.out.println("Input Stuff Salary: ");
        stuffSalary=input.nextDouble();
    }
    
    public void displayStuffInfo(){
        System.out.println("Stuff Designation:"+stuffDesignation);
        System.out.println("Stuff Salary: "+stuffSalary);
    }
}
