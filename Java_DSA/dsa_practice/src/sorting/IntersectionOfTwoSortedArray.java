package sorting;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoSortedArray {
	
	public static void basicApproch(int a[], int b[], int m, int n) {
		for(int i=0;i<m;i++) {
			
			if(i>0 && a[i]==a[i-1]) {
				continue;
			}
			
			for(int j=0;j<n;j++) {
				if(a[i]==b[j]) {
					System.out.print(a[i] + " ");
					break;
				}
			}
		}
	}
	
	public static void advanceApproch(int a[], int b[], int m, int n) {
		int i = 0, j = 0;
		
		while(i<m && j<n) {
			
			if(i>0 && a[i] == a[i-1]) {
				i++;
				continue;
			}
			
			if(a[i]<b[j]) {
				i++;
			} else if(a[i]>b[j]) {
				j++;
			} else {
				System.out.print(a[i] + " ");
				i++;
				j++;
			}
		}
	}
	
	public static void moreAdvanceApproch(int a[], int b[]) {
		List<Integer> ans = new ArrayList<>();
		Set<Integer> set = new HashSet<>();
		
		for(int num: a) {
			set.add(num);
		}
		
		for(int num: b) {
			if(set.contains(num)) {
				ans.add(num);
				set.remove(num);
			}
		}
		
		for(Integer num : ans) {
			System.out.print(num + " ");
		}
	}
	
	public static void main(String[] args) {
		int a[] = {4,9,5};
		int b[] = {9,4,9,8,4};
		
		basicApproch(a, b, a.length, b.length);
		//advanceApproch(a, b, a.length, b.length);
		System.out.println();
		moreAdvanceApproch(a, b);
	}

}
