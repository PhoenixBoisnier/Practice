
public class BubbleSort {

	public static void main(String[] args) {
		
		int[] arr = new int[10];
		
		for(int q = 0; q<10; q++) {
			arr[q] = (int) (Math.random()*50+1);
		}
		BubbleSort.printArr(arr);
		BubbleSort.sort(arr);
		BubbleSort.printArr(arr);
		System.out.println("\n");
		for(int q = 0; q<10; q++) {
			arr[q] = (int) (Math.random()*50+1);
		}
		BubbleSort.printArr(arr);
		BubbleSort.sort(arr);
		BubbleSort.printArr(arr);
		System.out.println("\n");
		for(int q = 0; q<10; q++) {
			arr[q] = (int) (Math.random()*50+1);
		}
		BubbleSort.printArr(arr);
		BubbleSort.sort(arr);
		BubbleSort.printArr(arr);
		System.out.println("\n");
	}
	
	public static void sort(int[] arr) {
		for(int a = 0; a<arr.length; a++) {
			for(int q = 0; q<arr.length; q++) {
				if(arr[q]>arr[a]) {
					int hold = arr[a];
					arr[a] = arr[q];
					arr[q] = hold;
				}
			}
		}
	}
	public static void printArr(int[] arr) {
		for(int i: arr) {
			System.out.print(""+i+" ");
		}
		System.out.println();
	}
}
