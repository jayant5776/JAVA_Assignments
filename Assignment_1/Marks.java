import java.util.Scanner;

class Marks{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Marks of 5 subjects : ");
		int sub1 = sc.nextInt();
		int sub2 = sc.nextInt();
		int sub3 = sc.nextInt();
		int sub4 = sc.nextInt();
		int sub5 = sc.nextInt();
		
		double sum = (double)(sub1+sub2+sub3+sub4+sub5);
		
		double per = sum/500*100;
		
		System.out.println("percentage marks = "+per+" %");
	}
}