import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {

        // making an instance of the bank account class and giving it an initial amount
        BankAccount userAccount = new BankAccount(5000.00);
        BankAccount.CoolATM atm = new BankAccount.CoolATM(userAccount);
        atm.displayMenu();

    }
}


class BankAccount{

    private double balance;
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }

    public double getBalance(){
        return balance;
    }

    public void deposit(double amount){
        if(amount > 0){
            amount += balance;
            System.out.println("You successfully deposited $"+amount);
        }else{
            System.out.println("Deposit amount should not be less than 0");
        }
    }

    public boolean withdraw(double amount){
        if(amount >0 && amount <= balance){
            balance -= amount;
            System.out.println("You successfully withdrew $"+amount);
            return true;
        }else{
            System.out.println("Insufficient balance or invalid amount");
            return  false;
        }
    }



    static class CoolATM{
        private BankAccount account;
        public CoolATM(BankAccount account){
            this.account = account;
        }

        public void displayMenu() {
            Scanner scan = new Scanner(System.in);
            int choice;

            do {
                System.out.println("\nWELCOME TO ATM OPTIONS");
                System.out.println("1. Check Balance ");
                System.out.println("2. Deposit Cash");
                System.out.println("3. Withdraw Cash");
                System.out.println("4. Exit");
                System.out.println("Choose an option:");
                choice = scan.nextInt();
                switch (choice) {
                    case 1:
                        checkBalance();
                    case 2:
                        System.out.print("Enter amount to deposit:");
                        double depositAmount = scan.nextDouble();
                        account.deposit(depositAmount);
                    case 3:
                        System.out.print("Enter the amount you want to withdraw:");
                        double withdrawAmount = scan.nextDouble();
                        account.withdraw(withdrawAmount);

                    case 4:
                        System.out.println("Thanks for using our ATM !");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");


                }
            } while (choice != 4);
            scan.close();
        }
            private void checkBalance(){
                System.out.println("Current Balance: $" + account.getBalance());
            }

        }
    }




