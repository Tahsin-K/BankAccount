package se.lexicon;

public class App {
    public static void main(String[] args) {


        BankAccount bankAccount1 = new BankAccount(0, "test", "test@gmail.com", "12234");
        bankAccount1.deposit(500.00);
        System.out.println(bankAccount1.getAccountNumber() + "   Balance: " + bankAccount1.getBalance());
        BankAccount bankAccount2 = new BankAccount(0, "putu", "tahsin@123.com", "1224");
        bankAccount2.deposit(500.00);
        bankAccount2.withdraw(700.00);
        System.out.println(bankAccount2.getAccountNumber() +  "    Balance" + bankAccount2.getBalance());
 

    }
}