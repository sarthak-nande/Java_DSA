package arrays;

public class LeftRotateArrayByOne {
	
	public static void solution(int arr[]) {
		int first = arr[0];
		
		for(int i=1;i<arr.length;i++) {
			arr[i-1] = arr[i];
		}
		
		arr[arr.length-1] = first;
	}
	
	public static void main(String[] args) {
		int arr[] = {2,80,5,100,10,8};
		
		solution(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
