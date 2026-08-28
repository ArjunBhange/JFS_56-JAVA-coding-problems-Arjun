package task;

import java.util.Scanner;

public class MoveallZeros {
	public static void move(int arr[]) {
		int count=0;
		for(int i:arr) {
			if(i==0) {
				count++;
			}else {
				System.out.print(i+" ");
			}
		}while(count-->0) {
			System.out.print("0 ");
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
		move(arr);
	}

}
