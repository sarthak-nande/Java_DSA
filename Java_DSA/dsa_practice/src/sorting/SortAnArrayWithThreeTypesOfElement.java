package sorting;

public class SortAnArrayWithThreeTypesOfElement {
	
	public static void swap(int arr[], int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j]= temp;
	}
	
	public static void solution(int arr[]) {
		int  low = 0, high = arr.length-1, mid = 0;
		
		while(mid<=high) {
			if(arr[mid] == 0) {
				swap(arr, low, mid);
				mid++;
				low++;
			}else if(arr[mid]==1) {
				mid++;
			}else {
				swap(arr, high, mid);
				high--;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {0,1,1,0,0,1,2,2};
		solution(arr);
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

}
