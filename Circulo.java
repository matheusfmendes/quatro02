public class Circulo implements ObjetoGeometrico {

	private Ponto2D centro;
	private double raio;

	Circulo(Ponto2D centro, double raio) {
		this.centro = centro;
		this.raio = raio;
	}

	public Ponto2D centro() {
		return centro;
	}

	public double calculaArea() {
		return Math.PI * raio * raio;
	}

	public double calculaPerimetro() {
		return 2.0 * Math.PI * raio;
	}

	public String toString() {
		return "Círculo com centro em " + centro + " e raio " + raio;
	}

}
