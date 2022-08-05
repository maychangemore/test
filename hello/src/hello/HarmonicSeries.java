package hello;

import java.util.Scanner;

public class HarmonicSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * $f(n)=1 + \frac{1}{2} + \frac{1}{3} + \cdots + \frac{1}{n} $
		 */
//		Scanner in = new Scanner(System.in);
//		int n = in.nextInt();
//		double sum = 0.0;
//		for (int i = 1; i <= n; i ++)
//		{
//			sum += 1.0/i;
//		}
//		System.out.println(sum);
//		System.out.printf("%.2f", sum); // 取两位小数，会自动四舍五入
		
		/**
		 * $f(n)=1 - \frac{1}{2} + \frac{1}{3} - \cdots + \frac{1}{n} $
		 */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		double sum = 0.0;
		int sign = 1;
		for (int i = 1; i <= n; i++, sign = -sign)
		{
			sum += sign*1.0/i;
			
			
//			if (i % 2 == 1)
//			{
//				sum += 1.0/i;
//			}
//			else
//			{
//				sum -= 1.0/i;
//			}
//			
		}
		System.out.println(sum);
		System.out.printf("%.2f", sum); // 取两位小数，会自动四舍五入
	}

}
