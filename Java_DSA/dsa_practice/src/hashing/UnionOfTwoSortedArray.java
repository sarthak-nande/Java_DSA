package hashing;

import java.util.HashSet;
import java.util.Set;

public class UnionOfTwoSortedArray {
	
	public static void union(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int num: a) {
			set.add(num);
		}
		
		for(int num: b) {
			set.add(num);
		}
		
		for(Integer num : set) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {20,10,40,30};
		int b[] = {30,20,60};
		
		union(a, b);
	}

}
