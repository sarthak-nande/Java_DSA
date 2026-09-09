package hashing;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithGivenSum {
	
	public static int maxLen(int arr[], int sum) {
		Map<Integer, Integer> h = new HashMap<>();
		int pre_sum = 0, res = 0;
		
		for(int i=0;i<arr.length;i++) {
			pre_sum += arr[i];
			
			if(pre_sum == sum) {
				res = i + 1;
			}
			
			if(h.containsKey(pre_sum) == false) {
				h.put(pre_sum, i);
			}
			
			if(h.containsKey(pre_sum-sum)) {
				res = Math.max(res, i - h.get(pre_sum-sum));
			}
		}
		return res;
	}
	
	public static void main(String[] args) {
		int arr[] = {5,2,3};
		
		System.out.println(maxLen(arr, 5));
	}

}
