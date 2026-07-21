package recusrion;

public class RopeCuttingProblem {
	
	public static int maxCut(int n, int a, int b, int c) {
		if(n==0) return 0;
		if(n<0) return -1;
		
		int res = Math.max(Math.max(maxCut(n-a, a, b, c),maxCut(n-b, a, b, c)),maxCut(n-c, a, b, c));
		
		if(res==-1) return -1;
		
		return res+1;
	}
	
	public static void main(String[] args) {
		int res = maxCut(23, 11, 9, 12);
		
		System.out.println(res);
	}

}
