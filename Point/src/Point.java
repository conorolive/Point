/**
 * 
 */

/**
 * @author Conor
 *
 */

public class Point {
	
	private double x, y, z;

	public Point(double x, double y, double z) 
	{
		this.x = x;
		this.y = y;
		this.z = z;
	}
	
	public Point(double x, double y)
	{
		this(x, y, 0);
	}
	
	public Point(double x)
	{
		this(x, 0);
	}
	
	public Point()
	{
		this(0);
	}
	
	public double getX() 
	{
		return x;
	}
	
	public double getY() 
	{
		return y;
	}
	
	public double getZ() 
	{
		return z;
	}
	
	public void setX(double x) 
	{
		this.x = x;
	}
	
	public void setY(double y) 
	{
		this.y = y;
	}
	
	public void setZ(double z) 
	{
		this.z = z;
	}
	
	public String toString() 
	{
		return "(" + x + ", " + y + ", " + z + ")\n";
	}
	
	static double distance(Point p1, Point p2) 
	{
		return Math.sqrt( Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2) + Math.pow((p2.getZ() - p1.getZ()), 2) );
	}
	
	void add(Point pArr[])
	{
		for (Point p : pArr)
		{
			setX(getX() + p.getX());
			setY(getY() + p.getY());
			setZ(getZ() + p.getZ());
		}
	}
}
