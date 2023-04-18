public class Student {
    private String name;
    private int age;
    public static int numberOfStudents;
    public Student(String name, int age){
        this.name=name;
        this.age=age;
        numberOfStudents++;
    }

}
