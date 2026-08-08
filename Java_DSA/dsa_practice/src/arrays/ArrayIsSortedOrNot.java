package arrays;

public class ArrayIsSortedOrNot {
	
	public static boolean basicSolution(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					return false;
				}
			}
		}
		return true;
	}
	
	public static boolean advanceSolution(int arr[]) {
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,6,7,3};
		
		boolean ans = advanceSolution(arr);
		
		System.out.println(ans);
	}

}
