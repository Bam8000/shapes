package mcgregor.benn;

import java.util.Scanner;

public class McGregorShapeDriver {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double x = inputChecker("Please give the x value of Point 1: ", in);
		double y = inputChecker("Please give the y value of Point 1: ", in);
		
		Point pointOne = new Point(x, y);
		
		x = inputChecker("Please give the x value of Point 2: ", in);
		y = inputChecker("Please give the y value of Point 2: ", in);
		
		Point pointTwo = new Point(x, y);
		
		Line newLine = new Line(pointOne, pointTwo);
		
		double r = inputChecker("Please give the radius of a circle: ", in);
		
		Circle newCircle = new Circle(r);
		
		x = inputChecker("Please give the x coordinate of the circle: ", in);
		y = inputChecker("Please give the y coordinate of the circle: ", in);
		
		newCircle.setLocation(new Point(x, y));
		
		System.out.println("\nPoint 1 is " + pointOne.toString());
		System.out.println("Point 2 is " + pointTwo.toString());
		System.out.println("Distance of point 1 from origin is: " + pointOne.distanceFromOrigin());
		System.out.println("Distance of point 2 from origin is: " + pointTwo.distanceFromOrigin());
		if (pointOne.equals(pointTwo)) {
			System.out.println("The two points are collocated.");
		} else {
			System.out.println("The two points are different.");
		}
		System.out.println("Distance of line segment p1-p2 is: " + newLine.length());
		System.out.println("Now for the Circle:");
		System.out.println(newCircle.toString());
		System.out.println("Area of the circle is: " + newCircle.area());
		System.out.println("Circumference of the circle is: " + newCircle.circumference());
		if (newCircle.isPointInside(pointOne)) {
			System.out.println("Point 1 is inside the circle.");
		} else {
			System.out.println("Point 1 is not inside the circle.");
		}
		if (newCircle.isPointInside(pointTwo)) {
			System.out.println("Point 2 is inside the circle.");
		} else {
			System.out.println("Point 2 is not inside the circle.");
		}
		System.out.println("\nThanks for listening!");
		System.out.println("************************************************************\n");
		
	}
	
	private static double inputChecker(String prompt, Scanner in) {
		boolean valid = false;
		while (!valid) {
			System.out.print(prompt);
			if (in.hasNextDouble()) {
				double n = in.nextDouble();
				in.nextLine();
				return n;
			} else {
				in.nextLine();
				System.out.print("Please give a valid number!\n");
			}
		}
		return 0;
	}

}
