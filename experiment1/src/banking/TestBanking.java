package banking;
import banking.*;

public class TestBanking {
    public static void main(String[] args){
        Customer customer;
        Account account;
        //Createanaccountthatcanhasa500.00balance.

        System.out.println("Creating the customer Jane Smith");
        customer=new Customer("Jane","Smith",37);
        System.out.println("Creating her acount with a 500.00 balance");
        customer.setAccount(new Account(500.00));
        customer.setAge(40);
        customer.getAge();
        account=customer.getAccount();
        //Performsomeaccounttransactions
        System.out.println("Withdraw 150.00:"+account.withdraw(150.00));
        System.out.println("Deposit 22.50:" +account.deposite(22.50));
        System.out.println("Withdraw 47.62:"+ account.deposite(47.62));
        System.out.println("Withdraw 400.00:"+account.withdraw(400.00));
        //print out the final balance
        System.out.println("Customer ["+customer.getFirstName()+","+customer.getLastName()+","+customer.getAge()+"] has a balance of "+account.getBalance());
    }

}
