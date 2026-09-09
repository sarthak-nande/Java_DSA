package hashing;

import java.util.HashSet;
import java.util.Set;

public class SubArrayWithZeroSum {
	
	public static boolean zeroSubArray(int arr[]) {
		Set<Integer> set = new HashSet<>();
		int preSum = 0;
		for(int i=0;i<arr.length;i++) {
			preSum += arr[i];
			if(set.contains(preSum)) {
				return true;
			}
			if(preSum == 0) {
				return true;
			}
			set.add(preSum);
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {-3,4,-3,-1,1};
		
		System.out.println(zeroSubArray(arr));
	}

}
