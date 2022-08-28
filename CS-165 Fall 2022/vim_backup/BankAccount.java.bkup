/**

  20220823  -  JLF

  CS165
  Lab 1.24 Lab 0: Using Objects

  !!! this got a 8/10.  There is something wrong with "transfer to savings"
  !!! git on it

*/





public class BankAccount {
    private String customerName;
    private double checkingAccountBallance;
    private double savingsAccountBallance;


    // set the customer name to parameter newName, set the checking account balance to
    // parameter amt1 and set the savings account balance to parameter amt2. (amt stands for amount)
    public BankAccount(String newName, double amt1, double amt2) {
        customerName = newName;
        checkingAccountBallance = amt1;
        savingsAccountBallance = amt2;
    }

    // set the customer name
    public void setName(String newName) {
        customerName = newName;
    }

    // return the customer name
    public String getName() {
        return customerName;
    }

    // set the checking account balance to parameter amt
    public void setChecking(double amt) {
        // *****
        System.out.println("checkingAccountBallance => " + checkingAccountBallance);
        checkingAccountBallance = amt;
    }

    // return the checking account balance
    public double getChecking(){
        return checkingAccountBallance;
    }

    // set the savings account balance to parameter amt
    public void setSavings(double amt){
        savingsAccountBallance = amt;
    }

    // return the savings account balance
    public double getSavings(){
        return savingsAccountBallance;
    }

    // add parameter amt to the checking account balance (only if positive)
    public void depositChecking(double amt) {
        if ( amt > 0 )
        {
        // *****
        System.out.println("checkingAccountBallance => " + checkingAccountBallance);
            checkingAccountBallance += amt;
        // *****
        System.out.println("checkingAccountBallance => " + checkingAccountBallance);
        }
    }

    // add parameter amt to the savings account balance (only if positive)
    public void depositSavings(double amt){
        if ( amt > 0 )
        {
            savingsAccountBallance += amt;
        }
    }

    // subtract parameter amt from the checking account balance (only if positive)
    public void withdrawChecking(double amt) {
        if ( amt > 0 )
        {
        // *****
        System.out.println("checkingAccountBallance => " + checkingAccountBallance);
        
            checkingAccountBallance -= amt;
        // *****
        System.out.println("checkingAccountBallance => " + checkingAccountBallance);
        }
    }

    // subtract parameter amt from the savings account balance (only if positive)
    public void withdrawSavings(double amt){
        if ( amt > 0 )
        {
            savingsAccountBallance -= amt;
        }
    }

    // subtract parameter amt from the checking account balance and add to the
    // savings account balance (only if positive)
    public void transferToSavings(double amt){
        if ( amt > 0 )
        {
            System.out.println("checkingAccountBallance => " + checkingAccountBallance);
            System.out.println("savingsAccountBallance => " + savingsAccountBallance);
            System.out.println("amt => " + amt);
                    
            checkingAccountBallance -= amt;
            savingsAccountBallance += amt;
            System.out.println("checkingAccountBallance => " + checkingAccountBallance);
            System.out.println("savingsAccountBallance => " + savingsAccountBallance);
            System.out.println("amt => " + amt);
        }
    }


} // end of class

