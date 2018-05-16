package codePackage;

import java.util.Scanner;

public class Person 
{
    String name;
    String address;
    String age;
    String phoneNo;
    Scanner input;

    public Person() {
        input =new Scanner(System.in);
        
    }
    
    public void InputName(){
        
        name=input.next();
    }
    
    public void printName(){
        System.out.println("Name is: "+name);
    }
}
