package com.bridgelabz.functional;

import java.util.Arrays;

public class FunctionExample 

//Anagram
{
	static boolean areAnagram(char[] str1,char[] str2)
	{
		int n1=str1.length;
		int n2=str2.length;
		if (n1!=n2)
			return false;
		Arrays.sort(str1);
		Arrays.sort(str2);
		for(int i=0;i<n1;i++)
			if(str1[i]!=str2[i])
				return false;
		return true;
		
	}
	
//Palindrome
	
	public static boolean isPalindrom(String str,int s,int i)
	{
		if(s==i)
			return true;
	if((str.charAt(s))!=str.charAt(i))
		return false;
	if(s<i+1)
		return isPalindrom(str,s+1,i-1);
	return true;		
	}
	static boolean Palindrome(String str)
	{
		int n=str.length();
		if(n==0)
			return true;
		return isPalindrom(str, 0, n-1);
		
	}
	
//Permutation using Iterative method
	
	public static void printPermutation(String str,String ans)
	{
		if(str.length()==0)
		{
			System.out.println(ans+" ");
			return;
		}
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			String s=str.substring(0,i)+str.substring(i+1);
			printPermutation(s, ans+ch);
		}
	}
	
//Permutation using Recursion method
	
//Main method
	public static void main(String args[])
	{
		char str1[]= {'h','e','a','r','t'};
		char str2[]= {'e','a','r','t','h'};
		if(areAnagram(str1,str2))
			System.out.println("The two strings are anagram of each other.");
		else
			System.out.println("The two string are not anagram of each other.");
		
		
		String str="dad";
		if(Palindrome(str))
			System.out.println("Yes,this string is a palindrome.");
		else
			System.out.println("No,this string is not a palindrome.");
		
		
		String s="abc";
		printPermutation(s,"");		
				}

}
