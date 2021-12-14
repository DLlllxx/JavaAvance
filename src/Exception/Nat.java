package Exception;
import javax.management.BadBinaryOpValueExpException;

public class Nat {
	private int n = 0;
	public Nat (int val) throws ErrConst{
		if(val <0)
		{
			throw new ErrConst("La valeur doit ¨ºtre positive");
			
		}
		this.n=val;
	}
	public static Nat summeNat(Nat n1,Nat n2) throws ErrConst,ErrS
	{
		long s = (long)n1.getN()+(long)n2.getN();
		if(s>Integer.MAX_VALUE) throw new ErrS(n1.getN(),n2.getN());
		Nat nat = new Nat(n1.getN()+n2.getN());
		return nat;
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
