package racunar;

public class MobilniTelefon extends Racunar{

	private TipKartice tipKartice;

	public MobilniTelefon(String serijskiBroj, Double brzinaProcesora, String marka, TipKartice tipKartice) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.tipKartice = tipKartice;
	}

	public TipKartice getTipKartice() {
		return tipKartice;
	}

	public void setTipKartice(TipKartice tipKartice) {
		this.tipKartice = tipKartice;
	}
}