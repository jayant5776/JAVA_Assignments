import java.util.Scanner;

class Interest{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount, roi, time : ");
		int amt = sc.nextInt();
		int roi = sc.nextInt();
		int time = sc.nextInt();
		
		double SI = (double)((amt*roi*time)/100);
		
		System.out.println("Simple interest : "+SI);
	}
}
		
		