package recusrion;

public class SubsetOfSum {
	
	public static int sumUp(int arr[], int n, int sum) {
		if(n==0) {
			return sum==0? 1 : 0;
		}
		
		return sumUp(arr, n-1, sum) + sumUp(arr, n-1, sum-arr[n-1]);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,15};
		int res = sumUp(arr, arr.length, 25);
		System.out.println(res);
	}

}
