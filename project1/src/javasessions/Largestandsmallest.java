package javasessions;

import java.util.Arrays;

public class Largestandsmallest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {-100,-88,24,50,7777};
		int smallest=a[0];
		int largest=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}
			else if(a[i]<smallest) {
				smallest=a[i];
			}
		}
		System.out.println("The array given in sorted order is "+Arrays.toString(a));
		System.out.println("The largest number is "+largest);
		System.out.println("The smallest number is "+smallest);
		
	}

}
