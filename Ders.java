//SARE EKEN 22100011016
package ÖDEV1;
public class Ders {
    private int bolNo;
    private String dersAd;
    private int dersKredi;
    private int dersID;

    private static int nextDersID = 1;

    public Ders(int bolNo, String dersAd, int dersKredi) {
        this.bolNo = bolNo;
        this.dersAd = dersAd;
        this.dersKredi = dersKredi;
        this.dersID = nextDersID;
        nextDersID++;
    }

	public int getBolNo() {
		return bolNo;
	}

	public void setBolNo(int bolNo) {
		this.bolNo = bolNo;
	}

	public String getDersAd() {
		return dersAd;
	}

	public void setDersAd(String dersAd) {
		this.dersAd = dersAd;
	}

	public int getDersKredi() {
		return dersKredi;
	}

	public void setDersKredi(int dersKredi) {
		this.dersKredi = dersKredi;
	}

	public int getDersID() {
		return dersID;
	}

	public void setDersID(int dersID) {
		this.dersID = dersID;
	}
   

}
