
public class Podmiot {
	private String imie, nazwsiko;
	private Integer wiek;

	private Podmiot(Builder builder) {
		this.imie = builder.imie;
		this.nazwsiko = builder.nazwisko;
		this.wiek = builder.wiek;
	}

	public String getImie() {
		return imie;
	}

	public String getNazwsiko() {
		return nazwsiko;
	}

	public Integer getWiek() {
		return wiek;
	}

	public static class Builder {
		private String imie, nazwisko;
		private Integer wiek;

		public Builder imie(String imie) {
			this.imie = imie;
			return this;
		}

		public Builder nazwisko(String nazwisko) {
			this.nazwisko = nazwisko;
			return this;
		}

		public Builder wiek(Integer wiek) {
			this.wiek = wiek;
			return this;
		}

		public Podmiot build() {
			return new Podmiot(this);
		}
	}

	@Override
	public String toString() {
		return "[imie= " + imie + ", nazwsiko= " + nazwsiko + ", wiek= " + wiek + "]";
	}

}
