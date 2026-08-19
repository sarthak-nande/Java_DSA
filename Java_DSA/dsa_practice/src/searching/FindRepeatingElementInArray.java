package searching;

public class FindRepeatingElementInArray {

	public static int solution(int arr[], int n) {
		int slow = arr[0], fast = arr[0];
		
		do {
			slow = arr[slow];
		    fast = arr[arr[fast]];
		} while(slow!=fast);
		
		slow = arr[0];
		
		while(slow!=fast) {
			fast = arr[fast];
			slow = arr[slow];
		}
		
		return slow;
	}
	
	public static void main(String[] args) {
		int arr[] = {1,2,3,5,6,4,3};
		
		System.out.println(solution(arr, arr.length));
	}
}
