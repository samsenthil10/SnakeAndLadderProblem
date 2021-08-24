package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {

		int playerPosition=0;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int rollDie = (int)(Math.random() * 6)+1;
		int movePlayer = (int)(Math.random()*3);
		switch(movePlayer)
		{
		case NO_PLAY:System.out.println("No Play!"); 
		break;
		case LADDER :System.out.println("Ladder!"); 
		playerPosition+=rollDie;
		break;
		case SNAKE : System.out.println("Snake");
		playerPosition-=rollDie;
		break;
		}
		System.out.println("Single Player Current Position: "+playerPosition);
	}
}
