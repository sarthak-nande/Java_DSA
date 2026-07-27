package arrays;

public class InsertIntoArray {
	
	public static void insert(int arr[], int num, int i, int occupied, int n) {
		if(occupied == n) return;
		
		for(int j=occupied-1; j>=i-1;j--) {
			arr[j+1]=arr[j];
		}
		
		arr[i-1] = num; 
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[4];
		
		for(int i=0;i<arr.length-1;i++) {
			arr[i] = i;
		}
		
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
		insert(arr, 8, 3, 3, arr.length);
		
		System.out.println();
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}

}
