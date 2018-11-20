package racunar;

public class LapTop extends Racunar{
	
	private Double velicinaDispleja;

	public LapTop(String serijskiBroj, Double brzinaProcesora, String marka, Double velicinaDispleja) {
		super(serijskiBroj, brzinaProcesora, marka);
		this.velicinaDispleja = velicinaDispleja;
	}
		
	@Override
	public void informacijeORacunaru() {
		super.informacijeORacunaru();
		System.out.println("Ovo je LapTop");
	}

	public Double getVelicinaDispleja() {
		return velicinaDispleja;
	}

	public void setVelicinaDispleja(Double velicinaDispleja) {
		this.velicinaDispleja = velicinaDispleja;
	}
	
	
}
