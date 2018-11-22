package servis.evidencija;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import racunar.Desktop;
import racunar.LapTop;
import racunar.MobilniTelefon;
import racunar.Naplata;

public class Servis {
	
	private List<EvidencijaRacunara> racunari;

	public Servis() {
		this.racunari = new ArrayList<>();
	}
	
	public void dodajRacunarNaServis(EvidencijaRacunara racunarZaEvidenciju) throws IOException {
		racunari.add(racunarZaEvidenciju);
		BufferedWriter writer = new BufferedWriter(new FileWriter("c:/servis/" + racunarZaEvidenciju.getEvidencioniBroj() + ".txt"));
		writer.write(racunarZaEvidenciju.toString());
		writer.close();
	}
		
	public void preuzmiURad(String evidencioniBroj) {
		for (EvidencijaRacunara evidencija : racunari) {
			if (evidencija.getEvidencioniBroj().equals(evidencioniBroj)) {
				evidencija.setStatusServisa(Status.U_RADU);
			}
		}
	}
	
	public void zavrsiServis(String evidencioniBroj) {
		for (EvidencijaRacunara evidencija : racunari) {
			if (evidencija.getEvidencioniBroj().equals(evidencioniBroj)) {
				evidencija.setStatusServisa(Status.ZAVRSEN_SERVIS);
				evidencija.setDatumZavrsetkaServisa(LocalDate.now());
			}
		}		
	}
	
	public void otpremaRacunara(String evidencioniBroj, Boolean placeno) {
		for (EvidencijaRacunara evidencija : racunari) {
			placeno = false;
			if (evidencija.getEvidencioniBroj().equals(evidencioniBroj)) {
				evidencija.setStatusServisa(Status.ROBA_PREUZETA);
				placeno = true;
			}
			
		}
	}
	
	
	public void racunariNaServisu() throws IOException {
		BufferedWriter pisac = new BufferedWriter(new FileWriter("c:/servis/RacunariNaServisu.txt"));
		for(EvidencijaRacunara evidencija : racunari) {
			evidencija.informacijeOEvidenciji();
			pisac.write(evidencija.toString() );
			pisac.newLine();
		}
		pisac.close();
	}

	public void desktopRacunariNaServisu() {
		for(EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getRacunar() instanceof Desktop) {
				evidencija.informacijeOEvidenciji();				
			}
		}
	}
	
	public void lapTopRacunariNaServisu() {
		for(EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getRacunar() instanceof LapTop) {
				evidencija.informacijeOEvidenciji();	
			}
		}
	}
	
	public void mobilniTelefoniNaServisu() {
		for(EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getRacunar() instanceof MobilniTelefon) {
				evidencija.informacijeOEvidenciji();	
			}
		}
	}	
		
	public void spisakRacunaraNaServisu() {
		boolean nema = true;
		for(EvidencijaRacunara evidencija : racunari) {
			if(evidencija.getStatusServisa() == Status.U_RADU) {
				evidencija.informacijeOEvidenciji();
				nema = false;
			}
		}
		if (nema == true) System.out.println("Serviseri zabusavaju!!!");
	}
	
}