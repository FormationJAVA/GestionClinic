package Clinic;

public class Medecin extends Person implements Personnel {

	Medecin(String familyName, String firstName, int age) {
		super(familyName, firstName, age);
	
	}
	public void setOrdonnance(Patient P)
	{
		Diagnostic d = new Diagnostic (P.Mes);
		P.Ordonnance = d.getOrdonnance();
	}
	public String toString ()
	{
		String out = "";
		out+= "Dr"+"\n";
		out+=super.toString();
		return out;
	}
	@Override
	public int facture() {
		int Prix = 2000;
		return Prix;
	}

}
