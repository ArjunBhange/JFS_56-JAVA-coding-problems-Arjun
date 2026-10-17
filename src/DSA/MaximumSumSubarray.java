package DSA;

import java.util.*;

public class MaximumSumSubarray {
	
	public static int result(int arr[],int n) {
		int res=arr[0];
		int maxE=arr[0];
		int sum=0;
		
		for(int i=1;i<n;i++) {
			maxE = Math.max(maxE+arr[i], arr[i]);
			res = Math.max(maxE, res);
			
		}
		return res;
	}

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		MaximumSumSubarray obj=new MaximumSumSubarray();
		System.out.println(result(arr,n));
		
	}

}





/*for(int i=0;i<n;i++) {
int curr=0;
for(int j=i;j<n;j++) {
	curr +=arr[i];
	res = Math.max(curr,res);
}
}*/
