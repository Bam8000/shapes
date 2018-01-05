package mcgregor.benn;

/**
 * Point defined by double Cartesian coordinates x and y
 * @author benn.mcgregor
 * @version 1.0
 *
 */

public class Point {
	private double x;
	private double y;
	
	/**
	 * Constructor method with no parameters, sets point at the origin.
	 */
	Point() {
		x = 0;
		y = 0;
	}
	
	/**
	 * Constructor method takes input double x and double y as the coordinates of the point.
	 * @param double x
	 * @param double y
	 */
	Point(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Mutator method that changes coordinates of the point to input double x and double y.
	 * @param double x
	 * @param double y
	 */
	public void setPosition(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Accessor method that returns the x coordinate of the point.
	 * @return y — a double, returned by second function
	 */
	public double getXvalue() {
		return x;
	}
	
	/**
	 * Accessor method that returns the y coordinate of the point.
	 * @return x — a double, corresponds to first function
	 */
	public double getYvalue() {
		return y;
	}
	
	/**
	 * @return the x and y coordinates of the point in readable English.
	 */
	@Override
	public String toString() { 
		return "(" + x + ", " + y + ")"; 
	}
	
	/**
	 * Calculates distance of point from origin using pointDistance method.
	 * @return a double, the distance of the point from the origin (0,0).
	 */
	public double distanceFromOrigin() {
		return pointDistance(x, y, 0, 0);
	}
	
	/**
	 * Calculates the distance of this point from another instance of Point.
	 * @param Point p — another Point instance.
	 * @return a double, the distance of this point from p.
	 */
	public double distanceFrom(Point p) {
		return pointDistance(x, y, p.getXvalue(), p.getYvalue());
	}
	
	/**
	 * compare this Point with another object and
	 * @return true if they are both of class Point and have the same x and y coordinates.
	 * @param Object obj — the other point object.
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point) {
			Point p = (Point) obj;
			if (p.getXvalue() == x && p.getYvalue() == y) {
				return true;
			}
		} 
		return false;
	}
	
	/**
	 * helper method that takes the coordinates of point a and coordinates of point b from input
	 * and returns double distance of point a from point b using Cartesian distance formula.
	 * @param xa — the x coordinate of point a
	 * @param ya — the y coordinate of point a
	 * @param xb — the x coordinate of point b
	 * @param yb — the y coordinate of point b
	 * @return a double, the distance of point a from point b.
	 */
	private double pointDistance(double xa, double ya, double xb, double yb) {
		return Math.sqrt(Math.pow((xb - xa), 2) + Math.pow((yb - ya), 2));
	}

}
