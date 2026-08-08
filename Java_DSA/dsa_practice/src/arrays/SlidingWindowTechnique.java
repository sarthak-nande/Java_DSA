package arrays;

public class SlidingWindowTechnique {
	
	public static int maxSum(int arr[], int k) {
		int currSum = 0;
		for(int i=0;i<k;i++) {
			currSum = currSum+arr[i];
		}
		int res = 0;
		for(int i=k;i<arr.length;i++) {
			currSum = currSum+arr[i]-arr[i-k];
			res = Math.max(res, currSum);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,8,30,-5,20,7};
		
		int ans = maxSum(arr,4);
		
		System.out.println(ans);
	}

}
