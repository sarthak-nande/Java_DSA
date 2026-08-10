package searching;

public class RecursiveBinarySearch {
	
	public static int recursiveAlgorithum(int arr[],int low,int high, int x) {
		int mid = (low+high)/2;
		
		if(low>high) return -1;
		
		if(arr[mid] == x) return mid;
		else if(arr[mid]<x) {
			return recursiveAlgorithum(arr, mid+1, high, x);
		}else {
			return recursiveAlgorithum(arr, low, mid-1, x);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,5,6,9,10};
		int ans = recursiveAlgorithum(arr, 0, arr.length-1, 9);	
		System.out.println(ans);
	}

}
