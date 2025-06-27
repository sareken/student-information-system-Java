//SARE EKEN 22100011016
package ÖDEV1;
public class YLOgrencisi extends Ogrenci {
    private int ogrID;
    private String durum;

    private static int nextOgrID = 1;

    public YLOgrencisi(int bolNo, String ogrAd, String ogrSoyad) {
        super(bolNo, ogrAd, ogrSoyad);
        this.ogrID = nextOgrID;
        nextOgrID++;
        this.durum = "Yüksek Lisans";
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