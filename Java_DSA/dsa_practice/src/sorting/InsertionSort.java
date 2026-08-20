package sorting;

public class InsertionSort {
	
	public static void insertionSort(int[] arr) {
		int n= arr.length;
		
		for(int i=1;i<n;i++) {
			int key = arr[i];
			int j = i-1;
			
			while(j>=0 && arr[j]>key) {
				arr[j+1] = arr[j];
				j--;
			}
			
			arr[j+1] = key;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,8,20,2,18};
		int n = arr.length;
		
		insertionSort(arr);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
