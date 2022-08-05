package hello;

public class ArrayVariableAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = new int[10];
		a[0] = 5;
		int[] b = a;
		b[0] = 16;
		System.out.println(a[0]);
	}

}
