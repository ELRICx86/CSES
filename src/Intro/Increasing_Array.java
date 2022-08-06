package Intro;

import java.util.Scanner;

public class Increasing_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		long count=0;
		long x;
		
		long[] a =new long[n];
		
		
		for(int i=0;i<n;i++) {
			a[i]=sc1.nextLong();
			
		}
		
		for(int i=1;i<n;i++) {
			if(a[i-1]>a[i]) {
				count+=a[i-1]-a[i];
				a[i]=a[i-1];
			}
			
		}
		
		System.out.println(count);

	}

}
