package sorting;

public class InsertionSort {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static void basicApproch(int arr[], int n) {
		int temp[] = new int[n];
		
		for(int i=0;i<n;i++) {
			int min_index = 0;
			for(int j=1;j<n;j++) {
				if(arr[j]<arr[min_index]) {
					min_index = j;
				}
			}
			temp[i] = arr[min_index];
			arr[min_index] = Integer.MAX_VALUE;
		}
		
		for(int i=0;i<n;i++) {
			arr[i] = temp[i];
		}
	}
	
	public static void advanceApproch(int arr[], int n) {
		for(int i=0;i<n;i++) {
			int mid_index = i;
			
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[mid_index]) {
					mid_index = j;
				}
			}
			swap(arr, i, mid_index);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,8,20,2,18};
		int n = arr.length;
		
		advanceApproch(arr, n);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
