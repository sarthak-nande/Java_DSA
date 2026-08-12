package searching;

public class SearchInInfiniteSizedArray {
	
	public static int binarySearch(int arr[], int low, int high, int x) {
			
			
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
		
	public static int solution(int arr[], int n, int x) {
		int i = 1;
		
		if(arr[0] == x) return 0;
		
		while(arr[i] < x) {
			i = i * 2;
			if(arr[i] ==x) return i;
		}
		
		
		return binarySearch(arr, (i/2)+1, i-1, x);
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5,10,20,30,40,50,65,70,75,80,90,95,100,105,110,115,120,125};
		
		int ans = solution(arr, arr.length, 50);
		
		System.out.println(ans);
	}

}
