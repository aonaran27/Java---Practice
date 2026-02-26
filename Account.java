public class Account {
    private long accNumber ;
    private double accBalance  ;
    private String customerName ;
    private String email ;
    private String phoneNumber  ;

    public Account(){
        System.out.println("Empty constructor called.");
    }

    public Account(long accNumber, double accBalance , String customerName , String email , String phoneNumber){
        System.out.println("Account constructor with parameters called.");
        this.accBalance = accBalance;
        this.accNumber = accNumber;
        this.customerName = customerName;
        this.email= email;
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double depositAmount){
        accBalance += depositAmount;
        System.out.println("Deposit made : "+ depositAmount + " New balance = " + this.accBalance);
    }
    public void withdrawFunds(double withdrawAmount){
        if (accBalance - withdrawAmount < 0){
            System.out.println("Insufficient fund " + " Your current balance is : "+ accBalance);
        }else {
            accBalance -= withdrawAmount ;
            System.out.println("You withdrawal is "+ withdrawAmount +
            " ,Your current balance : "+ accBalance);
        }
    }

    public long getAccNumber(){
        return accNumber ;
    }

    public double getAccBalance() {
        return accBalance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setAccNumber(int accNumber){
        this.accNumber = accNumber ;
    }

    public void setAccBalance(int accBalance) {
        this.accBalance = accBalance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
