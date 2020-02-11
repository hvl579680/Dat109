package no.hvl.dat109;

public class Bil {
	private String regnr;
	private String merke;
	private String modell;
	private String farge;
	private char utleiegruppe;
	private boolean ledig = true;
	
	public Bil(String regnr, String merke, String modell, String farge, char utleiegruppe, boolean ledig) {
		this.regnr = regnr;
		this.merke = merke;
		this.modell = modell;
		this.farge = farge;
		this.utleiegruppe = utleiegruppe;
		this.ledig = true;
	}

	public String getRegnr() {
		return regnr;
	}

	public void setRegnr(String regnr) {
		this.regnr = regnr;
	}

	public String getMerke() {
		return merke;
	}

	public void setMerke(String merke) {
		this.merke = merke;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public String getFarge() {
		return farge;
	}

	public void setFarge(String farge) {
		this.farge = farge;
	}

	public char getUtleiegruppe() {
		return utleiegruppe;
	}

	public void setUtleiegruppe(char utleiegruppe) {
		this.utleiegruppe = utleiegruppe;
	}

	public boolean isLedig() {
		return ledig;
	}

	public void setLedig(boolean ledig) {
		this.ledig = ledig;
	}
	

}
