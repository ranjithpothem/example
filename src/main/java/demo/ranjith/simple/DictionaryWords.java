package demo.ranjith.simple;

import java.util.Arrays;

public class DictionaryWords {

	public static void main(String[] args) {
	       String str = "abcgefd::a,ab,abc,abcg,b,c,dog,e,efd,zzzz";
	    	//String str="baseball::a,all,b,ball,bas,base,cat,code,d,e,quit,z";
	    	//String str="hellocat::apple,bat,cat,goodbye,hello,yellow,why";
		String[] strArray = str.split("::");
		String[] strArray2 = strArray[1].split(",");
		String fs = strArray[0];
		for (String s : strArray2) {
			
			System.out.println(fs.contains(s));
			System.out.println(s);
			System.out.println(Arrays.stream(strArray2).anyMatch(fs.substring(s.length())::contains));
			System.out.println(fs.substring(s.length()));
			System.out.println((s+fs.substring(s.length())).equals(fs));
			System.out.println();
			
			

//			if (fs.contains(s) && Arrays.stream(strArray2).anyMatch(fs.substring(s.length())::contains) && (s+fs.substring(s.length())).equals(fs)) {
//				
//				System.out.println(s + "," + fs.substring(s.length()));
//
//			}

		}

	}

}
