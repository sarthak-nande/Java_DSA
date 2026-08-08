package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayGround {
	
	public static int normalMaxSumArray(int arr[]) {
		int maxSum = arr[0];
		int res = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			maxSum = Math.max(arr[i], maxSum+arr[i]);
			res = Math.max(maxSum, res);
		}
		return res;
	}
	
	public static int solution(int arr[]) {
		int normalMaxSum = normalMaxSumArray(arr);
		
		if(normalMaxSum<0) {
			return normalMaxSum;
		}
		int maxSum = 0;
		for(int i=0;i<arr.length;i++) {
			maxSum = maxSum + arr[i];
			arr[i] = -arr[i];
		}
		
		int maxCircular = normalMaxSumArray(arr) + maxSum;
		maxCircular = Math.max(normalMaxSum, maxCircular);
		
		return maxCircular;
	}

    public static void main(String[] args) {
    	int arr[] = {5,-2,3,4};
		
		int ans = solution(arr);
		
		System.out.println(ans);
    }
}
