import java.util.Scanner;

import racunar.LapTop;
import racunar.Racunar;
import servis.evidencija.EvidencijaRacunara;
import servis.evidencija.Servis;


public class Aplikacija {

	public static void main(String[] args) {
		
//		priprema podataka
		Servis servisSasa = new Servis();
		
		Racunar djoletovRacunar = new LapTop("5454", 2.50, "Toshiba",15.6);
		EvidencijaRacunara djoletovaEvidencija = new EvidencijaRacunara("1A", "Djordje", djoletovRacunar);
		servisSasa.dodajRacunarNaServis(djoletovaEvidencija);
		
		Racunar tanjinRacunar = new LapTop("6565", 2.40, "dell", 15.6);
		EvidencijaRacunara tanjinaEvidencija = new EvidencijaRacunara("3A", "Tanja", tanjinRacunar);
		servisSasa.dodajRacunarNaServis(tanjinaEvidencija);
		
		Scanner ulaz = new Scanner(System.in);
		
		while(true) {
		System.out.println("Komande za rad sa servisom: ");
		System.out.println("   0 - izlazak iz aplikacije");
		System.out.println("   1 - pregled racunara na servisu");
		System.out.println("   2 - unos novog racunara");
		System.out.println("   3 - uzmi na obradu");
		Integer ulaznaKomanda = ulaz.nextInt();
		if (ulaznaKomanda == 0) {
			System.out.println("*** Izlazak iz aplikacije ***");
			break;
		}
		if (ulaznaKomanda == 1) {
			servisSasa.racunariNaServisu();	
		}
		if (ulaznaKomanda == 2) {
			EvidencijaRacunara er = Helper.unesiEvidenciju(ulaz);
			servisSasa.dodajRacunarNaServis(er);
			System.out.println("*** Uspesno ste dodali racunar ***");
			System.out.println();
		}
		if (ulaznaKomanda == 3)  {
			System.out.println("Unesite evidencioni broj");
			String evidencioniBroj = ulaz.next();
			servisSasa.preuzmiURad(evidencioniBroj);
			}
		}

	}

}
