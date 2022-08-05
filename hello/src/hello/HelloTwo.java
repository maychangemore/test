package hello;

import java.util.Scanner;

public class HelloTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int foot;
		double inch;
		foot = (int)(30/3.0);
		Scanner in = new Scanner(System.in);
//		System.out.println(1.2-1.1); //0.09999999999999987
		foot = in.nextInt();
		inch = in.nextInt();
//		System.out.println(10/3);
		System.out.println("foot = " + foot + ", inch = " + inch);
		System.out.println((int)((foot + inch/12) * 0.3048 * 100) + "cm");
	}

}
