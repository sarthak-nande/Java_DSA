package searching;

public class IndexOfLastOccurance {
	
	public static int solution(int arr[],int n, int x) {
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
	
	public static void main(String[] args) {
		int arr[] = {2,3,5,5,6,9,9,9,10};
		
		int index = solution(arr,arr.length,5);
		System.out.println(index);
	}
}
