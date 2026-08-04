package arrays;

public class LeadersInAnArray {
	
	public static void basicSolution(int arr[]) {
		
		for(int i=0;i<arr.length;i++) {
			boolean flag = false;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]<=arr[j]) {
					flag = true;
					break;
				}
			}
			
			if(flag==false) {
				System.out.print(arr[i] + " ");
			}
				
		}
	}
	
	public static void advanceSoltion(int arr[]) {
		
		int curr = arr[arr.length-1];
		
		System.out.print(curr + " ");
		
		for(int i=arr.length-2;i>=0;i--) {
			if(curr<arr[i]) {
				curr = arr[i];
				System.out.print(curr + " ");
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {7,10,4,3,10,6,5,2};
		
		advanceSoltion(arr);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

}
