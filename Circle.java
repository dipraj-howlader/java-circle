package Circle;

import java.util.Scanner;

public class Circle {
	public static void main(String[] args) {
		System.out.println("---Circle Area---\n\n");
		
		System.out.println("Enter Circle Radius");
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		double PI = 3.1416;
		
		double area = PI * radius * radius;
		System.out.println("Area is:" + area);
		
	}
}
