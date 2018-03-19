package Clinic;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.Scanner;

public class tstClinic implements Personnel{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Person P = new Medecin ("Test","Tester",25);
			/*System.out.println (P);*/
			Medecin M = new Medecin ("Test","Tester",25);
			System.out.println (M);
			Scanner sc = new Scanner(System.in);
			String nom = sc.nextLine();
			Patient Pa = new Patient (nom,"Tester",25);
			System.out.println (Pa);
			Mesure m1 = new Mesure (175,65,85,12);
			System.out.println (m1);
			Pa.Mes = m1;
			/*System.out.println (Pa);
			Diagnostic d = new Diagnostic (m1);
			System.out.println (d);*/
			M.setOrdonnance(Pa);
			System.out.println(M.facture());
			
	}

	@Override
	public int facture() {
		// TODO Auto-generated method stub
		return 20;
	}

	

}
