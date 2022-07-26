package phase1.java;


import phase.java.ClassN;
import phase.java.ClassM;
	
public class ClassY extends ClassN
{

	public static void main(String[] args) {
		new ClassX().methodofpublicX();
		new ClassY().methodofpublicN();
		new ClassY().methodofprotectedN();
		new ClassM().methodofpublicM();

	}
	
}