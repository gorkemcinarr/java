package lab05;

public class Bilgisayar extends Cihaz {

	
	@Override
	public void kapat() {
		System.out.println("Bilgisayar kapanıyor");
		System.out.println("Kapanana Kadar Bekleyiniz.");
	}

	@Override
	public void baslat() {
		System.out.println("Bilgisayar Başlatılıyor");
	}

	@Override
	public void modelbilgi() {
		super.modelbilgi();
	}

	public Bilgisayar(int yil) {
		super(yil);
	}


}
