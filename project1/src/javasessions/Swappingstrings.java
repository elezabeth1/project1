package javasessions;

public class Swappingstrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Hello";
		String b="World";
		System.out.println("Before  swapping the values of a and b");
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("After swapping the values of a and b");
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);

	}

}
