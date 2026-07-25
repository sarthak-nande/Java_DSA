package Practice;

public class PlayGround {
	
	public static boolean isSorted(int arr[], int i) {
		if(arr.length==1) return true;
		
		if(arr.length-1 == i) return true;
		
		return arr[i] < arr[i+1] ? isSorted(arr, i+1) : false;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,2,2,3,5};
		
		System.out.println(isSorted(arr, 0));
		
	}

}
