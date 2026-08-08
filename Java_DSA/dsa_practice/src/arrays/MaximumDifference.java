package arrays;

public class MaximumDifference {
	
	public static void basicSolution(int arr[]) {
		int res = arr[1] - arr[0];
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				res = Math.max(arr[j]-arr[i], res);
			}
		}
		
		System.out.println(res);
	}
	
	public static void advanceSolution(int arr[]) {
		int res = arr[1]-arr[0];
		int min = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			res = Math.max(arr[i]-min, res);
			min = Math.min(min,arr[i]);
		}
		
		System.out.println(res);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {2,3,10,6,4,8,1};
		
		advanceSolution(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
