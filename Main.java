package codePackage;

public class Main 
{
    public static void main(String[] args) {
        
        customer cust1=new customer();
        cust1.inputcustomerType();
        cust1.printName();
        cust1.printcustomerType();
        
        
        
        Stuff stuff1=new Stuff();        
        stuff1.stuffInfo();
        stuff1.printName();
        stuff1.displayStuffInfo();
        
        Owner owner1=new Owner();
        owner1.InputOwnerInfo();
        owner1.printName();
        System.out.println("Owner Company Name: "+owner1.returnOwnerCompanyName());
    }
}
