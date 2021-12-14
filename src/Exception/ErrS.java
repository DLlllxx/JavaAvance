package Exception;

public class ErrS extends Exception {
	public ErrS(int n1,int n2)
	{
		super();
	}
	public void printMessage()
	{
		System.out.println("It is not possible to sum");
	}
}
