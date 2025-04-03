package demo.ranjith.simple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.LogRecord;
import java.util.logging.Logger;

public class ReverOfGivenStringUsingCollections {

	public static void main(String[] args) {
		
		Logger logger=Logger.getLogger(ReverOfGivenStringUsingCollections.class.getName());
		
		String str="ranjith";
		
		List<Object> list=new ArrayList<>();
		
		for(int i=0;i<str.length();i++) {
			list.add(str.charAt(i));
		}
		
		
		Collections.reverse(list);
//		System.out.println(list);
		
		
		
	}
}
