package Intro;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Grey_code2 {
	
	static List<String> grey(int n){
		List<String> actual=new ArrayList<>();
		if(n==1) {
			actual.add("0");
			actual.add("1");
			return actual;
		}
		
		List<String> prev=grey(n-1);
		for(int i=0;i<prev.size();i++) {
			String s="";
			s+="0";
			s+=prev.get(i);
			actual.add(s);
		}
		
		
		for(int i=prev.size()-1;i>=0;i--) {
			String s="";
			s+="1";
			s+=prev.get(i);
			actual.add(s);
		}
		
		return actual;
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc1=new Scanner(System.in);
		int n=sc1.nextInt();
		List<String> list=grey(n);
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}

	}

}
