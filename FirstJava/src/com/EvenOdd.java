package com;
import java.util.*;
public class EvenOdd {
	public static void main(String args[]) {
		//Scanner sc=new Scanner(System.in);
		//int n=sc.nextInt();
		//int n=10;
		//if(n%2==0) {
			//System.out.println(" It is EVEN Number:");
			
		
		//else {
		//	System.out.println(" It is ODD Number :");
		
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		if(age>=18) {
			System.out.println(" Adult");
		}
		else if(age>=13 && age<18) {
			System.out.println(" Tennegers");
		}
		else {
			System.out.println(" Child");
		}
	}

}
