public class Main {
    public static void main(String[] args) {
        
        BankAccount account = new BankAccount(1000);

        
        ATM atmMachine = new ATM(account);

        
        atmMachine.userInterface();
    }
}
