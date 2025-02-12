public class AccountTest {
    public static void main(String[] args) {
        Account myAccount = new Account("1234", 10000.0); // Set acct to active state
        myAccount.activate(); //display "Account is already activated!"

        //Suspend the account
        myAccount.suspend(); // display "Account is suspended!"

        //Activate the account
        myAccount.activate(); //display "Account is activated!"

        //Deposit to the account
        myAccount.deposit(1000.0);// update balance and displays account number and
                                                // current balance. Call the toString() method in deposit(). 

        myAccount.withdraw(100.0);// update balance and displays account number and
                                                // current balance. Call the toString() method in withdraw().   

        myAccount.close(); //display "Account is closed!"
        
        myAccount.activate(); //display "You cannot activate a closed account!"
        
        myAccount.suspend(); //display "You cannot suspend a closed account!"
        
        //Withdraw to the account
        myAccount.withdraw(500.0);// Show message "You cannot withdraw on a closed account!". Call the toString() to show current balance and account number.

        //Deposit to the account
        myAccount.deposit(1000.0);// Show message "You cannot deposit on closed //account!". Call the toString() to show current balance and account number.

    }
}
