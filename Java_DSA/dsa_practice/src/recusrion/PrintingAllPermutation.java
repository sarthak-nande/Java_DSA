package recusrion;

public class PrintingAllPermutation {
	
	public static String swap(String str, int i, int j) {
		char temp = 'c';
		StringBuilder sb = new StringBuilder(str);
		
		temp = str.charAt(i);
		sb.setCharAt(i, str.charAt(j));
		sb.setCharAt(j, temp);
		return sb.toString();
	}

	public static void permute(String str, int i) {
		if(i==str.length()-1) {
			System.out.print(str + " ");
			return;
		}
		
		for(int j=i;j<str.length();j++) {
			str = swap(str, i, j);
			permute(str, i+1);
			str = swap(str, i, j);
		}
	}
	
	public static void main(String args[]) {
		permute("ABC", 0);
	}
}
