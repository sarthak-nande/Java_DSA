package arrays;

public class SubArrayWithGivenSum {
	
	public static boolean basicSolution(int arr[], int sum) {
		
		for(int i=0;i<arr.length;i++) {
			int currSum = 0;
			for(int j=i;j<arr.length;j++) {
				currSum = currSum + arr[j];
				if(currSum == sum) {
					return true;
				}
			}
		}
		return false;
	}
	
	public static boolean advanceApproch(int arr[], int sum) {
		int index = 0;
		int currSum = 0;
		
		for(int i=0;i<arr.length;i++) {
			currSum = currSum+arr[i];
			while(currSum>sum) {
				currSum = currSum - arr[index];
				index++;
			}
			
			if(currSum == sum) {
				return true;
			}
		}
		
		return false;
	}
	
	
	public static void main(String[] args) {
		int arr[] = {5,-2,2,4};
		
		boolean ans = basicSolution(arr,3);
		
		System.out.println(ans);
	}

}
