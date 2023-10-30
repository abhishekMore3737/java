package com;
import java.util.*;
// if else programm
public class Prog2 {
	public static void main (String arg[]) {
		Scanner sc=new Scanner(System.in);
		int age=sc.nextInt();
		
		if(age>=18) {
			System.out.println("Persons are Adult, Voter");
		}
		if(age>13 && age<18) {
			System.out.println(" Tennegers Boy");
		}
		else {
			System.out.println("Invalid");
			
			}
		}
	}


