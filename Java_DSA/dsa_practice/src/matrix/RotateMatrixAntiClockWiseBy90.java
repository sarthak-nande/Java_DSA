package matrix;

public class RotateMatrixAntiClockWiseBy90 {
	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("before:");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		for(int i=0;i<mat.length;i++) {
			for(int j=i+1;j<mat.length;j++) {
				int temp = mat[i][j];
				mat[i][j] = mat[j][i];
				mat[j][i] = temp;
			}
		}
		
		for(int i=0;i<mat.length;i++) {
			int low = 0, high = mat[i].length-1;
			while(low<=high) {
				int temp = mat[low][i];
				mat[low][i] = mat[high][i];
				mat[high][i] = temp;
				low++;
				high--;
			}
		}
		
		System.out.println("after:");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat[i].length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
