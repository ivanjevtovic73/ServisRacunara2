package racunar;

public abstract class Racunar {

	private String serijskiBroj;
	private Double brzinaProcesora;
	private String marka;
	
		
	public Racunar(String serijskiBroj, Double brzinaProcesora, String marka) {
		super();
		this.serijskiBroj = serijskiBroj;
		this.brzinaProcesora = brzinaProcesora;
		this.marka = marka;
	}
	
	public void informacijeORacunaru(){
		System.out.println("Racunar na servisu je " + serijskiBroj);
	}
	
	public String getSerijskiBroj() {
		return serijskiBroj;
	}
	public void setSerijskiBroj(String serijskiBroj) {
		this.serijskiBroj = serijskiBroj;
	}
	public Double getBrzinaProcesora() {
		return brzinaProcesora;
	}
	public void setBrzinaProcesora(Double brzinaProcesora) {
		this.brzinaProcesora = brzinaProcesora;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	
	
	
}
