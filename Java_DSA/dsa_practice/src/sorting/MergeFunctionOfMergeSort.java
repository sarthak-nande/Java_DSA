package sorting;

public class MergeFunctionOfMergeSort {
	
	public static void merge(int arr[],int low, int mid, int high) {
		int n1 = mid-low+1, n2 = high-mid;
		
		int left[] = new int[n1];
		int right[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			left[i] = arr[low+i];
		}
		for(int i=0;i<n2;i++) {
			right[i] = arr[mid+i+1];
		}
		
		int i = 0, j = 0, k = low;
		
		while(i<n1 && j<n2) {
			if(left[i]<right[j]) {
				arr[k] = left[i];
				k++;
				i++;
			}else {
				arr[k] = right[j];
				k++;
				j++;
			}
		}
		
		while(i<n1) {
			arr[k] = left[i];
			k++;
			i++;
		}
		
		while(j<n2) {
			arr[k] = right[j];
			k++;
			j++;
		}
	}
	
	

}
