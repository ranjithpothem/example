package demo.ranjith.simple;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CountOfCharactersUsingHashMap {

	public static void main(String[] args) {
		String str="zinna";
		//usingHashMap(str);
		//usingStream(str);
		usingArrays(str);
		

	}
	private static void usingArrays(String str) {
		int[] arr=new int[128]; 
		for(int i=0;i<str.length()-1;i++) {
			arr[str.charAt(i)]++;
		}
//		for(int num:arr) {
//			System.out.print(num+" ");
//		}
		for(int i=0;i<arr.length-1;i++)
		{
			//System.out.println(i);
			if(arr[i]>0) {
				System.out.println((char)i+"-"+arr[i]);
			}
		}
	}
	
	private static void usingStream(String str) {
	Map<Character,Long>map=str.chars().mapToObj(e-> (char)e).collect(Collectors.groupingBy(i->i,Collectors.counting()));
	System.out.println(map.entrySet());
	}
	
	private static void usingHashMap(String str) {
    Map<Character,Integer> hashMap=new HashMap<>();
		for(int i=0;i<str.length();i++) {
			hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0)+1);
		}
		System.out.println(hashMap);
	}

}
