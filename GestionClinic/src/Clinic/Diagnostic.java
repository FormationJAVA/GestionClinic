package Clinic;

public class Diagnostic {

	private int RCseuilBas = 50; 
	private int RCseuileleve = 120;
	public Niveau EtatRC = Niveau.Normal;
	
	private int TAseuilBas = 5; 
	private int TAseuileleve = 12;
	public Niveau EtatTA = Niveau.Normal;
	Diagnostic (Mesure M)
	{
		if (M.RC> this.RCseuileleve) 
			EtatRC = Niveau.Haut;
		if (M.RC< this.RCseuilBas) 
			EtatRC = Niveau.Bas;
		
		if (M.TA> this.TAseuileleve) 
			EtatTA = Niveau.Haut;
		if (M.TA< this.TAseuilBas) 
			EtatTA = Niveau.Bas;
	}
	public String getOrdonnance()
	{
		String out="";
		switch (EtatRC)
		{
			case Bas:out+="01\n"; break;
			case Haut:out+="02\n"; break;
		}
		switch (EtatTA)
		{
			case Bas:out+="11\n"; break;
			case Haut:out+="12\n"; break;
		}
		return out;
	}
	
	public String toString ()
	{
		String out="";
		out+= "Le rythme cardiaque est : "+EtatRC+"\n";
		out+= "La tension arterielle est : "+EtatTA+"\n";
		return out;
	}
}

