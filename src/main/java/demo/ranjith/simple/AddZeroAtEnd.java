package demo.ranjith.simple;

import java.util.Arrays;

public class AddZeroAtEnd {
	
	public static void main(String [] args) {
		int[] arr= {0,1,0,3,0,2};
		int temp=0;
		int length=arr.length-1;
		for(int i=0;i<arr.length/2;i++) {
			if(arr[i]==0) {
				
				if(arr[i]==arr[length]) {
					temp=arr[i];
					arr[i]=arr[length-1];
					arr[length-1]=temp;
					length--;
				}
				else {
				
				temp=arr[i];
				arr[i]=arr[length];
				arr[length]=temp;
				length--;}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
