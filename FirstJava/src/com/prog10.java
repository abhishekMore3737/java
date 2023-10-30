package com;
import java.util.*;
public class prog10 {
    public static void printHellowWorld(){
        System.out.println("Hellow  World");
        System.out.println("Hellow  World");
        System.out.println("Hellow  World");
        return ;
    }
    public static int CalculateSum(int num1 , int num2) {
    int sum=num1+num2;
    return 0;
    }
    public static void main (String args[]){
    	Scanner sc=new Scanner(System.in);
    	int a=sc.nextInt();
    	int b=sc.nextInt();
    	int sum =CalculateSum(a,b);
    	System.out.println("Sum is:" +sum);
       printHellowWorld();

    }
}