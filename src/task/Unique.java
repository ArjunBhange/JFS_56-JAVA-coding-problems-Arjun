package task;

import java.util.*;

public class Unique {
	
	public static void unique(int arr[]) {
		for(int i:arr) {
			int count=0;
			for(int j:arr) {
				if(i==j) {
					count++;
				}
			}if(count==1)
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		unique(arr);
	}

}
