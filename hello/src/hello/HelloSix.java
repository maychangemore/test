package hello;

import java.util.Scanner;

public class HelloSix {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int x;
		int y;
		int z;
		System.out.println("请输入两个数：");
		x = in.nextInt();
		y = in.nextInt();
		z = in.nextInt();
		int max = 0;
		if (x > y)
		{
			if (x > z) 
			{
				max = x;
			}
			max = x;
		}
		else
		{
			if (y > z) 
			{
				max = y;
			}
			max = y;
		}
		System.out.println(max);
	}
}
