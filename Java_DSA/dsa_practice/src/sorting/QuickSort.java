package sorting;

public class QuickSort {
	
	public static void qSort(int arr[],int l, int h) {
		if(l<h) {
			int p = LomutoPartition.solution(arr, l, h);
			qSort(arr, l, p-1);
			qSort(arr, p+1, h);
		}
	}

	public static void main(String[] args) {
		int arr[] = {10,4,5,8,11,6,16};
		qSort(arr, 0, arr.length-1);
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}
}
