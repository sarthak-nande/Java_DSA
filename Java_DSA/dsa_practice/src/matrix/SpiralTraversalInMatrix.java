package matrix;

public class SpiralTraversalInMatrix {
	
	public static void print(int arr[][], int r, int c) {
		int top = 0, bottom = r-1, left = 0, right = c-1;
		
		while(top<=bottom && left<=right) {
			for(int i=left;i<=right;i++) {
				System.out.print(arr[top][i]+ " ");
			}
			top++;
			for(int i=top;i<=bottom;i++) {
				System.out.print(arr[i][right] + " ");
			}
			right--;
			
			if(top<=bottom) {
				for(int i=right;i>=left;i--) {
					System.out.print(arr[bottom][i] + " ");
				}
				bottom--;
			}
			
			if(left<=right) {
				for(int i=bottom;i>=top;i--) {
					System.out.print(arr[i][left] + " ");
				}
				left++;
			}
				
		}
	}
	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		print(mat,3,3);
	}

}
