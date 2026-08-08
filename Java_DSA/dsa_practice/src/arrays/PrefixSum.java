package arrays;

public class PrefixSum {
	
	public static int solution(int arr[], int i, int j) {
		for(int k=1;k<arr.length;k++) {
			arr[k] = arr[k] + arr[k-1];
		}
		
		
		int res = getSum(arr, i, j);
		
		return res;
	}
	
	public static int getSum(int arr[], int i, int j) {
		if(j==0) return arr[j];
		
		return arr[j] - arr[i-1];
	}
	
	public static void main(String[] args) {
		int arr[] = {5,-2,3,4};
		
		int ans = solution(arr,2,3);
		
		System.out.println(ans);
	}

}
