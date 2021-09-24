package com.bridgelabz.Snack_Ladder;

import java.util.Random;

public class SnackLadder {

	public static void main(String[] args) {

		System.out.println("Plyers rolls the die");
		Random random = new Random();
		int diceNumber = random.nextInt(6)+1;
		System.out.println("Dice Number : " + diceNumber);
	}
}
