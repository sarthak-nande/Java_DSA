package arrays;

public class RemoveDublicate {
	
	public static void basicSolution(int arr[]) {
		int res = 1;
		int temp[] = new int[arr.length];
		temp[0] = arr[0];
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=temp[res-1]) {
				temp[res] = arr[i];
				res++;
			}
		}
		
		for(int i=0;i<temp.length;i++) {
			arr[i] = temp[i];
		}
		
	}
	
	public static void advanceSolution(int arr[]) {
		int res = 1;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=arr[res-1]) {
				arr[res] = arr[i];
				res++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,20,30,30,40};
		
		advanceSolution(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
