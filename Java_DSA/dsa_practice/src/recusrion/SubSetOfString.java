package recusrion;

public class SubSetOfString {
	
	public static void subSet(String str, String curr, int i) {
		
		if(str.length() == i) {
			System.out.print(curr + ", ");
			return;
		}
		subSet(str, curr, i+1);
		subSet(str, curr+(str.charAt(i)), i+1);
	}
	
	public static void main(String[] args) {
		subSet("ab"," ", 0);
	}

}
