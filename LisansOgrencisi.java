//SARE EKEN 22100011016
package ÖDEV1;
public class LisansOgrencisi extends Ogrenci {
    private int ogrSinif;
    private int ogrID;
    private String durum;

    private static int nextOgrID = 1;

    public LisansOgrencisi(int bolNo, String ogrAd, String ogrSoyad ,int ogrSinif) {
        super(bolNo, ogrAd, ogrSoyad);
        this.ogrSinif = ogrSinif;
    
        this.ogrID = nextOgrID;
        nextOgrID++;
        this.durum = "Lisans";
    }

	public int getOgrSinif() {
		return ogrSinif;
	}

	public void setOgrSinif(int ogrSinif) {
		this.ogrSinif = ogrSinif;
	}

	public int getOgrID() {
		return ogrID;
	}

	public void setOgrID(int ogrID) {
		this.ogrID = ogrID;
	}

	public String getDurum() {
		return durum;
	}

	public void setDurum(String durum) {
		this.durum = durum;
	}
    

}