package com.course.ineuron.java.javaIneuronProject.assignments.assignment1;

public class PatternTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 9;
		for (int i = 0; i < n; i++) {

			// To Print Letter "I"
			for (int j = 0; j < n; j++) {

				if (j == 0)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "N"
			for (int j = 0; j < n; j++) {

				if (j == 0 || j == n - 1 || i == j)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "E"
			for (int j = 0; j < n; j++) {

				if (i == 0 || j == 0 || i == n - 1 || i == (n - 1) / 2)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "U"
			for (int j = 0; j < n; j++) {

				if (j == 0 && i < n - 1 || j == n - 1 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "R"
			for (int j = 0; j < n; j++) {

				if (i == 0 && i < n - 1 && j < n - 1 || j == 0 || j == n - 1 && i > 0 && i < (n - 1) / 2
						|| i == (n - 1) / 2 && j < n - 1 || i == j && i > (n - 1) / 2)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "O"
			for (int j = 0; j < n; j++) {

				if (i == 0 && j > 0 && j < n - 1 || j == 0 && i > 0 && i < n - 1 || i == n - 1 && j > 0 && j < n - 1
						|| j == n - 1 && i > 0 && i < n - 1)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.print(" ");

			// To Print Letter "N"
			for (int j = 0; j < n; j++) {

				if (j == 0 || j == n - 1 || i == j)

					System.out.print("*");
				else

					System.out.print(" ");

			}

			System.out.println();
		}

	}

}
