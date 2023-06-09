
public class Palindrome {

	public static void main(String[] args) {

		System.out.println("Racecar: "+Palindrome.check("racecar"));
		System.out.println("mom: "+Palindrome.check("mom"));
		System.out.println("radar: "+Palindrome.check("radar"));
		System.out.println("towm: "+Palindrome.check("towm"));
		System.out.println("fun: "+Palindrome.check("fun"));
		
	}
	
	public static boolean check(String s) {
		for(int q = 0; q<s.length(); q++) {
			if(s.toCharArray()[q]!=s.toCharArray()[s.length()-1-q]) {
				return false;
			}
		}
		return true;
	}

}
