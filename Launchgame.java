package com.course.ineuron.java.javaIneuronProject.assignments.assignment2;

import java.util.Scanner;

class Guesser {
	int guessNum;

	public int guessNumber() {
		Scanner scan = new Scanner(System.in);

		System.out.println("Guesser kindly guess the number between 1 to 10");
		guessNum = scan.nextInt();
		while (guessNum < 1 || guessNum > 10) {
			System.out.println("Guesser number is not between 1 to 10, please re-enter!");
			guessNum = scan.nextInt();
		}

		return guessNum;

	}

}

class Player {
	int pguessNum;

	public int guessNumber(String player) {
		Scanner scan = new Scanner(System.in);
		System.out.println(player + " kindly guess the number");
		pguessNum = scan.nextInt();
		return pguessNum;
	}
}

class Umpire {

	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;

	public void collectNumFromGuesser() {
		Guesser g = new Guesser();
		numFromGuesser = g.guessNumber();
	}

	public void collectNumFromPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();

		numFromPlayer1 = p1.guessNumber("Player1");
		numFromPlayer2 = p2.guessNumber("Player2");
		numFromPlayer3 = p3.guessNumber("Player3");
	}

	void compare() {

		if (numFromGuesser == numFromPlayer1) {
			if (numFromGuesser == numFromPlayer2 && numFromGuesser == numFromPlayer3) {
				System.out.println("Game tied all three players guessed correctly");
			} else if (numFromGuesser == numFromPlayer2) {
				System.out.println("Player 1 and Player2 won the game");
			} else if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 1 and Player3 won ");
			} else {
				System.out.println("Player 1 won the game");
			}
		}

		else if (numFromGuesser == numFromPlayer2) {

			if (numFromGuesser == numFromPlayer3) {
				System.out.println("Player 2 and Player3 won ");
			} else {
				System.out.println("Player 2 won the game");
			}
		}

		else if (numFromGuesser == numFromPlayer3) {
			System.out.println("Player 3 won the game");
		} else {
			System.out.println("Game lost! try again");
		}
	}

}

public class Launchgame {

	public static void main(String[] args) {

		Umpire u = new Umpire();
		u.collectNumFromGuesser();
		u.collectNumFromPlayer();
		u.compare();

	}

}
