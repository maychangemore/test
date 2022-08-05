package hello;

public class HellFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = 1.0;
		double b = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;
		System.out.println(a == b);
		System.out.println("a = " + a + "b = " + b);
		System.out.println(Math.abs(a-b) < 1e-6);
		System.out.println("1e-6 = " + Double.toString((1e-6)) );
	}

}
