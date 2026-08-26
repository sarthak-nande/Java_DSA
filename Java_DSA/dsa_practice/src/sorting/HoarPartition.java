package sorting;

public class HoarPartition {
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static int solution(int arr[], int l, int h) {
		int pivot = arr[l];
		int i = l-1;
		int j = h+1;
		
		while(true) {
			do {
				i++;
			}while(arr[i]<pivot);
			
			do {
				j--;
			}while(arr[j]>pivot);
			if(i>=j) return j;
			swap(arr,i,j);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,80,30,90,40,50,70};
		int ans = solution(arr, 0, arr.length-1);
		System.out.println(ans);
	}

}
