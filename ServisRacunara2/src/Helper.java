import java.util.Scanner;

import racunar.LapTop;
import racunar.Racunar;
import servis.evidencija.EvidencijaRacunara;

public class Helper {

	public static EvidencijaRacunara unesiEvidenciju (Scanner ulaz) {
		System.out.println("Unesite vlasnika racunara: ");
		String vlasnik = ulaz.next();
		
		System.out.println("Unesite evidencioni broj: ");
		String evidencioniBroj = ulaz.next();
		
		System.out.println("Unesite serijski broj racunara: ");
		String serijskiBrojRacunara = ulaz.next();
		
		System.out.println("Unesite marku racunara: ");
		String marku = ulaz.next();
		
		System.out.println("Unesite brzinu procesora: ");
		Double brzina = ulaz.nextDouble();
		
		System.out.println("Unesite velicinu ekrana: ");
		Double dijagonala = ulaz.nextDouble();
		
		Racunar r = new LapTop(serijskiBrojRacunara, brzina, marku, dijagonala);
		EvidencijaRacunara evidencija = new EvidencijaRacunara(evidencioniBroj, vlasnik, r);
		return evidencija;
	}
}
