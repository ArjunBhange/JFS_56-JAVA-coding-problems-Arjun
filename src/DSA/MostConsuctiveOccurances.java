package DSA;

import java.util.*;

public class MostConsuctiveOccurances {
	
	public int occurance(int arr[],int n) {
		int res=0,curr=0;
		
		/*for(int i=0;i<n;i++) {
			int curr=0;
			for(int j=i;i<n;i++) {
				if(arr[i]==1) {
					curr++;
				}else {							 // Navie approach
					break;
				}
			}
			res=Math.max(res, curr);
		}*/
		
		
		for(int i=0;i<n;i++) {
			if(arr[i]==0) curr=0;
			else {
				curr++;							// Efficient approach 
				res = Math.max(curr,res);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		
		MostConsuctiveOccurances mco=new MostConsuctiveOccurances();
		
		System.out.println(mco.occurance(arr,n));
		
	}


}
