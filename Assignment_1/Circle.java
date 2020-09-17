import java.util.Scanner;

class Circle{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Radius : ");
		int radius = sc.nextInt();
		
		double Circum = 2*3.1456*radius;
		
		double area = 3.1456*radius*radius;
		
		System.out.println("Circumference = "+Circum+" Area = "+area);
	}
}