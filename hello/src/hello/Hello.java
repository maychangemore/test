package hello;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Hello");
		
		byte[] buf = new byte[10];
		for (int i = 0; i < buf.length; i++)
		{
			buf[i] = (byte)i;
		}
		try {
			PrintWriter out = new PrintWriter(
					new BufferedWriter(
							new OutputStreamWriter(
									new FileOutputStream("a.txt"))));
			int i = 123456;
			out.println(i);
			out.close();
			
			BufferedReader in = new BufferedReader(
					new InputStreamReader(
							new FileInputStream("src/hello/Hello.java")));
			String line;
			while ((line = in.readLine()) != null)
			{
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
//		byte[] buffer = new byte[1024];
//		try {
//			int len = System.in.read(buffer);
//			String s = new String(buffer, 0, len);
//			System.out.println("读到了" + len + "字节");
//			System.out.println(s);
//			System.out.println("s的长度" + s.length());
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

}
