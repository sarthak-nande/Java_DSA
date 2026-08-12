package searching;

public class SearchInSortedRoatatedArray {
	
	public static int solution(int arr[],int n, int x) {
		
		int low = 0, high = n - 1;
		
		while(low<=high) {
			
			int mid = (low + high) / 2;
			
			if(arr[mid]==x) return mid;
			
			if(arr[low]<=arr[mid]) {
				if(x>=arr[low] && x<arr[mid]) {
					high = mid - 1;
				} else {
					low = mid + 1;
				}
			} 
			
			else {
				if(x>arr[mid] && x<=arr[high]) {
					low = mid + 1;
				}
				else {
					high = mid - 1;
				}
			}
		}
		return -1;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {100,200,400,500,1,3,9};
		int ans = solution(arr, arr.length-1, 9);
		System.out.println(ans);
	}

}
