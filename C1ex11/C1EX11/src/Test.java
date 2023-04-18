public class Test {
    public static void main(String[]args){
    Student[] students=new Student[4];
    students[0]=new Student("Tuan",24);
    students[1]=new Student("Nam",23);
    students[2]=new Student("Quoc",21);
    students[3]=new Student("Nhung",22);
    for (int i=0;i<students.length; i++){
        students[i].display();
        }
}
}
