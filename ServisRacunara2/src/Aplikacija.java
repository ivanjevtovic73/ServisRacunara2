import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import racunar.LapTop;
import racunar.Racunar;
import racunar.Desktop;
import racunar.TipKucista;
import servis.evidencija.EvidencijaRacunara;
import servis.evidencija.Servis;


public class Aplikacija {

	public static void main(String[] args) throws IOException {
		
//		priprema podataka
		Servis servisSasa = new Servis();
		
		Racunar djoletovRacunar = new LapTop("5454", 2.50, "Toshiba",15.6);
		EvidencijaRacunara djoletovaEvidencija = new EvidencijaRacunara("1A", "Djordje", djoletovRacunar);
		servisSasa.dodajRacunarNaServis(djoletovaEvidencija);
		
		Racunar tanjinRacunar = new LapTop("6565", 2.40, "dell", 15.6);
		EvidencijaRacunara tanjinaEvidencija = new EvidencijaRacunara("2A", "Tanja", tanjinRacunar);
		servisSasa.dodajRacunarNaServis(tanjinaEvidencija);
		
		Racunar dejanovRacunar = new Desktop("4567", 2.7D, "lenovo", TipKucista.MICRO_ATX);
		EvidencijaRacunara dejanovaEvidencija = new EvidencijaRacunara("3A", "Dejan", dejanovRacunar);
		servisSasa.dodajRacunarNaServis(dejanovaEvidencija);
		
		Racunar ivanovRacunar = new Desktop("123456", 1.7, "dell", TipKucista.ATX);
		EvidencijaRacunara ivanovaEvidencija = new EvidencijaRacunara("4A", "Ivan", ivanovRacunar);
		servisSasa.dodajRacunarNaServis(ivanovaEvidencija);
		
//		rad sa listom
		Scanner ulaz = new Scanner(System.in);
		
		while(true) {
		System.out.println("Komande za rad sa servisom: ");
		System.out.println("   0 - izlazak iz aplikacije");
		System.out.println("   1 - pregled racunara na servisu");
		System.out.println("   2 - unos novog racunara");
		System.out.println("   3 - uzmi na obradu");
		System.out.println("   4 - zavrsi servis");
		System.out.println("   5 - naplata servisa");
		System.out.println("   6 - spisak mobilnih telefona na servisu");
		System.out.println("   7 - spisak racunara koji su u radu");
		System.out.println("   8 - spisak Desktop racunara");
		System.out.println("   9 - spisak LapTop racunara");
		

		int ulaznaKomanda = ulaz.nextInt();
		if(ulaznaKomanda == 0) {
			System.out.println("*** Izlaz iz aplikacije. ***");
			break;
		}

		if(ulaznaKomanda == 1) {
			servisSasa.racunariNaServisu();
			

			
		}

		if(ulaznaKomanda == 2) {
			EvidencijaRacunara er = Helper.unesiEvidenciju(ulaz);
			servisSasa.dodajRacunarNaServis(er);
			System.out.println("*** Uspesno ste dodali racunar u servis. ***");
			System.out.println("");
		}

		if(ulaznaKomanda == 3) {
			System.out.println("Unesi evidencioni broj: ");
			String evidencioniBroj = ulaz.next();
			servisSasa.preuzmiURad(evidencioniBroj);
		}

		if(ulaznaKomanda == 4) {
			System.out.println("Unesi evidencioni broj: ");
			String evidencioniBroj = ulaz.next();
			servisSasa.zavrsiServis(evidencioniBroj);
		}
		
		if(ulaznaKomanda == 5) {
			System.out.println("Unesi evidencioni broj: ");
			String evidencioniBroj = ulaz.next();
			System.out.println("Da li je placeno (true/false");
			Boolean placeno = ulaz.nextBoolean();
			servisSasa.otpremaRacunara(evidencioniBroj, placeno);;
		}		
		
		if(ulaznaKomanda == 6 ) {
			servisSasa.mobilniTelefoniNaServisu();
		}
		
		
		if(ulaznaKomanda == 7 ) {
			servisSasa.spisakRacunaraNaServisu();
		}
		
		if(ulaznaKomanda == 8) {
			servisSasa.desktopRacunariNaServisu();
		}
		
		if( ulaznaKomanda == 9) {
			servisSasa.lapTopRacunariNaServisu();
		}
		}

	}

}
