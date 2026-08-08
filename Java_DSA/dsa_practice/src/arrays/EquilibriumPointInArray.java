package arrays;

public class EquilibriumPointInArray {
	
	public static boolean basicSolution(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			int leftSum = 0, rightSum=0;
			
			for(int j=0;j<i;j++) {
				leftSum = leftSum + arr[j];
			}
			
			for(int j=i+1;j<arr.length;j++) {
				rightSum = rightSum + arr[j];
			}
			
			if(leftSum==rightSum) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean advanceSolution(int arr[]) {
		int rs = 0;
		for(int i=0;i<arr.length;i++) {
			rs = rs + arr[i];
		}
		
		int ls = 0;
		
		for(int i=0;i<arr.length;i++) {
			rs = rs - arr[i];
			
			if(ls==rs) {
				return true;
			}
			
			ls = ls + arr[i];
		}
		return false;
		
	}
	
	public static void main(String[] args) {
		int arr[] = {4,-2,2};
		
		 boolean ans = advanceSolution(arr);
		
		System.out.println(ans);
	}

}
