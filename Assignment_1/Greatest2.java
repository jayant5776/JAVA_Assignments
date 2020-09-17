import java.util.Scanner;

class Greatest2{
	public static void main(String arg[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Three numbers : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int greater = a > b ? (a > c ? a : c) : (b > c ? b : c);
		
		System.out.println("Greatest number is : "+greater);
	}
}