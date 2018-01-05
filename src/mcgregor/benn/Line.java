package mcgregor.benn;

public class Line {
	Point start;
	Point end;
	
	/**
	 * Constructor method.
	 * @param Point start — a point object with the coordinates of the starting point.
	 * @param Point end — a point object with the coordinates of the ending point.
	 */
	Line(Point start, Point end) {
		this.start = start;
		this.end = end;
	}
	
	/**
	 * Calculates the length of the line segment with the end's distanceFrom method.
	 * @return a double, the length of the line segment.
	 */
	public double length() {
		return end.distanceFrom(start);
	}

}
