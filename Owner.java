package codePackage;

public class Owner extends Person
{
    private String OwnerComapny;
    
    public void InputOwnerInfo(){
        System.out.println("Enter Owner name: ");
        name=input.next();
        System.out.println("Enter Company Name: ");
        OwnerComapny=input.next();
    }
    
    public String returnOwnerCompanyName(){
        return this.OwnerComapny;
    }
}
