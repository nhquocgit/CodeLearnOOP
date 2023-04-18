public class Entry {
    public static void main(String[] args){
        IEmployee[] employees = new IEmployee[2];
        employees[0]= new PartTimeEmployee("Trung", 4500, 7);
        employees[1]= new FulltimeEmployee("Linh", 6500);
        for(int i=0; i<employees.length;i++){
            System.out.println("Name: "+employees[i].getName());
            System.out.println("Salary per day: "+employees[i].calculateSalary());
        }
    }
}
 