package mcgregor.benn;

public class Circle {
	double radius;
	Point location = new Point();
	double pi = Math.PI;
	
	/**
	 * constructor method that makes circles with radius at default location (0, 0).
	 * @param double r — the radius
	 */
	Circle(double r) {
		radius = r;
	}
	
	/**
	 * @return String human-readable location and radius of circle.
	 */
	@Override
	public String toString() {
		return "Location: (" + location.getXvalue() + ", " + location.getYvalue() + ")\n"
				+ "Radius: " + radius;
	}
	
	/**
	 * Mutator method that sets the radius of the circle.
	 * @param double r — the radius
	 */
	public void setRadius(double r) {
		radius = r;
	}
	
	/**
	 * Mutator method that sets the location of the circle.
	 * @param Point l — the location, a Point object
	 */
	public void setLocation(Point l) {
		location = l;
	}
	
	/**
	 * Accessor method that gives the radius of the circle.
	 * @return double radius — returns instance variable radius.
	 */
	public double getRadius() {
		return radius;
	}
	
	/**
	 * Accessor method that gives the location of the circle.
	 * @return Point location — returns Point object location.
	 */
	public Point getLocation() {
		return location;
	}
	
	/**
	 * Calculates the area of the circle.
	 * @return a double, the area of the circle.
	 */
	public double area() {
		return pi*Math.pow(radius,  2);
	}
	
	/**
	 * Calculates the circumference of the circle.
	 * @return a double, the circumference.
	 */
	public double circumference() {
		return pi*radius*2;
	}
	
	/**
	 * Checks to see if given Point p is inside the circle,
	 * namely, the distance from p to location < radius.
	 * @param Point p — a point object.
	 * @return boolean, whether or not p is inside circle.
	 */
	public boolean isPointInside(Point p) {
		return location.distanceFrom(p) < radius;
	}
	

}
