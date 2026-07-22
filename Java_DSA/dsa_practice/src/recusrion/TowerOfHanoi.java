package recusrion;

public class TowerOfHanoi {
	
	public static void shiftTheBlocks(int n, char A, char B, char C) {
		
		if(n==1) {
			System.out.println("Shift 1 from " + A + " to " + C);
			return;
		}
		
		shiftTheBlocks(n-1, A, C, B);
		
		System.out.println("Shift " + n + " from " + A + " to " + C);
		
		shiftTheBlocks(n-1, B, A, C);
	}
	
	public static void main(String[] args) {
		shiftTheBlocks(3, 'A', 'B', 'C');
	}

}
