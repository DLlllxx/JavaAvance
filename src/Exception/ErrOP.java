package Exception;

public abstract class ErrOP extends Exception{

	public ErrOP(int n1,int n2)
	{
		super();
	}
	public abstract void printMessage();
}