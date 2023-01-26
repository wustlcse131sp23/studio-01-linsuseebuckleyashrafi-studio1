package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Pick the first number eventually going to averaged out of two : ");
		int n1 = in.nextInt();
		System.out.println("Now pick the second and the two will be averaged : ");
		int n2 = in.nextInt();
		double average = ((double)n1 + (double)n2)/2;
		System.out.println("The average is " + average);
		// TODO Auto-generated method stub

	}

}
