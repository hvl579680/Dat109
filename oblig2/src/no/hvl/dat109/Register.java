package no.hvl.dat109;

public class Register {
	private int kredittkort;
	private int regnr;
	private int kmstand;
	private int datoutleie;
	private int klokkeslettutleie;
	private int datoforventet;
	private int klokkeslettforventet;
	private int datoretur;
	private int klokkeslettretur;
	private int kmstandretur;
	
	public Register(int kredittkort, int regnr, int kmstand, int datoutleie, int klokkeslettutleie, int datoforventet,
				int klokkeslettforventet, int datoretur, int klokkeslettretur, int kmstandretur) {
		this.kredittkort = kredittkort;
		this.regnr = regnr;
		this.kmstand = kmstand;
		this.datoutleie = datoutleie;
		this.klokkeslettutleie = klokkeslettutleie;
		this.datoforventet = datoforventet;
		this.klokkeslettforventet = klokkeslettforventet;
		this.datoretur = datoretur;
		this.klokkeslettretur = klokkeslettretur;
		this.kmstandretur = kmstandretur;
	}

	public int getKredittkort() {
		return kredittkort;
	}

	public void setKredittkort(int kredittkort) {
		this.kredittkort = kredittkort;
	}

	public int getRegnr() {
		return regnr;
	}

	public void setRegnr(int regnr) {
		this.regnr = regnr;
	}

	public int getKmstand() {
		return kmstand;
	}

	public void setKmstand(int kmstand) {
		this.kmstand = kmstand;
	}

	public int getDatoutleie() {
		return datoutleie;
	}

	public void setDatoutleie(int datoutleie) {
		this.datoutleie = datoutleie;
	}

	public int getKlokkeslettutleie() {
		return klokkeslettutleie;
	}

	public void setKlokkeslettutleie(int klokkeslettutleie) {
		this.klokkeslettutleie = klokkeslettutleie;
	}

	public int getDatoforventet() {
		return datoforventet;
	}

	public void setDatoforventet(int datoforventet) {
		this.datoforventet = datoforventet;
	}

	public int getKlokkeslettforventet() {
		return klokkeslettforventet;
	}

	public void setKlokkeslettforventet(int klokkeslettforventet) {
		this.klokkeslettforventet = klokkeslettforventet;
	}

	public int getDatoretur() {
		return datoretur;
	}

	public void setDatoretur(int datoretur) {
		this.datoretur = datoretur;
	}

	public int getKlokkeslettretur() {
		return klokkeslettretur;
	}

	public void setKlokkeslettretur(int klokkeslettretur) {
		this.klokkeslettretur = klokkeslettretur;
	}

	public int getKmstandretur() {
		return kmstandretur;
	}

	public void setKmstandretur(int kmstandretur) {
		this.kmstandretur = kmstandretur;
	}
	
	
	

}
