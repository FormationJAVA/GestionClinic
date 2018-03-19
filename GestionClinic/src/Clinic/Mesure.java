package Clinic;

public class Mesure {
	/**Taille en cm*/
	public int taille;
	/**Poids en kg*/
	public int poids;
	/**Rythme cardiaque*/
	public int RC;
	/**Tension Arterielle*/
	public int TA;
	
	Mesure (int T, int P,int R, int TA)
	{
		this.taille = T;
		this.poids = P;
		this.RC = R;
		this.TA = TA;
	}
	
	public String toString ()
	{
		String out="";
		out+= "Taille (cm) :" + this.taille+"\n";
		out+= "Poids (Kg) :" + this.poids+"\n";
		out+= "Rythme cardiaque (Bpm) :" + this.RC+"\n";
		out+= "Tension Arteriel :" + this.TA+"\n";
		
		return out;
	}

}
