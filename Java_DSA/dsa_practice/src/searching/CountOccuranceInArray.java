package searching;

public class CountOccuranceInArray {
	
	public static int lastOccurance(int arr[],int n, int x) {
		int low=0, high=n-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if(arr[mid]<x) {
				low = mid + 1;
			}else if(arr[mid]>x) {
				high = mid - 1;
			}else {
				
				if(mid!=n-1 && arr[mid] != arr[mid+1]) {
					return mid;
				}else {
					low = mid + 1;
				}
			}
		}
		return -1;
	}
	
	public static int firstOccurance(int arr[],int n, int x) {
			
			int low= 0, high=n-1;
			
			while(low<=high) {
				
				int mid = (low + high) / 2;
				
				if(arr[mid]<x) {
					low=mid+1;
				}else if(arr[mid]>x) {
					high=mid-1;
				}else {
					if(mid==0 || arr[mid-1]!=arr[mid]) {
						return mid;
					}else {
						high = mid -1;
					}
				}
			}
			return -1;
	}
	
	public static int countOccurance(int arr[], int n, int x) {
		int firstOccurance = firstOccurance(arr, n, x);
		if(firstOccurance == -1) { 
			return 0;
		} else {
			int lastOccurnace = lastOccurance(arr, n, x);
			 return lastOccurnace - firstOccurance + 1;
		}
		
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,5,5,6,9,9,9,10};
		
		int index = countOccurance(arr,arr.length,1);
		System.out.println(index);
	}

}
