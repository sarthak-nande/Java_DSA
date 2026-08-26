package sorting;

public class InversionInArray {
	
	public static int basicSolution(int arr[]) {
		int n = arr.length;
		int res = 0;
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[i]>arr[j]) {
					res++;
				}
			}
		}
		return res;
	}
	
	public static int mergeFunction(int arr[],int l,int m, int h) {
		int n1 = m-l+1, n2 = h-m;
		int a[] = new int[n1];
		int b[] = new int[n2];
		
		for(int i=0;i<n1;i++) {
			a[i] = arr[l+i];
		}
		
		for(int j=0;j<n2;j++) {
			b[j] = arr[m+j+1];
		}
		
		int i = 0, j = 0, k = l, res = 0;
		
		while(i<n1 && j<n2) {
			if(a[i]<=b[j]) {
				arr[k] = a[i];
				i++;
			}else {
				arr[k] = b[j];
				j++;
				res = res + (n1-i);
			}
			k++;
		}
		
		while(i<n1) {
			arr[k] = a[i];
			i++;
			k++;
		}
		
		while(j<n2) {
			arr[k] = b[j];
			j++;
			k++;
		}
		return res;
	}
	
	public static int countInversion(int arr[], int l, int r) {
		int res = 0;
		if(l<r) {
			int m = l+(r-l)/2;
			res += countInversion(arr, l, m);
			res += countInversion(arr, m+1, r);
			res += mergeFunction(arr, l, m, r);
		}
		
		return res;
	}
	
	public static void main(String args[]) {
		int arr[] = {2,4,1,3,5};
		
		int ans = basicSolution(arr);
		int n = arr.length-1;
		
		int ans2 = countInversion(arr, 0, n);
		
		System.out.println(ans2);
	}

}
