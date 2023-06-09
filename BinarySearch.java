
public class BinarySearch {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int q = 0; q<10; q++) {
			arr[q] = (int) (Math.random()*50+1);
		}
		BubbleSort.printArr(arr);
		arr[2] = 20;
		BubbleSort.sort(arr);
		BubbleSort.printArr(arr);
		System.out.println("\n");
		System.out.println("Has 20: "+BinarySearch.find(arr, 20, 0, arr.length));
		System.out.println("Has 30: "+BinarySearch.find(arr, 30, 0, arr.length));
		System.out.println("Has 40: "+BinarySearch.find(arr, 40, 0, arr.length));
		System.out.println("Has 50: "+BinarySearch.find(arr, 50, 0, arr.length));
		
	}
	
	public static boolean find(int[] arr, int value, int low, int high) {
	//	System.out.println(low+":"+high+", "+arr[(low+high)/2]);
		if(arr[(low+high)/2]==value) {
			return true;
		}
		if(low>=high||high-low==1) {
			return false;
		}
		if(arr[(low+high)/2]>value) {
			return find(arr,value,low,(low+high)/2);
		}
		if(arr[(low+high)/2]<value) {
			return find(arr,value,(low+high)/2,high);
		}
		return false;
	}

}
