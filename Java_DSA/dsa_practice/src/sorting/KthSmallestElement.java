package sorting;

public class KthSmallestElement {
	
	public static int solution(int arr[],int k) {
		int low = 0, high = arr.length-1;
		
		while(low<=high) {
			int p = LomutoPartition.solution(arr, low, high);
			
			if(p==k-1) {
				return p;
			}else if(p>k-1) {
				high = p - 1;
			}else {
				low = p + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int arr[] = {10,4,5,8,11,6,16};
		int ans = solution(arr, 5);
		System.out.println(ans);
	}

}
