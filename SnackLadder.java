package com.bridgelabz.Snack_Ladder;

import java.util.Random;

public class SnackLadder {

	public static void main(String[] args) {
		int position=0;
		int IS_LADDER = 2;
		int IS_SNAKE = 1;
		int NO_PLAY = 0;
		int WINNING_POSITION = 100;


		while (position < 100) {
			Random random = new Random();
			int diceNumber = random.nextInt(6) + 1;
			int option = random.nextInt(3);

			if (option == IS_LADDER) {
				System.out.println("Player position is ladder");
				position += diceNumber;

				if (position > 100) {
					position -= diceNumber;
				}

			} else if (option == IS_SNAKE) {
				System.out.println("Player is snack");
				position -= diceNumber;

				if (position < 0) {
					position = 0;
				}

			} else {
				System.out.println("Player position is no play");
			}
			System.out.println("Dice Number : " + diceNumber);
			System.out.println("Position : " + position);
		}
	}
}

