package arrays;

public class LargestElementInArray {
	
	public static int findLarge(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			boolean flag = true;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					flag=false;
					break;
				}
			}
			if(flag==true) {
				return arr[i];
			}
		}
		
		return -1;
	}
	
	public static int findLargeOptimize(int arr[]) {
		int num = 0;
		
		for(int j=0;j<arr.length;j++) {
			if(num<arr[j]) {
				num = arr[j];
			}
		}
		
		return num;
	}

	public static void main(String[] args) {
		int arr[] = {2,80,5,100,10,8};
		
		int ans = findLarge(arr);
		
		System.out.println(findLarge(arr));
	}
}
