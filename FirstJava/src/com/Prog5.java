package com;
import java.util.*;
public class Prog5 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println(" Enter your Number :");
			int n=sc.nextInt();
		
		if(n %10==0) {
			continue;
		}
		System.out.println("number was :" +n);
			
		}while(true);
	}

}
