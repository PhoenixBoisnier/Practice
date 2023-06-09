
public class SecondHighest {

	public static void main(String[] args) {

		SecondHighest finder = new SecondHighest();
		int[] arr = new int[10];
		for(int q = 0; q<10; q++) {
			arr[q] = q+1;
		}
		System.out.println("Second: "+finder.find(arr));
		arr = new int[20]; 
		for(int q = 0; q<20; q++) {
			arr[q] = q+1;
		}
		System.out.println("Second: "+finder.find(arr));
		
		arr[4] = 200;
		arr[13] = 201;
		System.out.println("Second: "+finder.find(arr));
	}
	
	public int find(int[] arr) {
		int highest = 0;
		int second = 0;
		for(int q = 0; q<arr.length; q++) {
			if(arr[q]>highest) {
				highest = arr[q];
			}
		}
		for(int q = 0; q<arr.length; q++) {
			if(arr[q]<highest&&arr[q]>second) {
				second = arr[q];
			}
		}
		return second;
	}

}
