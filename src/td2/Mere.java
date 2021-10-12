package td2;

import java.io.IOException;

public class Mere {
	public void a() {System.out.println("Mere_a"); }
	void b(Fille fille) {System.out.println("Mere_b(Fille)");}
	
	void c() {System.out.println("Mere_c");}
	void c(Mere mere) {System.out.println("Mere_c(Mere)"); }

	static void d() {System.out.println("static Mere_d");}
	
	protected void e() {System.out.println("Mere_e");}
	private void f() {System.out.println("Mere_f");}
	public void printF() { f(); }
	
	Object g() {System.out.println("Mere_g"); return 2;}
	int h() {System.out.println("Mere_h"); return 2;}
	void i() {System.out.println("Mere_i");}
	
	void j() throws Exception {System.out.println("Mere_j"); }
	void k() throws IOException {System.out.println("Mere_k"); }
	void l() throws Exception {System.out.println("Mere_l"); }
	void m() throws Exception, ArrayIndexOutOfBoundsException {System.out.println("Mere_m"); }
	}
	class Fille extends Mere{
	 void miage() {System.out.println("Miage");}
	
	public void a() {System.out.println("Fille_a"); }
	
	protected void b(Fille fille) {System.out.println("Fille_b(Fille)");}
	
	public void c(Mere mere) {System.out.println("Fille_c(Mere)");}
	void c(Fille b) {System.out.println("Fille_c(Fille)"); }
	
	static void d() {System.out.println("static Fille_d");}
	static void d(Mere mere) {System.out.println("Fille_d(Mere)");}
	
	protected void e() {System.out.println("Fille_e");}
	
	public void f() {System.out.println("Fille_f");}
	
	 String g() {System.out.println("Fille_g"); return "c";}
	 //char h() {System.out.println("Fille_h"); return 'c';}
	//int i() {System.out.println("Fille_i"); return 3; }
	
	 void j() throws IOException {System.out.println("Fille_j"); }
	 //void k() throws Exception {System.out.println("Fille_k"); }
	void l() {System.out.println("Fille_l");}
	void m() throws IOException, IllegalArgumentException {System.out.println("Fille_m"); }
	}
	
	
	

