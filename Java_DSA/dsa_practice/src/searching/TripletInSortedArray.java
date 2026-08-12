package searching;

public class TripletInSortedArray {
	
	public static boolean twoPointers(int arr[], int n, int sum, int si) {
		int i = si, j = n-1;
		
		while(i<j) {
			if(arr[i] + arr[j] == sum) return true;
			
			if(arr[i]+arr[j]<sum) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	
	public static boolean solution(int arr[], int n, int sum) {
		for(int i=0;i<n-2;i++) {
			if(twoPointers(arr, n, sum-arr[i], i+1)) {
				return true;
			}
			
		}
		return false;
	}

	public static void main(String[] args) {
		
		int arr[] = {1,3,4,5,7,8};
		
		boolean ans = solution(arr, arr.length, 5);
		
		System.out.println(ans);
	}
}
