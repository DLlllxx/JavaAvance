package td2;

public class Main {
	
		public static void main(String[] args) throws Exception {
		Mere mere=new Mere();
		Mere mereFille=new Fille();
		Fille fille=new Fille();
		
		 //mere.miage();
		fille.miage();
		//mereFille.miage();
		((Fille)mereFille).miage();
		
		mere.a();
		mereFille.a();
		fille.a();
		((Mere)mereFille).a();
		mereFille.b(null);
		
		mereFille.c();
		mereFille.c(mere);
	 mereFille.c(mereFille);
		 mereFille.c(fille);
		 fille.c(fille);
		
		 mere.d();
		mereFille.d();
		
		mere.printF();
		mereFille.printF();
		
		mereFille.j();
		mereFille.k();
		mereFille.l();
		mereFille.m();
		}
}
