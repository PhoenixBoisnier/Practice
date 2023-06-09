
public class PowerOfTwo {

	public static void main(String[] args) {
		
		System.out.println("2: "+PowerOfTwo.check(2));
		System.out.println("8: "+PowerOfTwo.check(8));
		System.out.println("16: "+PowerOfTwo.check(16));
		System.out.println("17: "+PowerOfTwo.check(17));
		System.out.println("255: "+PowerOfTwo.check(255));
		System.out.println("256: "+PowerOfTwo.check(256));

	}
	
	public static boolean check(int n) {
		if(n==1) {
			return true;
		}
		else if(n%2==0) {
			return check(n/2);
		}
		else return false;
	}

}
