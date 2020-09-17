import java.util.Scanner;

class Marriage{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter gender male or female : ");
		String gen = sc.next();
		System.out.println("Enter Age : ");
		int age = sc.nextInt();
		
		if (((gen == "female") && (age >= 18)) || ((gen == "male") && (age >= 21)))
		{
			System.out.println("Eligible for Marriage");
		}
		else
		{
			System.out.println("Not Eligible for Marriage");
		}
	}
}