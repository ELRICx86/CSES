package Intro;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Number_Spiral {
	
	static class FastReader{
        BufferedReader br;
        StringTokenizer st;
        public FastReader(){
            br=new BufferedReader(new InputStreamReader(System.in));
        }
        String next(){
            while(st==null || !st.hasMoreTokens()){
                try {
                    st=new StringTokenizer(br.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
        int nextInt(){
            return Integer.parseInt(next());
        }
        long nextLong(){
            return Long.parseLong(next());
        }
        double nextDouble(){
            return Double.parseDouble(next());
        }
        String nextLine(){
            String str="";
            try {
                str=br.readLine().trim();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return str;
        }
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FastReader sc1=new FastReader();
		int n=sc1.nextInt();
		long x,y;
		for(int i=0;i<n;i++) {
			x=sc1.nextLong();
			y=sc1.nextLong();
			
			if(x==y)System.out.println(x*x-x+1);
			else if(x<y) {
				if(y%2==0)System.out.println((y-1)*(y-1)+x);
				else System.out.println(y*y-x+1);
				
			}
			else {
				if(x%2!=0)System.out.println((x-1)*(x-1)+y);
				else System.out.println(x*x-y+1);
				
			}
		}
	}

}


