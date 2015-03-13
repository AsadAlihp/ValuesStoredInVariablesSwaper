package swaper;

public class Swaper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring variables
		int a = 5, b = 10;
		System.out.println("values before Swaping: a= " + a + ". and b= " + b);
		Swaper.swp(a, b);
	}

	private static void swp(int a, int b) {
		int t = 0;
		t = a;
		a = b;
		b = t;
		System.out.println("values after Swaping: a= " + a + ". and b= " + b);
	}

}
