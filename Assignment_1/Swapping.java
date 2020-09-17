import java.util.Scanner;

class Swapping{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two numbers a and b resp : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println("Before swap a = "+a+" b = "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;
		
		System.out.println("After swap a = "+a+" b = "+b);
	}
}