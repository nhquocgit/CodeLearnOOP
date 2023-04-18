import java.util.Scanner;
public class student {
        private String name;
        private int age;
        public void getInformation(){
            Scanner std= new Scanner(System.in);
            name=std.next();
            age=std.nextInt();
        }
        public void display(){
            System.out.println("Name:"+name);
            System.out.println("Age:"+age);
    
        }
    }
