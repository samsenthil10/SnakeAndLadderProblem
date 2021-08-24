package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {

		int playerPosition = 0;
		int noOfTurns = 0;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		while(playerPosition<100) {
			int rollDie = (int)(Math.random() * 6)+1;
			int movePlayer = (int)(Math.random()*3);
			switch(movePlayer)
			{
			case NO_PLAY: 
				break;
			case LADDER : 
				playerPosition+=rollDie;
				playerPosition = (playerPosition > 100) ? playerPosition-rollDie : playerPosition;
				break;
			case SNAKE : 
				playerPosition-=rollDie;
				playerPosition= (playerPosition < 0) ? 0 : playerPosition; 
				break;
			}
			noOfTurns++;
			System.out.println("Single Player is at Position: "+ playerPosition);
		}
		System.out.println("Number of turns taken by Single Player : "+noOfTurns);
	}
}