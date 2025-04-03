package demo.ranjith.simple;

public class MinimumSizeSubarraySum {
	public static void main(String[] args) {
		int[] nums= {2,3,1,2,5};
		int target=9;
	int result=	usingMethod(nums,target);
	System.out.println(result);
	}
	
	private static int usingMethod(int[] arr,int target) {
		int minLength=Integer.MAX_VALUE;
		for(int num:arr) {
			if(target==num) {
				return 1;
			}
		 }
		for(int i=0;i<arr.length;i++) {
			int count=1;
			int sum=0;
			for(int j=i;j<arr.length;j++) {
				sum+=arr[j];
				if(sum==target && count<=minLength) {
					minLength=count;
					break;
				}else {
					count++;
				}
			}
		}
		return minLength==Integer.MAX_VALUE ? 0 : minLength;
	}

}
