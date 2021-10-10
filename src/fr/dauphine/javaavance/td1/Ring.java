package fr.dauphine.javaavance.td1;

public class Ring extends Circle{
	private float outerRadius;
	private float innerRadius;
	//exo6.2
	public Ring(Point point, float innerRadius,float outerRadius) {
		super(point, innerRadius);
		this.innerRadius=innerRadius;
		this.outerRadius=outerRadius;
		if(innerRadius>outerRadius) {
			float a = innerRadius;
			innerRadius=this.outerRadius;
			this.outerRadius=a;
			}
	}
	
	public float getInnerRadius() {
		return innerRadius;
	}

	public void setInnerRadius(float innerRadius) {
		this.innerRadius = innerRadius;
	}

	//exo6.3
	public boolean equals(Ring r1,Ring r2)
	{
		boolean bool = false;
		if(r1.getCenter().isSameAs(r1.getCenter(), r2.getCenter())==true)
		{
			if(r1.getInnerRadius()==r2.getInnerRadius() && r1.getOuterRadius()==r2.getOuterRadius())
		
			{
				bool = true;
			}
		}
		return bool;
	}
	
	//exo6.4
	public void afficher(Ring ring)
	{
		System.out.println("centre;"+ring.getCenter().toString() + " Rayon:"+ring.getOuterRadius()+" Rayon interne:"+ring.getInnerRadius());
	}
	

	public float getOuterRadius() {
		return outerRadius;
	}

	public void setOuterRadius(float outerRadius) {
		this.outerRadius = outerRadius;
	}
	
}
