package searching;

public class CountOnesInSortedArray {
	
	public static int solution(int arr[], int n, int x) {
		
		int low = 0, high = n - 1;
		
		while(low<=high) {
			
			int mid = (low+high)/2;
			
			if(arr[mid]==0) {
				low = mid + 1;
			}else {
				if(mid==0 || arr[mid-1]==0) {
					return n-mid;
				} else {
					high = mid - 1;
				}
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,1};
		
		int index = solution(arr,arr.length,5);
		System.out.println(index);
	}

}
