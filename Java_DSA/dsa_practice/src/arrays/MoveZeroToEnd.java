package arrays;

public class MoveZeroToEnd {
	
	
	
	public static void basicSolution(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]==0) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[j]!=0) {
						int temp = 0;
						temp = arr[i];
						arr[i] = arr[j];
						arr[j] = temp;
					}
				}
			}
		}
	}
	
	public static void advanceSolution(int arr[]) {
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i] != 0) {
				int temp = arr[i];
				arr[i] = arr[count];
				arr[count] = temp;
				count++;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,0,0,50,0,90};
		
		advanceSolution(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
