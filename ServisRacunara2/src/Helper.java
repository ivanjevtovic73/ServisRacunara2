import java.util.Scanner;


import racunar.Desktop;
import racunar.LapTop;
import racunar.MobilniTelefon;
import racunar.Racunar;
import racunar.TipKartice;
import racunar.TipKucista;
import servis.evidencija.EvidencijaRacunara;

public class Helper {

	public static EvidencijaRacunara unesiEvidenciju(Scanner ulaz) {

		System.out.println("Unesite vlasnika racunara: ");
		String vlasnik = ulaz.next();
		System.out.println("Unesite evidencioni broj: ");
		String evidencioniBroj = ulaz.next();
		System.out.println("Unesite tip racunara 1 - desktop, 2 - laptop.");
		int tipRacunara = ulaz.nextInt();
		Racunar unetiRacunar = null;
		if(tipRacunara == 1) {
			unetiRacunar = unosDesktopa(ulaz);
		} 
		if(tipRacunara == 2) {
			unetiRacunar = unosLapTopa(ulaz);
		}
		EvidencijaRacunara evidncija = new EvidencijaRacunara(evidencioniBroj, vlasnik, unetiRacunar);
		return evidncija;
	}

	private static Racunar unosDesktopa(Scanner ulaz) {
		System.out.println("Unesite serijski broj racunara: ");
		String serijskiBrojRacunara = ulaz.next();
		System.out.println("Unesite marku racunara: ");
		String marku = ulaz.next();
		System.out.println("Unesite brzinu procesora: ");
		Double brzina = ulaz.nextDouble();
		System.out.println("Unesite tip kucista: ATX ili MICRO_ATX");
		String pomTipKucista = ulaz.next().toUpperCase();
		TipKucista tipKucista = TipKucista.valueOf(pomTipKucista);
		return new Desktop(serijskiBrojRacunara, brzina, marku, tipKucista);
	}

	private static Racunar unosLapTopa(Scanner ulaz) {
		System.out.println("Unesite serijski broj racunara: ");
		String serijskiBrojRacunara = ulaz.next();
		System.out.println("Unesite marku racunara: ");
		String marku = ulaz.next();
		System.out.println("Unesite brzinu procesora: ");
		Double brzina = ulaz.nextDouble();
		System.out.println("Unesite dijagonalu ekrana: ");
		Double dijagonala = ulaz.nextDouble();
		return new LapTop(serijskiBrojRacunara, brzina, marku, dijagonala);
	}

	private static Racunar unosMobilnogTelefona(Scanner ulaz) {
		System.out.println("Unesite serijski broj telefona: ");
		String serijskiBrojRacunara = ulaz.next();
		System.out.println("Unesite marku telefona: ");
		String marku = ulaz.next();
		System.out.println("Unesite brzinu procesora: ");
		Double brzina = ulaz.nextDouble();
		System.out.println("Unesite tip SD kartice (MINI / MIKRO / NANO)");
		String pom = ulaz.next().toUpperCase();
		TipKartice tipKartice = TipKartice.valueOf(pom);
		return new MobilniTelefon (serijskiBrojRacunara, brzina, marku, tipKartice);
	}
}