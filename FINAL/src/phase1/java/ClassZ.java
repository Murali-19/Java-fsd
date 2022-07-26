package phase1.java;

import phase.java.ClassM;
import phase.java.ClassN;
public class ClassZ extends ClassM{
	public static void main(String[] args) {
		new ClassX().methodofpublicX();
		new ClassZ().methodofprotectedM();
		new ClassZ().methodofpublicM();
		new ClassN().methodofpublicN();
	}
}
