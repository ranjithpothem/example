package demo.ranjith.simple;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MedianOfTheSortedArray {

	public static void main(String[] args) {
		int[] arr= {1,3};
		int[] arr1= {4,8};
		Using(arr,arr1);

	}
	private static void Using(int[] arr,int[] arr2 ) {
		int l1=arr.length;
		int l2=arr2.length;
		
		int[] nums=new int[l1+l2];
		
		for(int i=0;i<l1;i++) {
			nums[i]=arr[i];
		}
		for(int i=0;i<l2;i++) {
			nums[l1+i]=arr2[i];
		}
		Arrays.sort(nums);
		
		System.out.println(Arrays.toString(nums));
		int s=nums.length/2;
		double nu=0;
		if(nums.length%2==0) {
			
		 nu=(double)(nums[s]+nums[s-1])/2;
			
		}else {
		 nu=(double)nums[nums.length/2];
		}
		System.out.println(nu);
	}

}
