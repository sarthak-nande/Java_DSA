package searching;

public class BinarySearch {
	
	public static int searchingAlgoritham(int arr[], int n, int x) {
		
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(arr[mid] == x) {
				return mid;
			}else if(arr[mid]<x) {
				low = mid + 1;
			} else {
				high = mid -1;
			}
			
		}
		
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,9,10};
		
		int index = searchingAlgoritham(arr,arr.length,9);
		
		System.out.println(index);
	}

}
