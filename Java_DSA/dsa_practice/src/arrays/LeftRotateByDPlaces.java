package arrays;

public class LeftRotateByDPlaces {
	
	public static void leftRotateByOne(int arr[]) {
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = first;
	}
	
	public static void basicSolution(int arr[], int d) {
		for(int i=0;i<d;i++) {
			leftRotateByOne(arr);
		}
	}
	
	public static void mediumSolution(int arr[], int d) {
		int temp[] = new int[d];
		
		for(int i=0;i<d;i++) {
			temp[i] = arr[i];
		}
		
		for(int i=d;i<arr.length;i++) {
			arr[i-d] = arr[i];
		}
		
		for(int i=0;i<d;i++) {
			arr[arr.length-d+i] = temp[i];
		}
	}
	
	public static void advanceSoltion(int arr[], int d) {
		revrse(arr, 0, d-1);
		revrse(arr, d, arr.length-1);
		revrse(arr, 0, arr.length-1);
	}
	
	public static void revrse(int arr[], int low, int high) {
		while(low<high) {
			int temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		
		advanceSoltion(arr, 2);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
