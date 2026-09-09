package hashing;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSumInUnsortedArray {
	
	public static boolean check(int arr[], int sum) {
		Set<Integer> set = new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			if(set.contains(sum-arr[i])) {
				return true;
			}else {
				set.add(arr[i]);
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {8,3,4,2,5};
		int sum = 6;
		
		System.out.println(check(arr,sum));
	}
}
