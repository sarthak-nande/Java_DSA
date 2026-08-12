package searching;

public class TwoPointersApproch {
	
	public static boolean solution(int arr[], int n, int sum) {
		int i = 0, j = n-1;
		
		while(i<j) {
			if(arr[i] + arr[j] == sum) return true;
			
			if(arr[i]+arr[j]<sum) {
				i++;
			}else {
				j--;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,3,4,5,7,8};
		
		boolean ans = solution(arr, arr.length, 100);
		
		System.out.println(ans);
	}

}
