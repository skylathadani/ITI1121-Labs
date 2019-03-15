public class Account{

   private double balance;

   public Account() {
	    this.balance=0;
   }

   public double getBalance() {
     return balance;
   }

   public void deposit(double amount){
	    this.balance = this.balance+amount;
   }

   public void withdraw(double amount){
	    if(balance - amount < 0){
         String message = "You do not have enough money to withdraw " + amount + "$";
         throw new NotEnoughMoneyException(amount,this.balance, message);
       }else{
         this.balance = this.balance-amount;
       }
   }
}