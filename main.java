public class main {
    static void main() {
        Account myAccount = new Account(10009287,1200,"Fitsum", "fitsum@gfd","090988658");
//        myAccount.withdrawFunds(300);
//        myAccount.depositFunds(600);
//        myAccount.setAccBalance(5000);
//        myAccount.setAccNumber(100078765);
//        myAccount.setCustomerName("Fitsum Tilahun");
//        myAccount.setEmail("fitsumeftah...");


        System.out.println("Name = " +myAccount.getCustomerName());
        System.out.println("Balance = "+ myAccount.getAccBalance());


    }
}