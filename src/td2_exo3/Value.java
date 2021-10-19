package td2_exo3;

public class Value implements Expr{
	final private double val;
	
	public Value(double v)
	{
		this.val=v;
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return val;
	}

}
