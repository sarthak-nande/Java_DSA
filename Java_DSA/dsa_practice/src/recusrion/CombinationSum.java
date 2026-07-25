package recusrion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	
public static void generate(List<List<Integer>> result, List<Integer> currentList ,int sum, int arr[], int i) {
		
		if(sum==0) {
			result.add(new ArrayList<Integer>(currentList));
			return;
		}
		
		if(sum<0 || i==arr.length) {
			return;
		}
		
		currentList.add(arr[i]);
		
		generate(result, currentList, sum-arr[i], arr, i+1);
		
		currentList.remove(currentList.size()-1);
		
		generate(result, currentList, sum, arr, i+1);
		
	}
	
	public static void main(String[] args) {
		
		List<List<Integer>> result  = new ArrayList<List<Integer>>();
		List<Integer> currentList = new ArrayList<Integer>();
		int arr[] = {2, 3, 6, 7};
		
		int sum = 7;
		
		generate(result, currentList , sum, arr, 0);
		
		
		
		System.out.println(result);  
		
	}

}
