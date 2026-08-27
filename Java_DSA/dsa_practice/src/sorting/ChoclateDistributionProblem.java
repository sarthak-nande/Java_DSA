package sorting;

import java.util.Arrays;

public class ChoclateDistributionProblem {
	
	public static int solution(int arr[], int m) {
		int n = arr.length;
		Arrays.sort(arr);
		int res = Integer.MAX_VALUE;
		
		for(int i=0;(m+i-1)<n;i++) {
			int temp =(arr[m+i-1]-arr[i]);
			res =  Math.min(temp,res);
		}
		
		return res;
	}
	public static void main(String[] args) {
		int arr[] = {7,3,2,4,9,12,56};
		int ans = solution(arr, 3);
		System.out.println(ans);
	}
}
