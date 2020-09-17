class Expressions{
	public static void main(String arg[]){
	int x = 3;
	int y = (x*x) + (3*x) - 7;
	System.out.println(y);   //A
	y = x++ + ++x;
	System.out.println("x = "+x+" y = "+y); //B
	int z = x++ - --y - --x + x++;
	System.out.println("x = "+x+" y = "+y+" z = "+z); //C
	boolean a = true;
	boolean b = false;
	boolean c = a && b || !(a || b);
	System.out.println("c = "+c); // D
	}
}
	
		