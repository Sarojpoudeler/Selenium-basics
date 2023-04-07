package saroj;

public class corejavabrush2 {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		// string is an object //String literal

		// String s1 = "saroj poudel Academy";

		String s5 = "hello";

		// new

		String s2 = new String("Welcome");

		String s3 = new String("Welcome");

		String s = "saroj poudel Academy";

		String[] splittedString = s.split("poudel");

		System.out.println(splittedString[0]);

		System.out.println(splittedString[1]);

		System.out.println(splittedString[1].trim());

		for (int i = s.length() - 1; i >= 0; i--)

		{

			System.out.println(s.charAt(i));

		}

	}

}
