package hashing;

import java.util.HashSet;
import java.util.Set;

public class CountDistinctElements {
	
	public static int count(int arr[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<arr.length;i++) {
			set.add(arr[i]);
		}
		
		return set.size();
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,1,2,3};
		int ans = count(arr);
		System.out.println(ans);
	}

}
