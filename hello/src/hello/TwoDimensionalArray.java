package hello;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * tick-tock-tick��Ϸ
		 */
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult =false;
		int numOFX = 0;
		int numOFO = 0;
		
		// �������
		// board.length����ά������к�
		for (int i = 0; i < board.length; i++)
		{
			// board[i].length ��ά������к�
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		// �����
		
		// �����
	}

}
