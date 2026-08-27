package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class PlayGround {
	
	public static void solution(int a[], int b[]) {
		Set<Integer> set = new HashSet<>();
		
		for(Integer num: a) {
			set.add(num);
		}
		
		for(Integer num: b) {
			set.add(num);
		}
		
		for(Integer num: set) {
			System.out.print(num + " ");
		}
	}

    public static void main(String[] args) {
//    	int a[] = {10,20,50};
//		int b[] = {5,50,50};
//		
//		solution(a,b);
    	
    	if('c'>'b') {
    		System.out.println("true");
    	}
		
    }
}
