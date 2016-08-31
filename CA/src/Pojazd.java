
public class Pojazd {
	private String marka;
	private Integer pojemnosc;
	private Integer rokProdukcji;
	private String kolor;
	private TYP_NADWOZIA typNadwozia;

	private Pojazd(Builder builder) {
		this.marka = builder.marka;
		this.pojemnosc = builder.pojemnosc;
		this.rokProdukcji = builder.rokProdukcji;
		this.kolor = builder.kolor;
		this.typNadwozia = builder.typNadwozia;
	}

	public String getMarka() {
		return marka;
	}

	public Integer getPojemnosc() {
		return pojemnosc;
	}

	public Integer getRokProdukcji() {
		return rokProdukcji;
	}

	public String getKolor() {
		return kolor;
	}

	public TYP_NADWOZIA getTypNadwozia() {
		return typNadwozia;
	}

	public static class Builder {
		private String marka;
		private Integer pojemnosc;
		private Integer rokProdukcji;
		private String kolor;
		private TYP_NADWOZIA typNadwozia;

		public Builder marka(String marka) {
			this.marka = marka;
			return this;
		}

		public Builder pojemnosc(Integer pojemnosc) {
			this.pojemnosc = pojemnosc;
			return this;
		}

		public Builder rokProdukcji(Integer rokProkukcji) {
			this.rokProdukcji = rokProkukcji;
			return this;
		}

		public Builder kolor(String kolor) {
			this.kolor = kolor;
			return this;
		}

		public Builder typNadwozia(TYP_NADWOZIA typNadwozia) {
			this.typNadwozia = typNadwozia;
			return this;
		}

		public Pojazd build() {
			return new Pojazd(this);
		}

	}

	@Override
	public String toString() {
		return "[marka= " + marka + ", pojemnosc= " + pojemnosc + ", rokProdukcji= " + rokProdukcji + ", kolor= "
				+ kolor + ", typNadwozia= " + typNadwozia + "]";
	}

}
