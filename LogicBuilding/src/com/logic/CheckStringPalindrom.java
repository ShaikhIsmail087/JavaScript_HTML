package com.logic;

import java.util.Scanner;

public class CheckStringPalindrom {

	public static void main(String[] args) {
		System.out.println("Enter the String:");
		Scanner sc=new Scanner(System.in);
		String sentence=sc.nextLine();
		boolean isPallindrome=isPallindrome(sentence);
		if(isPallindrome)
		{
			System.out.println(sentence+" is pallindrome");
		}
		else
		{
			System.out.println(sentence+" is Not pallindrome");
		}
	}

	public static boolean isPallindrome(String sentence) {
		String input=sentence;
		String str="";
		for(int i=input.length()-1;i>=0;i--)
		{
			str=str+sentence.charAt(i);
		}
		return input.equals(str);
	}

}
