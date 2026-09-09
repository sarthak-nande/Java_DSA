package hashing;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoUnsortedArray {
	
	public static void intersect(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<a.length;i++) {
			set.add(a[i]);
		}
		
		for(int i=0;i<b.length;i++) {
			if(set.contains(b[i])) {
				System.out.print(b[i] + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int a[] = {20,10,40,30};
		int b[] = {30,20,60};
		intersect(a, b);
	}

}
