package Intro;

import java.util.Scanner;

public class Trailing_Zeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		long n=sc1.nextLong();
		long count=0;
		long p=5;
		while(n/p!=0) {
			count+=n/p;
			p=p*5;
		}
		
		
		System.out.println(count);

	}

}
