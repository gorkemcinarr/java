package hafta03;

public class ogrenci {
	
	
	private String adSoyad;
	private int no;
	private String sehir;
	
	
	public ogrenci() {
		
	}
	
	//yapılandırıcı 2. versiyon
	public ogrenci(String adSoyad,int no) {
		this(adSoyad,no,"Ankara");
		//this.adSoyad=adSoyad;
		//this.no=no;
		//this.sehir="Ankara";
	}
	
	
	
	//yapılandırıcı 3. versiyon
	//Yapılancıdırıcı Aşırı yükleme
	//(CONSTRUCTOR OVERLOADING)
	public ogrenci(String adSoyad,int no,String sehir) {
		
		this.adSoyad=adSoyad;
		this.no=no;
		this.sehir=sehir;
		
	}

}
