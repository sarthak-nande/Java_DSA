package sorting;

public class MergeSort {
	
	public static void mergeSort(int arr[], int l, int r) {
		if(r>l) {
			int m = l+(r-l)/2;
			mergeSort(arr,l,m);
			mergeSort(arr, m+1, r);
			MergeFunctionOfMergeSort.merge(arr, l, m, r);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,5,8,20,2,18};
		int n = arr.length;
		
		mergeSort(arr, 0, n-1);
		
		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
