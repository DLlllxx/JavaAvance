package fr.dauphine.javaavance.td1;

public class TestPoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Point p = new Point();
		//System.out.println(p.x+" "+p.y);
		/**Point.affiche(1,2);
		Point.compare();
		Point.exo3_3();**/
		
		Polyline pl= new Polyline(1);
		Point p1=new Point(1, 2);
		Point p2=new Point(2, 2);
		pl.add(p1);
		pl.add(p2);
		pl.pointCapacity(pl);
		
		Circle c = new Circle(new Point(1, 2), 1);
		c.getCenter().translate(1,1);
		System.out.println(c);

	}

}
