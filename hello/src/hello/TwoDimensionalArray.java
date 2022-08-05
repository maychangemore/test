package hello;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * tick-tock-tick游戏
		 */
		Scanner in = new Scanner(System.in);
		final int SIZE = 3;
		int[][] board = new int[SIZE][SIZE];
		boolean gotResult =false;
		int numOFX = 0;
		int numOFO = 0;
		
		// 读入矩阵
		// board.length，二维数组的行和
		for (int i = 0; i < board.length; i++)
		{
			// board[i].length 二维数组的列和
			for (int j = 0; j < board[i].length; j++)
			{
				board[i][j] = in.nextInt();
			}
		}
		
		// 检查行
		
		// 检查列
	}

}
