package sorting;

public class LomutoPartition {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static int solution(int arr[], int l, int h) {
		int pivot = arr[h];
		int i = l-1;
		
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot) {
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr, i+1, h);
		return i+1;
	}
	
	public static void main(String args[]) {
		int arr[] = {10,80,30,90,40,50,70};
		int ans = solution(arr, 0, arr.length-1);
		System.out.println(ans);
	}

}
