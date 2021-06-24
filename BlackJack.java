package com.qa.helloworld;

public class BlackJack {
	public static void main(String[] args) {
		System.out.println("Play " + blackjack(22, 23));
		System.out.println(uniqueSum(22, 22, 24));
}

	public static int blackjack(int a, int b) {
		  if (a>21) a = 0;
		  if (b>21) b = 0;
		  
		  if (a>b) {
			  return a;
		  } else
			  return b;
	}
	
	
	public static int uniqueSum(int a, int b, int c) {
		int unique = 0;
		if (a != b && a != c) {
			unique += a;
		}
		
		if (b != a && b != c) {
			unique += b;
		}
		
		if (c != a && c != b) {
			unique += c;
		}
		return unique;
	}
	
	
}