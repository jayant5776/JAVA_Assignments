import java.util.Scanner;

public class RemainCal{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of days : ");
		int days = sc.nextInt();
		int year = days/365;
		days = days % 365;
		
		System.out.println("No. of years : "+year);
		
		int week = days / 7;
		
		days = days % 7;
		
		System.out.println("No. of weeks : "+week);
		System.out.println("No. of days : "+days);
	}
}