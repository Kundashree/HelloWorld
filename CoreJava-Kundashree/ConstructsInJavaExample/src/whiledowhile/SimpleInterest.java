package whiledowhile;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter p t r");
		double principle = sc.nextDouble();
		double rate = sc.nextDouble();
		double time = sc.nextDouble();
		
		double si = (principle * rate * time) / 100;
		System.out.println(si);
		
		double init = 0;
		double initTime = 0;
		while(init < 100000) {
			init += si;
			initTime += 1;
		}
		System.out.println(initTime);

	}

}
