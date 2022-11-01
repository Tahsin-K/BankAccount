package se.lexicon;

public class BankAccount {

    //fields
    public static int counter = 2500;

    private int accountNumber;
    private double balance; // 1000
    private String customerName;
    private String email;
    private String phoneNumber;

    public BankAccount(double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = ++counter;
        this.balance = balance;
        setCustomerName(customerName);
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public void deposit(double amount) {
        this.balance = this.balance + amount;

    }

    public void withdraw (double amount) 
        {
        if(this.balance < amount){
            System.out.println("U have insufficient balance so cannot withdraw");
        } else
        this.balance = this.balance - amount;
        }
          
    


        public int getAccountNumber () {
            return accountNumber;
        }


        public double getBalance () {
            return balance;
        }

        public void setBalance ( double balance){
            this.balance = balance;
        }

        public String getCustomerName () {
            return customerName;
        }

        public void setCustomerName (String customerName){
            if (customerName == null)
                throw new IllegalStateException("customer name was null");
            this.customerName = customerName;
        }

        public String getEmail () {
            return email;
        }

        public void setEmail (String email){
            this.email = email;
        }

        public String getPhoneNumber () {
            return phoneNumber;
        }

        public void setPhoneNumber (String phoneNumber){
            this.phoneNumber = phoneNumber;
        }
    }
