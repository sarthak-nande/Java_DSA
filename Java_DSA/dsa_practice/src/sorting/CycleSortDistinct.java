package sorting;

public class CycleSortDistinct {
	
	public static void swap(int arr[], int item, int pos) {
		int temp = arr[pos];
		arr[pos] = item;
		item = temp;
	}
	
	public static void solution(int arr[]) {
		
		int n = arr.length;
		
		for(int cs=0;cs<arr.length-1;cs++) {
			int item = arr[cs];
			int pos = cs;
			
			for(int i=cs+1;i<n;i++) {
				if(arr[i]<item) {
					pos++;
				}
			}
			int temp = arr[pos];
			arr[pos] = item;
			item = temp;
			
			while(cs!=pos) {
				pos = cs;
				for(int i=cs+1;i<n;i++) {
					if(arr[i]<item) {
						pos++;
					}
				}
				temp = arr[pos];
				arr[pos] = item;
				item = temp;
			}
		}
	}
	
	public static void main(String[] args) {
		int arr[] = {10,20,50,40,30};
		
		solution(arr);
		
		for(int num: arr) {
			System.out.print(num + " ");
		}
	}

}
