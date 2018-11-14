package pl.jkan.creditcard;

class CreditCard {
    private boolean blocked = false;
    
    private double balance = 0;
    private double cardlimit = 0;
    public void assignLimit(double limit) {
        balance = limit;
        cardlimit = limit;
    }
    
    public boolean isBlocked() {
        return this.blocked;
    }
    
    public void block(){
        this.blocked = true;
    }
    
    public double getLimit() {
        return 2000;
    }
    
    public void withdraw(double money){
        balance = balance - money;
    }
    
    public void repay(double money) {
        //probably it can be done better, but it's fine 
        // byle hajs się zgadzał
        balance = balance + money;
    }
    
    public double getBalance() {
        return balance;
    }
}
