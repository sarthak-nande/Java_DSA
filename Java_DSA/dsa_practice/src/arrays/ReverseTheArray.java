package arrays;

public class ReverseTheArray {
	
	public static void reverse(int arr[]) {
		int low = 0, high = arr.length-1;
		
		while(high>low) {
			int temp = 0;
			temp = arr[low];
			arr[low] = arr[high];
			arr[high] = temp;
			low++;
			high--;
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,80,5,100,10,8};
		
		reverse(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		
	}

}
