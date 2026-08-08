package arrays;

public class MaximumConsecutive1s {
	
	public static int consecutive(int arr[]) {
		
		int count = 0;
		int temp = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==1) {
				temp++;
			} else {
				if(temp>count) {
					count  = temp;
					temp = 0;
				}
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		
		int arr[] = {1,0,1,1,1,1,0,1,1};
		
		int ans = consecutive(arr);
		
		System.out.println(ans);
		
	}

}
