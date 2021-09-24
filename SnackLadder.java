package com.bridgelabz.Snack_Ladder;

import java.util.Random;

public class SnackLadder {

	 public static void main(String[] args) {
		 
	        int position = 0;
	        int IS_NO_PLAY = 0;
	        int IS_LADDER = 2;
	        int IS_SNAKE = 1;
	        int WINNING_POSITION = 100;
	        int diceCount = 0;

	        

	        while (position < WINNING_POSITION) {
	            diceCount++;
	            Random random = new Random();
	            int diceNumber = random.nextInt(6) + 1;
	            int option = random.nextInt(3);
	            
	            if (option == IS_LADDER) {
	                System.out.println("Player position at ladder");
	                position += diceNumber;
	                
	                if (position > 100){
	                    position -= diceNumber;
	                }
	                
	            } else if (option == IS_SNAKE) {
	                System.out.println("Player position at snack");
	                position -= diceNumber;
	                
	                if (position < 0) {
	                    position = 0;
	                }
	            }
	            
	            else {
	                System.out.println("Player position is no play");
	            }
	            
	         
	            System.out.println("Position : " + position);
	            System.out.println("Dice Count : " + diceCount);
	        }
	    }
	}
