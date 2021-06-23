package com.qa.helloworld;

public class Loops {
	public static void main(String[] args) {
		doWhile();
	}
	
	public static void catPrinter() { //while loop
		int catCount = 5;
		boolean notEnoughCats = true;
		
		while (notEnoughCats) {
			System.out.println(catCount+ ": Another cat");
			catCount++;
			if (catCount==10) {
				notEnoughCats = false;
			}
		}
		
		System.out.println("Too many cats what do I do!");
	}
	
	public static void doWhile() { //do while
		
		int playCount = 0;
		boolean playing = true;
		do {
			System.out.println(playCount + ": Playing");
			playCount++;
			
			if (playCount==5) {
				playing=false;
			}
		} while (playing);
		
		System.out.println("Game Over!");
	}
	
	public static void forLoop() {
		for (int i = 0; i < 100; i++) {
			
			System.out.println(i);
		}
	}
}
