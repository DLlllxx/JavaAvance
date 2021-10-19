package td2_exo3;

public class Multi implements Expr{
	final private Expr left,right;
	public Multi(Expr right,Expr left)
	{
		this.left=left;
		this.right=right;
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return left.eval()*right.eval();
	}
	
}
