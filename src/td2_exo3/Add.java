package td2_exo3;

public class Add implements Expr{
	final private Expr right,left;
	public Add(Expr right,Expr left)
	{
		this.left=left;
		this.right=right;
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return right.eval()+left.eval();
	}
	
}
