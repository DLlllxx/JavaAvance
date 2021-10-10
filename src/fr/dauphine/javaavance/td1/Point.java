package fr.dauphine.javaavance.td1;

import java.security.AccessControlContext;
import java.util.ArrayList;
import java.util.Objects;

public class Point {
	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Point other = (Point) obj;
		return x == other.x && y == other.y;
	}

	private int x;
	private int y;
	public static int cpt;
	//exo2.5
	public Point(int px,int py) {
		x=px;
		y=py;
	}
	//exo2.6
	
	/**public Point(int x,int y) {
		x=x;
		y=y;
	}
	**/
	//exo2.7
	/**public Point(int px,int py) {
		x=px;
		y=py;
		cpt++;
	}**/
	
	public static void affiche(int x,int y) {
	Point p2 = new Point(x, y);
	Point p = new Point(p2.x,p2.y);
	System.out.println(p.x+" "+p.y);
	//exo2.9
	Point point = new Point(x,y);
	System.out.println(point);
	}
	
	//exo3.1
	public static void compare()
	{
		Point p1=new Point(1, 2);
		Point p2=p1;
		Point p3=new Point(1, 2);
		
		System.out.println(p1==p2);
		System.out.println(p1==p3);
		System.out.println(p1+" "+p2+" "+p3);
	}
	
	//exo3.2
	public boolean isSameAs(Point p1,Point p2)
	{
		if(p1.x==p2.x && p1.y==p2.y)  {
			return true;
		}
		else return false;
	}
	
	//exo3.3
	public static void exo3_3() {
		Point p1=new Point(1, 2);
		Point p2=p1;
		Point p3=new Point(1, 2);
		
		ArrayList<Point> list = new ArrayList<>();
		list.add(p1);
		//Apr¨¨s la modification
		list.add(p3);
		System.out.println(list.indexOf(p2));
		System.out.println(list.indexOf(p3));
	}
	
	//exo5.1
	public void translate(int dx,int dy)
	{
		this.x=this.x+dx;
		this.y=this.y+dy;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public static int getCpt() {
		return cpt;
	}
	
	

}
