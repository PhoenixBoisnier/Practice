
public class Anagram {

	public static void main(String[] args) {

		System.out.println("Checking apes and sape: "+Anagram.check("apes", "sape"));
		System.out.println("Checking abcdefg and gfedcba: "+Anagram.check("abcdefg", "gfedcba"));
		System.out.println("Checking cow and wow: "+Anagram.check("cow", "wow"));
		System.out.println("Checking alphabet and betalpha: "+Anagram.check("alphabet", "betalpha"));
		System.out.println("Checking horseshit and bullshit: "+Anagram.check("horseshit", "bullshit"));

	}
	
	public static boolean check(String one, String two) {
		if(one.length()!=two.length()) {
			return false;
		}
		boolean checker = false;
		char[] oneChars = one.toCharArray();
		char[] twoChars = two.toCharArray();
		for(int q = 0; q<oneChars.length; q++) {
			for(int a = 0; a<twoChars.length; a++) {
				if(oneChars[q]==twoChars[a]) {
					oneChars[q] = 0;
					twoChars[a] = 0;
				}
			}
		}
		for(int q = 0; q<oneChars.length; q++) {
			if(oneChars[q]==twoChars[q]) {
				checker = true;
			}
			else checker = false;
		}
		return checker;
	}

}
