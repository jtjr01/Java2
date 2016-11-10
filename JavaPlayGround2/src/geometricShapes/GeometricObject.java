package geometricShapes;

public class GeometricObject implements Comparable {
	private String color = "white";
	private boolean filled;
	private int max;
	private java.util.Date dateCreated;

	/** Construct a default geometric object */
	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	/**
	 * Construct a geometric object with the specified color and filled value
	 */
	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	/** Return color */
	public String getColor() {
		return color;
	}
	/** return max*/
	public int getMax()
	{
		return max;
	}

	/** Set a new color */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * Return filled. Since filled is boolean, its get method is named isFilled
	 */
	public boolean isFilled() {
		return filled;
	}

	/** Set a new filled */
	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	/** Get dateCreated */
	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	/** Return a string representation of this object */
	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color
				+ " and filled: " + filled;
	}
	
	@Override
	/** Compares the two objects*/
	public int compareTo(Object shape) {
		GeometricObject shape2 =(GeometricObject) shape;
			
		if(this.getMax() < shape2.getMax())
		{
			return -1;
		}		
		return 0;
	}
}