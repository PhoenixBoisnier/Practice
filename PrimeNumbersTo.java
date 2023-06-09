
public class PrimeNumbersTo {

	public static void main(String[] args) {

		PrimeNumbersTo.upTo(200);

	}

	public static void upTo(int n) {
		for(int q = 2; q<=n; q++) {
			if(PrimeNumbersTo.isPrime(q)) {
				System.out.println("Prime number found: "+q);
			}
		}
	}
	
	public static boolean isPrime(int n) {
		for(int q = 2; q<n; q++) {
			if(n%q==0) {
				return false;
			}
		}
		return true;
	}
}
