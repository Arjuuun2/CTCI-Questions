import java.io.*;
import java.util.*;

//CTCI-question
//palindrome permutation:Given a string, write a function to check if it is a permutation of
//a palindrome. The palindrome does not need to be limited to just dictionary words.

//example
//input:Tact coa
//output: True(permutations:"taco cat", "atco cta", etc.)

public class PalindromePermutation {

	public static void main(String[] args) {
		int[] table=new int[Character.getNumericValue('z')-Character.getNumericValue('a')+1];
		for(int i=0;i<table.length;i++) {
			System.out.println(table[i]);
		}
		

	}

}
