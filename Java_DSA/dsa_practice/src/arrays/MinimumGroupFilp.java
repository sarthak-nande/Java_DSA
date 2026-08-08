package arrays;

public class MinimumGroupFilp {
	
	public static void solution(int arr[]) {
		
		for(int i=1;i<arr.length;i++) {
			if(arr[i] != arr[i-1]) {
				if(arr[i] != arr[0]) {
					System.out.print("Group from " + i + " to ");
				}else {
					System.out.print(i-1);
					System.out.println();
				}
			}
		}
		
		if(arr[arr.length-1] != arr[0]) {
			System.out.print(arr.length-1);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {0,0,1,1,0,0,1,1,1,1,0};
		
		solution(arr);
	}

}
