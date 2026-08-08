package arrays;

public class FindMajortiy {
	
	public static int basicSolution(int arr[]) {
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			
			for(int j=i;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					count++;
				}
			}
			
			if(count>arr.length/2) {
				return i;
			}
		}
		return -1;
	}
	
	public static int advanceSolution(int arr[]) {
		
		int count = 1;
		int res = 0;
		
		for(int i=1;i<arr.length;i++) {
			if(arr[res]==arr[i]) {
				count++;
			}else {
				count--;
			}
			
			if(count==0) {
				res = i;
				count=1;
			}
		}
		
		count = 0;
		
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==arr[res]) {
				count++;
			}
		}
		
		if(count>arr.length/2) {
			return res;
		}else {
			return -1;
		}
		
	}
	
	
	public static void main(String[] args) {
		int arr[] = {8,8,6,6,6,4,6};
		
		int ans = advanceSolution(arr);
		
		System.out.println(ans);
	}

}
