package arrays;

public class FindSecondLarge {
	
	public static int solution(int arr[]) {
		int firstLarge = 0;
		int secondLarge = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>firstLarge) {
				secondLarge = firstLarge;
				firstLarge = arr[i];
			} else if(arr[i]<firstLarge && arr[i]>secondLarge) {
				secondLarge = arr[i];
			}
		}
		return secondLarge;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,100,5,100,10,8};
		
		int ans = solution(arr);
		
		System.out.println(solution(arr));
	}

}
