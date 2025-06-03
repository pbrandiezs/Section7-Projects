public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount alpha = new BankAccount("Alpha");
        BankAccount bravo = new BankAccount("Bravo", 25);
        System.out.println(alpha.getOwner() + " " + alpha.getBalance());
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());

        bravo.deposit(5);
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());

        bravo.withdraw(10);
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());

        bravo.withdraw(-10);
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());

        bravo.deposit(-55);
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());

        bravo.withdraw(100);
        System.out.println(bravo.getOwner() + " " + bravo.getBalance());
    }
}
