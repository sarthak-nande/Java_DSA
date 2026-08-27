package sorting;

import java.util.Arrays;

public class MinimumDifferenceInArray {
	
	public static int solution(int arr[]) {
		Arrays.sort(arr);
		int res = Integer.MAX_VALUE;
		
		for(int i=1;i<arr.length;i++) {
			int temp = arr[i] - arr[i-1]; 
			res = Math.min(temp, res);
		}
		
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,4,8,11};
		int ans = solution(arr);
		System.out.println(ans);
	}

}
