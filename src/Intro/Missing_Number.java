package Intro;

import java.util.Scanner;

public class Missing_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		String str1=sc1.next();
		int count=1;
		int mx=1;
		for(int i=1;i<str1.length();i++) {
			if(str1.charAt(i-1)==str1.charAt(i))count++;
			else count=1;
			
			if(count>=mx)mx=count;
			
			
		}
		
		System.out.println(mx);

	}

}
