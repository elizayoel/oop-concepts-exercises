package Lab_Oct02_Classes_Objects;

public class Example {
    public static void main(String[] args) {
        Account a1 = new Account();
        System.out.println("OBJECT CREATED IN DEFAULT CONSTRUCTOR");
        a1.display();

        System.out.println("SET ATTRIBUTE VALUE");
        a1.setId(1222);
        a1.setBalance(20000);
        a1.setAnnualInterestRate(0.045);
        a1.setAccountStatus("Permanent");
        a1.display();

        System.out.println("MONEY WITHDRAWAL");
        a1.withdraw(2500);
        a1.display();

        System.out.println("DEPOSIT");
        a1.deposit(3000);
        a1.display();

        // kalau mau print manual dari sini, pakai get
        System.out.println("Balance : " + a1.getBalance());
    }
}

// public class should be declared as the file name, therefore this class can't be public
class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private String accountStatus;

    // DEFAULT CONSTRUCTOR
    // EXPLICIT EMPTY CONSTRUCTOR
    public Account (){
        id = 0;
        balance = 0.0;
        annualInterestRate = 0.0;
        accountStatus = "Temporary"; // this will make all objects created have the same value "Temporary"
    }
    // GETTER
    public int getId(){
        return id;
    }
    public double getBalance(){
        return balance;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }
    public double getMonthlyInterestRate(){
        return annualInterestRate/12;
    }
    public String getAccountStatus() {
        return accountStatus;
    }

    // SETTER
    public void setId(int id){
        this.id = id;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void setAnnualInterestRate(double rate){
        annualInterestRate = rate;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    // NORMAL METHOD (ADDITIONAL FUNCTIONS)
    public void withdraw (double amount){
        if(balance<amount) System.out.println("Insufficient Balance");
        else balance = balance - amount;
    }
    public void deposit (double amount){
        balance = balance + amount;
    }
    public void display(){
        System.out.println("ID\t\t\t\t\t\t: " + id);
        System.out.println("Balance\t\t\t\t\t: " + balance);
        System.out.println("Annual Interest Rate\t: " + annualInterestRate);
        System.out.println("Account Status\t\t\t: " + accountStatus);
        System.out.println();
    }
}

