package Intro;

import java.util.Scanner;

public class Weird_Algorithm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		long n=sc1.nextLong();
		
		while(n>1) {
			System.out.println(n);
			if(n%2==0)n=n/2;
			else n=n*3+1;
			
		}
		System.out.println(n);
		

	}

}
