package racunar;

public class Desktop extends Racunar {

	private TipKucista kuciste;

	public Desktop(String serijskiBroj, Double brzinaProcesora, String marka, TipKucista kuciste) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.kuciste = kuciste;
	}

	public TipKucista getKuciste() {
		return kuciste;
	}

	public void setKuciste(TipKucista kuciste) {
		this.kuciste = kuciste;
	}
}