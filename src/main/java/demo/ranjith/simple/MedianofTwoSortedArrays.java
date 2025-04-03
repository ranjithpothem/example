package demo.ranjith.simple;


public class MedianofTwoSortedArrays {

	public static void main(String[] args) {

		int [] num1= {1,2};
		int[] num2= {3,4};
				double b=findMedianSortedArrays(num1,num2);
				System.out.print(b);
	}
	
	  public static double findMedianSortedArrays(int[] num1, int[] num2) {
	        int m=num1.length;
	        int n=num2.length;

	        int[] arr=new int[m+n];
	        for(int i=0;i<m;i++){
	             arr[i]=num1[i];
	        }
	        for(int j=0;j<n;j++)
	        {
	            arr[m+j]=num2[j];
	        }
	        double b=0;
	        if(arr.length%2==0){
	            int num=arr.length/2;
	            b=(arr[num]+arr[num-1])/2;
	        }else{
	            b=arr[arr.length/2];
	        }
	        return b;
	        }

}
