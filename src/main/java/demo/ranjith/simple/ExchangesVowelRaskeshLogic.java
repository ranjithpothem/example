package demo.ranjith.simple;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExchangesVowelRaskeshLogic {

	public static void main(String[] args) {
		String str="kranthikumar";
		StringBuffer sb=new StringBuffer(str);
		String vowels="aeiou";
		
		List<Character> list=new ArrayList<>();
		for(int i=0;i<sb.length();i++) {
			if(vowels.contains(sb.charAt(i)+"") && !list.contains(sb.charAt(i))) {
					list.add(sb.charAt(i));
			}
		}
		Map<Character, Character> hashMap=new HashMap<>();
		if(list.size()%2==0) {
			for(int i=0;i<list.size();i+=2) {
				hashMap.put(list.get(i),list.get(i+1));
				hashMap.put(list.get(i+1),list.get(i));
			}
		}else {
			for(int i=0;i<list.size()-1;i++) {
				hashMap.put(list.get(i), list.get(i+1));
			}
			hashMap.put(list.get(list.size()-1),list.get(0));
		}
		
		for(int i=0;i<sb.length()-1;i++) {
			
			if(vowels.contains(sb.charAt(i)+"")) {
				sb.setCharAt(i, hashMap.get(sb.charAt(i)));
			}
			
		}
		System.out.println("original "+str+" modified "+sb.toString());

	}

}
