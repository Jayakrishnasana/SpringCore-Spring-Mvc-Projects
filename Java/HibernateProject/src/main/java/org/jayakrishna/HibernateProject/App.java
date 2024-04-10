package org.jayakrishna.HibernateProject;



import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Customer customer = new Customer();
        customer.setName("Legain3");
        customer.setAddress("GTK3");
        
        Customer customer1 = new Customer();
        customer1.setName("Legain4");
        customer1.setAddress("GTK4");
        
        
        
        
        BankAccount b1 = new BankAccount();
        b1.setCustomer(customer);
        b1.setCustomer(customer1);
        b1.setName("SBI");
        b1.setAccountNumber("999999999999");
        
        BankAccount b2 = new BankAccount();
        b1.setCustomer(customer1);
        b2.setCustomer(customer);
        b2.setName("ICICI");
        b2.setAccountNumber("8888888888888");
        
        BankAccount b3 = new BankAccount();
        b1.setCustomer(customer1);
        b3.setCustomer(customer);
        b3.setName("CANARA");
        b3.setAccountNumber("777777777777777");
        
        List<BankAccount> list=new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        
        customer.setAccount(list);
        
        BankRepository repo = new BankRepository();
        repo.saveCustomer(customer);
        System.out.println("hello");
        
        
        
        
    }
}
