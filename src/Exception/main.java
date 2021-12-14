package Exception;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Nat n1 = new Nat(10);
			Nat n2 = new Nat(20);
			Nat.summeNat(n1,n2);
		} catch (ErrConst e) {
			// TODO: handle exception
		e.printStackTrace();
		System.out.println(e.getMessage());
		}
		catch(ErrS e) {
		e.printMessage();
	}
}

}
