package sorting;

public class SortAnArrayWithTwoTypesOfElement {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static void solution(int arr[]) {
		int i = -1;
		int j = arr.length;
		
		while(true) {
			do {
				i++;
			}while(arr[i]<0);
			do {
				j--;
			}while(arr[j]>=0);
			
			if(i>=j) {
				return;
			}
			swap(arr,i,j);
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {2,-4,3,5,-8};
		solution(arr);
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}
}
