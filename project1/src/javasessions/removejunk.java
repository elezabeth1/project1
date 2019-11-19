package javasessions;

public class removejunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="%$#*^)(@! hello world 12345";
		s=s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(s);

	}

}
