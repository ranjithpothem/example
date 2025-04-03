package demo.ranjith.simple;

import java.util.Arrays;

public class IsAnagramOrNot {

	public static void main(String[] args) {
		String string="hello";
		String string2="llohe";
		usingMethod(string,string2);

	}
	private static void usingMethod(String string ,String string2) {
		if(string.length()!=string2.length()) {
			System.out.print("not anagram");
		}
		string=string.toLowerCase();
		string2=string2.toLowerCase();
		
		char c[]=string.toCharArray();
	char c1[]=string2.toCharArray();
	
	Arrays.sort(c);
	Arrays.sort(c1);
	
	if(Arrays.equals(c, c1)) {
		System.out.println("angram");
	}
	else {
		System.out.println("not anagram");
	}
	}

}
