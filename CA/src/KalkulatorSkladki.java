import java.time.LocalDateTime;

public class KalkulatorSkladki {

	Double stawkaPodstawowa, korekcjaStawkiPodstawowej;

	public Double obliczSkladke(Polisa polisa) {
		Podmiot podmiot = polisa.getPodmiot();
		Pojazd pojazd = polisa.getPojazd();
		stawkaPodstawowa = polisa.getStawkaPodstawowa();
		korekcjaStawkiPodstawowej = 0.0;
		
		korekcjaStawkiPodstawowej = 
				  zmianaZaleznaOdWiekuPodmiotu(podmiot, stawkaPodstawowa)
				+ zmianaZaleznaOdWiekuPojazdu(pojazd, stawkaPodstawowa) 
				+ zmianaZaleznaOdPojemnosciSilnika(pojazd, stawkaPodstawowa)
				+ zmianaZaleznaOdKoloru(pojazd, stawkaPodstawowa);
		return stawkaPodstawowa + korekcjaStawkiPodstawowej;
	}

	private double zmianaZaleznaOdWiekuPodmiotu(Podmiot podmiot, Double stawkaPodstawowa) {
		if (podmiot.getWiek() > 35) {
			return -stawkaPodstawowa * 0.2;
		} else if (podmiot.getWiek() < 25) {
			return stawkaPodstawowa * 0.5;
		}
		return 0;
	}

	private double zmianaZaleznaOdWiekuPojazdu(Pojazd pojazd, Double stawkaPodstawowa) {
		LocalDateTime localDateTime = LocalDateTime.now();

		if (localDateTime.getYear() - pojazd.getRokProdukcji() > 10) {
			return -stawkaPodstawowa * 0.05;
		} else if (localDateTime.getYear() - pojazd.getRokProdukcji() < 5) {
			return stawkaPodstawowa * 0.05;
		}
		return 0;
	}

	private double zmianaZaleznaOdPojemnosciSilnika(Pojazd pojazd, Double stawkaPodstawowa) {
		if (pojazd.getPojemnosc() < 2000)
			return -stawkaPodstawowa * 0.15;
		return 0;
	}

	private double zmianaZaleznaOdKoloru(Pojazd pojazd, Double stawkaPodstawowa) {
		if (pojazd.getKolor() == "czerwony") {
			return stawkaPodstawowa * 0.1;
		} else if (pojazd.getKolor() == "niebieski" && pojazd.getTypNadwozia().equals(TYP_NADWOZIA.COUPE)) {
			return -stawkaPodstawowa * 0.05;
		}
		return 0;
	}

}
