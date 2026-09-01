package matrix;

public class TransposeOfMatrix {
	
	public static void main(String[] args) {
		int mat[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		System.out.println("before:");
		
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
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
		System.out.println("after:");
		for(int i=0;i<mat.length;i++) {
			for(int j=0;j<mat.length;j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}

}
