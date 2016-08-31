public class Main {

	public static void main(String[] args) {

		Podmiot podmiot = new Podmiot.Builder()
				.imie("Janusz")
				.nazwisko("Cebula")
				.wiek(47)
				.build();

		Pojazd pojazd = new Pojazd.Builder()
				.marka("Fiat")
				.pojemnosc(652)
				.rokProdukcji(1973)
				.kolor("czerwony")
				.typNadwozia(TYP_NADWOZIA.COUPE)
				.build();

		Polisa polisa = new Polisa.Builder()
				.stawkaPodstawowa(100.0)
				.podmiot(podmiot)
				.pojazd(pojazd)
				.build();
		
		System.out.println(polisa);
		
		KalkulatorSkladki kalkulatorSkladki = new KalkulatorSkladki();
		
		System.out.println(kalkulatorSkladki.obliczSkladke(polisa));

	}
}
