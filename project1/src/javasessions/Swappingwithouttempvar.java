package javasessions;

public class Swappingwithouttempvar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int y=5;
		x=x+y;//x=15
		y=x-y;//y=10
		x=x-y;//x=5
		System.out.println("The value of x is "+x);
		System.out.println("The value of y is "+y);

	}

}
