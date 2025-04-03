package demo.ranjith.simple;

import java.util.stream.IntStream;

public class UsingStreamsConvertStringIntoChar {

	public static void main(String[] args) {
		
		IntStream streamOfChars = "abc".chars();
		for(int i=0;i<streamOfChars.count();i++)
		{
	System.out.println((char)i+" "+i);
	}

	}
//
//	public static void main(String[] args) {
//		String inputString = "abc";
//
//		IntStream streamOfChars = inputString.chars();
//		// Print each character's Unicode code point
//		streamOfChars.forEach(
//				codePoint -> System.out.println("Character: " + (char) codePoint + ", Code Point: " + codePoint));
//	}

}
