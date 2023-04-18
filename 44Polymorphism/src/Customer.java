public class Customer extends Person{
    private int balance;
    public Customer(String name, String address, int balance) {
        super(name, address);
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    @Override
    public void display(){
        System.out.println("Customer Name: "+super.getName());
        System.out.println("Customer Address: "+super.getAddress());
        System.out.println("Customer Balance: "+ balance);
    }   
}
