package switchexample;

public class SalCalculate {

	public static void main(String[] args) {
		double sal = 600000;
		int tax = 10;
		switch(tax)
		{
		case (10):
		{
			double loss = ((double)10 / 100) * sal;
			System.out.println(loss);
			System.out.println(sal - loss);
			break;
		}
		case (20):
		{
			double loss = ((double)20 / 100) * sal;
			System.out.println(sal - loss);
			break;
		}
		case (30):
		{
			double loss = ((double)30 / 100) * sal;
			System.out.println(sal - loss);
			break;
		}
		default:
			System.out.println(sal);
		}

	}

}
