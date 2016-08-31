
public class Polisa {
	private Double stawkaPodstawowa;
	private Podmiot podmiot;
	private Pojazd pojazd;

	private Polisa(Builder builder) {
		this.stawkaPodstawowa = builder.stawkaPodstawowa;
		this.podmiot = builder.podmiot;
		this.pojazd = builder.pojazd;
	}

	public Double getStawkaPodstawowa() {
		return stawkaPodstawowa;
	}

	public Podmiot getPodmiot() {
		return podmiot;
	}

	public Pojazd getPojazd() {
		return pojazd;
	}

	public static class Builder {
		private Double stawkaPodstawowa;
		private Podmiot podmiot;
		private Pojazd pojazd;

		public Builder stawkaPodstawowa(Double stawkaPodstawowa) {
			this.stawkaPodstawowa = stawkaPodstawowa;
			return this;
		}

		public Builder podmiot(Podmiot podmiot) {
			this.podmiot = podmiot;
			return this;
		}

		public Builder pojazd(Pojazd pojazd) {
			this.pojazd = pojazd;
			return this;
		}

		public Polisa build() {
			return new Polisa(this);
		}
	}

	@Override
	public String toString() {
		return "Polisa [stawkaPodstawowa= " + stawkaPodstawowa + ", podmiot= " + podmiot + ", pojazd= " + pojazd + "]";
	}

}
