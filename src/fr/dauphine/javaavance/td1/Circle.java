package fr.dauphine.javaavance.td1;

public class Circle {
	private Point center;
	private float radius;
	//exo5.2
	public Circle(Point point, float radius)
	{
		this.center=point;
		this.radius=radius;
	}

	//exo5.3
	@Override
	public String toString() {
		return "Circle [center=" + center.getX() +"," + center.getY() + ", radius=" + radius + ", area = " + area() + "]";
	}

	//exo5.4
	public void translate(int dx,int dy)
	{
		Point newCenterPoint = new Point(dx,dy);
		setCenter(newCenterPoint);
	}
	//exo5.7
	public float area()
	{
		float area = (float) (radius*radius*3.14);
		return area;
	}
	//exo5.8
	public boolean contains(Point p)
	{
		boolean bool = false;
		if(p.getX()==center.getX() &&p.getY()==center.getY())
		{
			bool = true; 	
		}
		if(((p.getX()-center.getX())*(p.getX()-center.getX()) +(p.getY()-center.getY())*(p.getY()-center.getY()))<radius*radius)
		{
			bool = true;
		}
			return bool;
	}
	

	
	
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public float getRadius() {
		return radius;
	}

	public void setRadius(float radius) {
		this.radius = radius;
	}
}
