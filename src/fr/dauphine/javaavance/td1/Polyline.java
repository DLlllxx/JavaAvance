package fr.dauphine.javaavance.td1;

import java.util.Iterator;
import java.util.LinkedList;

public class Polyline {
	//exo4.1
	private int size;
	private Point polylineArrayList[];
	private LinkedList<Point> polylineLinkedList;
	public Polyline(int max)
	{
		size=max;
		polylineArrayList = new Point[size];
	}
	//L'utilisation de LinkedList---exo4.6
	public Polyline()
	{
		polylineLinkedList=new LinkedList<>();
	}
	//exo4.2
	public void add(Point p)
	{
		for(int i =0;i<size;i++) {
			if(polylineArrayList[i]==null) {
				polylineArrayList[i]=p;
			}
		}
	}
	
	//exo4.3
	public int pointCapacity(Polyline pl) {
		int cap = pl.polylineArrayList.length;
		return cap;
	}
	public int nbPoints(Polyline pl) {
		int cpt=0;
		for(int i=0;i<pl.polylineArrayList.length;i++)
		{
			if(pl.polylineArrayList[i]!=null)
			{
				cpt++;
			}
		}
		return cpt;
	}
	
	//exo4.4
	public Boolean contains(Polyline pl,Point p)
	{
		Boolean bool=false;
		for(Point point : pl.polylineArrayList)
		{
			if(point == p)
			{
				bool=true;
			}
		}
		return bool;
	}
	//exo4.6
	public int pointSize(Polyline pl)
	{
		return pl.polylineLinkedList.size();
	}
	public int nbPointsLinkedList(Polyline pl)
	{
		return pl.polylineLinkedList.size();
	}
	public boolean containsPolyLinked(Polyline pl,Point p)
	{
		boolean bool=false;
		if(pl.polylineLinkedList.contains(p))
		{
			bool=true;
		}
		return bool;
		
	}
	
	
}
