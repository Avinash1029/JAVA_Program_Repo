package String_Programme;

public class Reverse_String {

	public static void main(String[] args) {
		
		
		String s = "Avinash Mali";
		
		String rev = "";
		
		for(int i=s.length()-1; i>=0; i--)
		{
			rev = rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
