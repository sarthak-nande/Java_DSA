package searching;

public class AllocateMinimumPages {
	
	public static int miniPage(int arr[],int k,int n) {
		int sum = 0 , max = 0;
		
		for(int i=0;i<n;i++) {
			sum += arr[i];
			max = Math.max(max, arr[i]);
		}
		
		
		
		int low = max, high = sum, res = 0;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(isFasible(arr, k, n, mid)) {
				res = mid;
				high = mid - 1;
			}else {
				low = mid + 1;
			}
		}
		return res;
		
	}
	
	public static boolean isFasible(int arr[], int k, int n, int ans) {
		int sum = 0, res = 1;
		
		for(int i=0;i<n;i++) {
			if(sum+arr[i] > ans) {
				res++;
				sum = arr[i];
			}else {
				sum+=arr[i];
			}
		}
		
		return (res<=k);
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,20};
		int k = 2;
		int n = arr.length;
		
		System.out.println(miniPage(arr, k, n));
	}

}
