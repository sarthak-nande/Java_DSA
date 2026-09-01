package sorting;

public class BubbleSort {
	public static void swap(int arr[],int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void basicApproch(int arr[], int n) {
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				System.out.println(j);
				if(arr[j] > arr[j+1]) {
					swap(arr,j,j+1);
				}
			}
		}
	}
	
	public static void advanceApproch(int arr[], int n) {
		boolean isSwaped = false;
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(arr[j]>arr[j+1]) {
					swap(arr, j, j+1);
					isSwaped = true;
				}
			}
			if(isSwaped == false) {
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {4,6,2,7,1};
		int n = arr.length;
		
		basicApproch(arr, n);
		//advanceApproch(arr, n);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	}

}
