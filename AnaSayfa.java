//SARE EKEN 22100011016
package ÖDEV1;
import java.util.Scanner;
public class AnaSayfa {
	static Bolum[] bolumler;
	static Ogrenci[] ogrenciler;
	static Ders[] dersler;
	public static void TümBilgileriYazdir(Bolum[]bolumler)
   { 
		 for (int i = 0; i < bolumler.length; i++)
		 {
			 System.out.printf("Bölüm No: %d Bölüm Ad: %s",bolumler[i].getBolNo(),bolumler[i].getBolAd());
			 System.out.println("Lisans Öğrencileri:");
			 for (int j=0;j<bolumler[i].ogrenciler.length;j++)
			 {
				 System.out.println(j+".Öğrenci"+((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
						 +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrAd()
				         +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSoyad()
                         +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSinif());
			 }
			 System.out.println("Yüksek Lisans Öğrencileri:");
			 for (int j=0;j<bolumler[i].ogrenciler.length;j++)
			 { 
				 System.out.println(j+".Öğrenci"+((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
						 +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrAd()
				         +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSoyad());
			 }
			 System.out.println("Dersler:");
			 for (int j=0;j<bolumler[i].dersler.length;j++)
			 {
				 System.out.println(j+".Ders"+((Ders)bolumler[i].dersler[j]).getDersID()
				         +((Ders)bolumler[i].dersler[j]).getDersAd()
                         +((Ders)bolumler[i].dersler[j]).getDersKredi());
			 }
			 
		 }
   }
	public static void LisansOgrencileriniYazdir(int lisansOgrSayisi,Bolum[]bolumler)
	{
		System.out.print("Tüm Bölümlerdeki Lisans Öğrencileri:");
		for (int i = 0; i < bolumler.length; i++)
		{
			 for (int j=0;j<lisansOgrSayisi;j++)
			 {
				 for(int sinif=1;sinif<=4;sinif++)
				 {
						if(((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSinif()==sinif)
						{
							System.out.println(sinif +"Sınıf Öğrenciler:");
						    System.out.println(j+".Öğrenci"+((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
							+((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrAd()
			    	        +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSoyad());
						}
 
				 }
				     
			 }

	    }	  

	}
	public static void YüksekLisansOgrencileriniYazdir(int lisansOgrSayisi,int yuksekLisansOgrSayisi)
	{
		System.out.print("Tüm Bölümlerdeki Yüksek Lisans Öğrencileri:");
		for (int i = 0; i < bolumler.length; i++)
		{
			for (int j=lisansOgrSayisi;j<yuksekLisansOgrSayisi;j++)
			{
				 System.out.println(((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
						 +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrAd()
				         +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrSoyad());
			}
		}

	}
	public static void DersleriListele()
	{
		System.out.print("Tüm Bölümlerdeki Dersler:");
		for (int i = 0; i < bolumler.length; i++)
		{
		   for (int j=0;j<bolumler[i].dersler.length;j++)
		      {
			   System.out.println(((Ders)bolumler[i].dersler[j]).getDersID()
				       +((Ders)bolumler[i].dersler[j]).getDersAd()
                       +((Ders)bolumler[i].dersler[j]).getDersKredi());
		      }
		}

	}
	public static void AramaYap(String aranan,int lisansOgrSayisi,int yuksekLisansOgrSayisi,Bolum[]bolumler)
	{
		int syc=0;
		for (int i = 0; i < bolumler.length; i++)
		{
			for (int j=0;j<bolumler[i].ogrenciler.length;j++)
			{
				if(bolumler[i].ogrenciler[j].getOgrAd().compareTo(aranan)==0)
				{	
					
					 syc=1;
                     System.out.println(((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
							 +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
							 +bolumler[i].ogrenciler[j].getOgrAd()
					         +bolumler[i].ogrenciler[j].getOgrSoyad()
					         +bolumler[i].getBolAd()+bolumler[i]);
                     if(j<lisansOgrSayisi)
     				{
     					System.out.print("lisans Öğrencisi");
     					System.out.println(((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
     							 +((LisansOgrencisi)bolumler[i].ogrenciler[j]).getOgrID());
     				}
                     else
     				{
     					System.out.print("Yüksek lisans Öğrencisi");
     					System.out.println(((YLOgrencisi)bolumler[i].ogrenciler[j]).getOgrID()
     							 +((YLOgrencisi)bolumler[i].ogrenciler[j]).getOgrID());

     				}
					
				}
				else
				{
					System.out.print("BU İSİMDE ÖĞRENCİ BULUNAMADI!");
				}
				
						
			}
			for (int j=0;j<bolumler[i].dersler.length;j++)
			{
				if(bolumler[i].dersler[j].getDersAd().compareTo(aranan)==0)
					
				{
					syc=1;
					
				    System.out.println(((Ders)bolumler[i].dersler[j]).getDersID()
				    +((Ders)bolumler[i].dersler[j]).getDersAd()
                    +((Ders)bolumler[i].dersler[j]).getDersKredi()+bolumler[i]);
					
				}
				else
				{
					System.out.print("BU İSİMDE DERS BULUNAMADI!");
				}
			}
			  
		}
	}
	 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("LÜTFEN BÖLÜM SAYISINI GİRİNİZ :");
        int bolumSayisi = input.nextInt();
        Ogrenci[] ogrenciler =null;
        Ders[] dersler =null;
        Bolum[] bolumler = new Bolum[bolumSayisi];


        for (int i = 0; i < bolumSayisi; i++) {
            System.out.print(" Bölüm no: ");
            int bolNo = input.nextInt();
            input.nextLine();

            System.out.print("Bölüm adı: ");
            String bolAd = input.nextLine();
            
            bolumler[i] = new Bolum(bolNo, bolAd);

            System.out.print("Bölümünün lisans öğrencisi sayısı: ");
            int lisansOgrSayisi = input.nextInt();

            System.out.print("Bölümün Yüksek lisans öğrencisi sayısı: ");
            int yuksekLisansOgrSayisi = input.nextInt();          
            
            bolumler[i].ogrenciler= new Ogrenci[lisansOgrSayisi + yuksekLisansOgrSayisi];
            
            for (int j = 0; j < lisansOgrSayisi; j++) {
                System.out.print("Lisans öğrencisi adı: ");
                String ogrAd = input.next();

                System.out.print("Lisans öğrencisi soyadı: ");
                String ogrSoyad = input.next();

                System.out.print("Lisans öğrencisi numarası: ");
                int ogrNo = input.nextInt();

                System.out.print("Lisans öğrencisi sınıfı: ");
                int ogrSinif = input.nextInt();

                bolumler[i].ogrenciler[j] = new LisansOgrencisi(bolNo, ogrAd,ogrSoyad,ogrSinif);
            }

            for (int j = lisansOgrSayisi; j < lisansOgrSayisi + yuksekLisansOgrSayisi; j++) {
                System.out.print("Yüksek lisans öğrencisi adı: ");
                String ogrAd = input.next();

                System.out.print("Yüksek lisans öğrencisi soyadı: ");
                String ogrSoyad = input.next();

                System.out.print("Yüksek lisans öğrencisi numarası: ");
                int ogrNo = input.nextInt();

                bolumler[i].ogrenciler[j] = new YLOgrencisi(bolNo ,ogrAd, ogrSoyad);
            }

            System.out.print("Ders sayısı: ");
            int dersSayisi = input.nextInt();
            Ders[] dersler = new Ders[dersSayisi];

            for (int j = 0; j < dersSayisi; j++) {
                System.out.print("Ders adı: ");
                String dersAd = input.next();

                System.out.print("Ders kodu: ");
                int dersKod = input.nextInt();
                
                System.out.print("Ders kredisi: ");
                int dersKredi = input.nextInt();

                bolumler[i].dersler[j] = new Ders( bolNo,dersAd,dersKredi);
            }            
        }
        int secim = 0;

        while (secim != 6) {
            System.out.println("1- Tüm Bölümlerin Bilgilerini Listele");
            System.out.println("2- Lisans Öğrencilerini Listele");
            System.out.println("3- Yüksek Lisans Öğrencilerini Listele");
            System.out.println("4- Dersleri Listele");
            System.out.println("5- Arama Yap");
            System.out.println("6- Çıkış");

            System.out.print("Seçiminiz: ");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    TümBilgileriYazdir(bolumler);
                    break;
                case 2:
                    LisansOgrencileriniYazdir(lisansOgrSayisi,bolumler);
                    break;
                case 3:
                    YüksekLisansOgrencileriniYazdir(yuksekLisansOgrSayisi,bolumler);
                    break;
                case 4:
                    DersleriListele();
                    break;
                case 5:
                	System.out.print("Lütfen aramak istediğiniz kelimeyi giriniz:");
            		String aranan = input.next();
                    AramaYap(aranan,yuksekLisansOgrSayisi,lisansOgrSayisi,bolumler);
                    break;
                case 6:
                    System.out.println("Programdan çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Geçersiz sayı girdiniz!");
                    break;
            }
        }
    }

}
