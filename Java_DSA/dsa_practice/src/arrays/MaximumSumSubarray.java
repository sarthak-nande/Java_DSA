package arrays;

public class MaximumSumSubarray {
	
	public static int basicSolution(int arr[]) {
		int res = 0;
		int n = arr.length;
		
		for(int i=0;i<n;i++) {
			int curr = 0;
			for(int j=i;j<n;j++) {
				curr = curr + arr[j];
				res = Math.max(curr, res);
			}
			
		}
		return res;
	}
	
	public static int advanceSolution(int arr[]) {
		int res = 0;
		int n = arr.length;
		
		for(int i=1;i<n;i++) {
			arr[i] = Math.max((arr[i]+arr[i-1]), arr[i]);
			res = Math.max(arr[i], res);
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,-2,3,-1,2};
		
		int ans = advanceSolution(arr);
		
		System.out.println(ans);
	}

}
