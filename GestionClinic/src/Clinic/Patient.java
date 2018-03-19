package Clinic;

public class Patient extends Person {
		public Mesure Mes;
		public String Ordonnance="";
	Patient(String familyName, String firstName, int age) {
		super(familyName, firstName, age);
		this.Mes = null;
	}
	public String toString ()
	{
		String out = "";
		out+= "Mr/Mme"+"\n";
		out+=super.toString();
		if (Mes!=null)
			out+=Mes.toString();
		return out;
	}
	

}
