package Clinic;

public abstract class Person {
	
	public String nom;
	public String Pnom;
	public int Age;
	
	Person (String familyName, String firstName, int age)
	{
		this.nom = familyName;
		this.Pnom = firstName;
		this.Age = age;
	}
	
	public String toString ()
	{
		String out ="";
		out += "Nom : "+this.nom+"\n";
		out += "Pr�nom : "+this.Pnom+"\n";
		out += "Age : "+this.Age+"\n";
		return out;
	}
}
