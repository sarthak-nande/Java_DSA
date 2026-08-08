package arrays;

public class MuaximumSumCircularArray {
	
	public static int basicSolution(int arr[]) {
		int n = arr.length;
		int res = 0;
		for(int i=0;i<arr.length;i++) {
			int currSum = arr[i];
			int currMax = arr[i];
			
			for(int j=1;j<arr.length;j++) {
				int index = (i+j)%n;
				currSum = currSum + arr[index];
				currMax = Math.max(currMax, currSum);
			}
			
			res = Math.max(currMax, res);	
		}
		return res;
	}
	
	public static int normalMaxSum(int arr[]) {
		int maxSum = arr[0];
		int res = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxSum = Math.max(maxSum, maxSum+arr[i]);
			res = Math.max(maxSum, res);
		}
		
		return res;
	}
	
	public static int advanceSoltion(int arr[]) {
		int normalSum = normalMaxSum(arr);
		if(normalSum<0) {
			return normalSum;
		}
		int currSum = 0;

		
		for(int i=0;i<arr.length;i++) {
			currSum = currSum+arr[i];
			arr[i]= -arr[i];
		}
		
		int maxCircular = currSum + normalMaxSum(arr);
		
		maxCircular = Math.max(normalSum, maxCircular);
		
		return maxCircular;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {5,-2,3,4};
		
		int ans = advanceSoltion(arr);
		
		System.out.println(ans);
	}

}
