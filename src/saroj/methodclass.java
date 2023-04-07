package saroj;

public class methodclass {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		methodclass d = new methodclass();

		String name = d.getData();

		System.out.println(name);

		Myclass2 d1 = new Myclass2();
		d1.getuserData();

	}

	public String getData() {

		System.out.println("hello world");

		return "saroj  poudel";

	}

	public static String getData2()

	{

		System.out.println("hello world");

		return "saroj  poudel";

	}

}
