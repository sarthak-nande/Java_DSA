package arrays;

public class DeleteOperationOnArray {
	
	public static void delete(int arr[], int i) {
		for(int j=i;j<arr.length-1;j++) {
			arr[j] = arr[j+1];
		}
	}

	public static void main(String[] args) {
		int arr[] = new int[4];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}

		delete(arr, 4);

		System.out.println();

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
	}
}
