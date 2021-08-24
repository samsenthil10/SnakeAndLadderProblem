package com.bridgelabz.snakeandladderproblem;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {

		System.out.println("----------Welcome to Snake And Ladder Simulator----------");
		System.out.println();

		int player1Positon = 0;
		int player2Positon = 0;
		int noOfTurnsByPlayer1 =0;
		int noOfTurnsByPlayer2 =0;
		int currentPlayer = 0;
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;

		while(player1Positon<100 && player2Positon<100) {
			int rollDie = (int)(Math.random() * 6)+1;
			int movePlayer = (int)(Math.random()*3);
			if(currentPlayer == 0) {
				switch(movePlayer)
				{
				case NO_PLAY: 
					break;
				case LADDER : 
					player1Positon+=rollDie;
					player1Positon = (player1Positon > 100) ? player1Positon-rollDie : player1Positon;
					break;
				case SNAKE : 
					player1Positon-=rollDie;
					player1Positon= (player1Positon < 0) ? 0 : player1Positon; 
					break;
				}
				noOfTurnsByPlayer1++;
			}
			else if(currentPlayer == 1) {
				switch(movePlayer)
				{
				case NO_PLAY: 
					break;
				case LADDER : 
					player2Positon+=rollDie;
					player2Positon = (player2Positon > 100) ? player2Positon-rollDie : player2Positon;
					break;
				case SNAKE : 
					player2Positon-=rollDie;
					player2Positon= (player2Positon < 0) ? 0 : player2Positon; 
					break;
				}
				noOfTurnsByPlayer2++;
			}

			if(movePlayer == NO_PLAY || movePlayer == SNAKE) {
				currentPlayer = (currentPlayer == 1) ? 0 : 1;
			}
		}
		if(player1Positon == 100) {
			System.out.println("Player 1 won by "+ noOfTurnsByPlayer1 +" number of turns");
		}
		if(player2Positon == 100) {
			System.out.println("Player 2 won by "+ noOfTurnsByPlayer2 +" number of turns");
		}
		System.out.println();
		System.out.println("---------------------------------------------------------");
	}
}