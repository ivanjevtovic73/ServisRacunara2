package racunar;

public class Naplata {
	
	Long iznos;
	String valuta;
	Boolean placeno;
	
	public Naplata(Long iznos, String valuta, Boolean placeno) {
		super();
		this.iznos = iznos;
		this.valuta = valuta;
		this.placeno = placeno;
	}

	public Long getIznos() {
		return iznos;
	}

	public void setIznos(Long iznos) {
		this.iznos = iznos;
	}

	public String getValuta() {
		return valuta;
	}

	public void setValuta(String valuta) {
		this.valuta = valuta;
	}

	public Boolean getPlaceno() {
		return placeno;
	}

	public void setPlaceno(Boolean placeno) {
		this.placeno = placeno;
	}
	
	
	
	

}
