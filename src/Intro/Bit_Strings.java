package Intro;

import java.util.Scanner;

public class Bit_Strings {
	
	static long binpow(long a,long b) {
		long M=1000000007;
		long res=1;
		while(b>0) {
			if(b%2==1) {
				res=(res*a)%M;
			}
			a=(a*a)%M;
			b/=2;
		}

		return res;

	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		long n=sc1.nextLong();
		
		long result=binpow(2, n);
		System.out.println(result);
		
		

	}

}
