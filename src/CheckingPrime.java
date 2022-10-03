import java.io.*;
import java.util.*;

//IN this program we are going to demonstrate how to check if a no is prime or not
//This question is frequently asked during interviews.
public class CheckingPrime {

	public static void main(String[] args) 
	{
	 
		//so we want to create a boolean method 
		//becuase we are returning true of false(prime or not)
		Scanner in=new Scanner(System.in);
		int num=in.nextInt();
		
		System.out.println(primeorNot(num));

	}
	public static boolean primeorNot(int n) {
		//gives the parameter a number to check
		//checking by if condition
		
		if(n<2) {
			return false;//because actual prime no is start from 2 onwards
		   }
		//step2: you must find the square root of the number and iterate only till 
		//the square root
		          //cast to int
		int squaroot=(int) Math.sqrt(n);
		//iterate through the for loop
		for(int i=2; i<=squaroot; i++) {
			if(n%i==0) return false;
		}
		return true;
	  }

}
