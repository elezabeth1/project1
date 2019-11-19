package javasessions;

import java.util.HashSet;
import java.util.Set;

public class duplicateelement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String names[]= {"Java","Javascipt","C","Python","Java"};
     Set<String> a=new HashSet<String>();
     for(String name : names) {
    	 if(a.add(name)== false){
    		 System.out.println("The duplicate element is "+name);
    	 }
     }
	}

}
