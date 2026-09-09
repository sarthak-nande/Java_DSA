package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithGivenSum {
	
	public static boolean subArrayOfSum(int arr[], int sum) {
		Set<Integer> set = new HashSet<>();
		int preSum = 0;
		for(int i=0;i<arr.length;i++) {
			preSum += arr[i];
			
			if(preSum == sum) {
				return true;
			}
			
			if(set.contains(preSum-sum)) {
				return true;
			}
			
			set.add(arr[i]);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,3,2,-1};
		
		System.out.println(subArrayOfSum(arr, 4));
	}

}
