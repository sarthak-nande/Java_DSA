package arrays;

public class FrequencyInSortedArray {
	
	public static void basicSolution(int arr[]) {
		int i = 1;
		int n = arr.length;
		int freq = 1;
		
		while(i<=n) {
			
			
			while(i<n && arr[i] == arr[i-1]) {
				freq++;
				i++;
			}
			
			System.out.println("(" + arr[i-1] + ", " + freq + ")");
			
			i++;
			freq=1;
		}
	}
	
	public static void advanceSolution(int arr[]) {
		int i=1;
		int n = arr.length;
		int freq = 1;
		
		while(i<n) {
			if(arr[i]==arr[i-1]) {
				freq++;
				i++;
			}
			else if(arr[i]!=arr[i-1]) {
				System.out.println(arr[i-1] + " " + freq);
				i++;
				freq=1;
			}
		}
		System.out.println(arr[i-1] + " " + freq);
		
	}
	
	public static void main(String[] args) {
		int arr[] = {10,10,10,20,20,30,30,40};
		
		advanceSolution(arr);
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i] + " ");
//		}
	}

}
