package demo.ranjith.simple;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingNumberFromGivenArrayUsingSet {

	public static void main(String[] args) {
		int[] arr1 = new int[9];
		System.out.println("enter values");

		usingMethode(arr1);

	}

	public static void usingMethode(int[] arr) {
		int n=arr.length;
		
		
		int sum=(n*(n+1))/2;
		System.out.println(sum);
		int customeSum=0;
		Set<Integer> hashSet = new HashSet<Integer>();
		Scanner sc=new Scanner(System.in);

		for (int i = 0; i < arr.length - 1; i++) {
			arr[i]=sc.nextInt();
			
			
			
			if (hashSet.contains(arr[i])) {
				//System.out.println("true");
				i--;
			} else {
				//System.out.println("flase");
				hashSet.add(arr[i]);
			}

		}
		System.out.println(hashSet);
		
		for (int element:hashSet) {
		    customeSum+=element;	
		}
		
		System.out.println(sum-customeSum);
		

	}

}
