package hello;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �ж�һ�����Ƿ�������
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int isPrime = 1;
		for (int i = 2; i < n; i++)
		{
			if (n % i == 0)
			{
				isPrime = 0;
				System.out.println(n + "��������" + i);
				break;
			}
		}
		if (isPrime == 1)
		{
			System.out.println(n + "������");
		}
		else
		{
			System.out.println(n + "��������");
		}
	}

}