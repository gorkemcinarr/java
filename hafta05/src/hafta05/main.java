package hafta05;
import hafta05.Ogrenci;
public class main {

	public static void main(String[] args) {

		Kisi kisi = new Kisi("Ahmet Y�lmaz",105588323);
		Ogrenci ogr = new Ogrenci("Ahmet Y�lmaz",105588323,85);
		Personel per = new Personel("Ahmet Y�lmaz",105588323,2415485);
		
		//kisi.numaraYazdir();
		//ogr.numaraYazdir();
		//per.numaraYazdir();
				
		System.out.println(kisi.toString());
		System.out.println(ogr.toString());
		System.out.println(per.toString());
	}

}
