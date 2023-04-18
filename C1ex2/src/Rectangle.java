import java.util.Scanner;

class Rectangle{
	private double length;
	private double width;
	public void getInformation(){
		Scanner rtg=new Scanner(System.in);
		length=rtg.nextDouble();
		width=rtg.nextDouble();
	}
    public double getArea(){
		return length*width;
	}
	public double getPerimeter(){
		return (length+width)*2;
	}
	public void display(){
		System.out.println("Area: "+getArea());
		System.out.println("Perimeter: "+getPerimeter());
	}   }
class Test{
    public static void main(String[]args) {
            Rectangle r = new Rectangle();
            r.getInformation();
            r.display();
        }
}