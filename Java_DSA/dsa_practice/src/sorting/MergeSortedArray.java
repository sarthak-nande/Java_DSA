package sorting;

public class MergeSortedArray {
	
	public static void merge(int a[], int b[]) {
		int i = 0;
		int j = 0;
		int m = a.length, n = b.length;
		
		while(i<m && j<n) {
			if(a[i]<=b[j]) {
				System.out.print(a[i] + " ");
				i++;
			}else {
				System.out.print(b[j] + " ");
				j++;
			}
		}
		
		while(i<m) {
			System.out.print(a[i] + " ");
			i++;
		}
		
		while(j<n) {
			System.out.print(b[j] + " ");
			j++;
		}
	}
	
	public static void main(String[] args) {
		int a[] = {10,20,50};
		int b[] = {5,50,50};
		
		merge(a, b);
	}

}
