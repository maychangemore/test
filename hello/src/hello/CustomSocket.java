package hello;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.Socket;


class Student implements Serializable{
	private String name;
	private int age;
	private int grade;
	public Student(String name, int age, int grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public String toString() {
		return name + " " + age + " " + grade;
	}
	
	
}

public class CustomSocket {

	public static void main(String[] args) {
		try {
			
			Student s1 = new Student("john", 18, 5);
			System.out.println(s1);
			ObjectOutputStream out = new ObjectOutputStream(
					new FileOutputStream("obj.dat"));
			out.writeObject(s1);
			out.close();
			
			ObjectInputStream in = new ObjectInputStream(
					new FileInputStream("obj.dat"));
			
			Student s2 = (Student)in.readObject();
			System.out.println(s2);
			in.close();
			
			System.out.println(s1.equals(s2));
			
//			Socket socket = new Socket(InetAddress.getByName("localhost"), 12345);
//			PrintWriter out = new PrintWriter(
//					new BufferedWriter(
//							new OutputStreamWriter(
//									socket.getOutputStream())));
//			out.println("hello");
//			out.close();
//			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
