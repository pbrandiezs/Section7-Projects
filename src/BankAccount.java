public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this(owner, 0);
        this.owner=owner;
    }//end no-arg ctor

    public BankAccount(String owner, int balance){
        if(balance <= 0) {
            System.out.println("Balance must be greater than 0");
        } else {
            this.balance = balance;
            this.owner = owner;
        }
    }//end ctor


    public void deposit(int amount){
        if(amount <= 0) {
            System.out.println("Deposit must be greater than 0");
        } else {
            balance = balance + amount;
        }
    }

    public void withdraw(int amount){
        if(amount <= 0) {
            System.out.println("Withdraw must be greater than 0");
        } else {
            if((balance - amount) < 0) {
                System.out.println("Withdraw exceeds funds available, not allowed!");
            } else {
                balance = balance - amount;
            }
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
}
