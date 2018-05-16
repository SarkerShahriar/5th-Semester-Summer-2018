package codePackage;

public class customer extends Person
{
    String customertype;
    String purchaseItem;
  
    
    
    public void inputcustomerType(){
        System.out.println("Input Customer Name: ");
        name=input.next();
        System.out.println("Input Customer Type: ");
        customertype=input.next();
        
        
    }
    
    public void printcustomerType(){
        System.out.println("Customer Type is: "+customertype);
    }
}
