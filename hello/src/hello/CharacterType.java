package hello;

import java.util.Scanner;

public class CharacterType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		char c = 'A';
		char d = 'D';
		System.out.println(d - c); // 3
		c++;
		System.out.println(c); // B
		
		// 大写的D转为小写的d
		char f = (char)(d + 'a' - 'A');
		System.out.println(f);
	}

}
