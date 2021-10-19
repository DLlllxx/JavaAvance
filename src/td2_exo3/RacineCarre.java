package td2_exo3;

public class RacineCarre implements Expr{
	final private Expr expr;
	public RacineCarre(Expr e)
	{
		this.expr=e;
	}
	@Override
	public double eval() {
		// TODO Auto-generated method stub
		return Math.sqrt(expr.eval());
	}
	
	
}
