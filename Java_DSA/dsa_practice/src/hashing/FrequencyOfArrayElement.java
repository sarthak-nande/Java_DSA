package hashing;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfArrayElement {
	
	public static void frequency(int arr[]) {
		Map<Integer, Integer> set = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
		}
		
		for(Map.Entry<Integer, Integer> e : set.entrySet()) {
			System.out.println(e.getKey() + " : " + e.getValue());
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,2,3,1,2,3};
		frequency(arr);
	}

}
