package searching;

public class FindPeakElement {
	
	public static int solution(int arr[], int n) {
		int low = 0, high = n - 1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			
			if((mid==0 || arr[mid]>=arr[mid-1]) && (mid==n-1 || arr[mid]>=arr[mid+1])) {
				return mid;
			}
			
			if(mid>0 && arr[mid-1] > arr[mid]) {
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,4,60,5,7};
		
		System.out.println(solution(arr, arr.length));
	}

}
