package matrix;

public class SearchInSortedMatrix {
	
	public static void main(String[] args) {
		int mat[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
		int x = 37;
		int i = 0, j = mat.length-1;
		
		while(i<mat.hashCode() && j>=0) {
			if(mat[i][j]==x) {
				System.out.println(x + " is fount at location ["+ i + ", " + j + "]");
				return;
			}else if(mat[i][j]>x) {
				j--;
			}else {
				i++;
			}
		}
		
	}

}
