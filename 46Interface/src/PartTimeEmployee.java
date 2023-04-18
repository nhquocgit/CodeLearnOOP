public class PartTimeEmployee extends Employee {
    private int workHours;
    public PartTimeEmployee(String name, int paymentPerHour, int workHours) {
        super(name, paymentPerHour);
        this.workHours = workHours;
    }
    @Override
    public int calculateSalary(){
        return this.workHours*super.getPaymentPerHour();
    }
}
