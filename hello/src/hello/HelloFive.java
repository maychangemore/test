package hello;

import java.util.Scanner;

public class HelloFive {
	public static void main(String[] args) {
		final int MINOR = 35;
		
		System.out.print("������������䣺");
		Scanner in = new Scanner(System.in);
		
		int age = in.nextInt();
		
		System.out.println("��������ǣ�" + age);
		
		if (age < MINOR)
		{
			System.out.println("���������õģ�");
		}
		
		System.out.println("�����������ľ������磬�ú���ϧ�ɡ�");
	}
}
