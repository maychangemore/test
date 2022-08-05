package hello;

import java.util.Scanner;

public class GreatestCommonDivisor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 输入两个数，求最大公约数
		
		/**
		 * 普通方法
		 */
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int b = in.nextInt();
		int gcd = 1;
		for (int i = 2; i <= a && i <= b ; i++)
		{
			if (a % i == 0 && b % i == 0) 
			{
				gcd = i;
			}
		}
		
		System.out.println(a + "和" + b + "最大公约数是" + gcd);
		
		/**
		 * 辗转相除法（欧几里得法）
		 */
//		Scanner in = new Scanner(System.in);
//		int a = in.nextInt();
//		int b = in.nextInt();
//		int oa = a;
//		int ob = b;
//		while (b != 0)
//		{
//			int r = a % b;
//			a = b;
//			b = r;
//		}
//		
//		System.out.println(oa + "和" + ob + "最大公约数是" + a);
	}

}
