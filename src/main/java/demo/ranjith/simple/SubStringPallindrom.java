package demo.ranjith.simple;

public class SubStringPallindrom {

	public static void main(String[] args) {
		String str = "abab";
		subStringPalindrom(str);
	}

	static int resultStrat;
	static int resultLength;

	public static void subStringPalindrom(String str) {
		int strLength = str.length();
		if (strLength < 2) {
			System.out.println(str);
		}
		for (int start = 0; start < strLength - 1; start++) {
			expand(str, start, start);
			expand(str, start, start + 1);
		}
		String str1=str.substring(strLength, strLength);
		System.out.println(str1);
	}

	public static void expand(String str, int begin, int end) {
		while(begin>=0 && end<str.length() && str.charAt(begin)==str.charAt(end)) {
			begin--;
			end++;
		}
		if(resultLength<end-begin-1) {
			resultStrat=begin+1;
			resultLength=end-begin-1;
			
		}
		
	}

}
