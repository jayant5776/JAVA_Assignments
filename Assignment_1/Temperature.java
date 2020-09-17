import java.util.Scanner;

class Temperature{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Temp in Fahrenheit : ");
		double f = sc.nextInt();
		
		double c = 5*(f-32)/9;
		
		System.out.println("Temp in Celsius : "+c);
	}
}
		