package pl.jkan.creditcard;

class CreditCard {
    private boolean blocked = false;
    public void assignLimit(double money) {
        
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
}