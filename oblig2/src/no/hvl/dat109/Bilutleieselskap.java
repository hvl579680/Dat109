package no.hvl.dat109;

public class Bilutleieselskap {
	private String navn;
	private int telefon;
	private String adresse;
	
	public Bilutleieselskap(String navn, int telefon, String adresse) {
		this.navn = navn;
		this.telefon = telefon;
		this.adresse = adresse;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public int getTelefon() {
		return telefon;
	}

	public void setTelefon(int telefon) {
		this.telefon = telefon;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	

}
