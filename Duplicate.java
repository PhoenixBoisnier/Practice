import java.util.ArrayList;

public class Duplicate {

	public static void main(String[] args) {

		int[] arr = new int[10];
		for(int q = 0; q<arr.length; q++) {
			arr[q] = q+1;
		}
		Duplicate.arrToString(arr);
		arr = Duplicate.remove(arr);
		Duplicate.arrToString(arr);
		
		arr[5] = 2;
		Duplicate.arrToString(arr);
		arr = Duplicate.remove(arr);
		Duplicate.arrToString(arr);
		
		for(int q = 0; q<arr.length; q+=2) {
			arr[q] = 1;
		}
		Duplicate.arrToString(arr);
		arr = Duplicate.remove(arr);
		Duplicate.arrToString(arr);
		
		for(int q = 0; q<arr.length; q++) {
			arr[q] = 2;
		}
		Duplicate.arrToString(arr);
		arr = Duplicate.remove(arr);
		Duplicate.arrToString(arr);
	}
	
	public static int[] remove(int[] arr) {
		ArrayList<Integer> temp = new ArrayList<>();
		for(int q = 0; q<arr.length; q++) {
			for(int a = q+1; a<arr.length; a++) {
				if(arr[q]==arr[a]) {
					arr[a] = 0;
				}
				else {
					
				}
			}
		}
		for(int q = 0; q<arr.length; q++) {
			if(arr[q]!=0) {
				temp.add(arr[q]);
			}
		}
		int[] ret = new int[temp.size()];
		for(int q = 0; q<ret.length; q++) {
			ret[q] = temp.get(q);
		}
		return ret;
	}
	
	public static void arrToString(int[] arr) {
		for(int i: arr) {
			System.out.print(""+i+" ");
		}
		System.out.println();
	}

}
