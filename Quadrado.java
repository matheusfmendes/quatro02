public class Quadrado implements ObjetoGeometrico {
	private double Base, Altura;

	Quadrado(double base, double altura) {
		this.Base = base;
		this.Altura = altura;
	}

	@Override
	public Ponto2D centro() {
		return centro();
	}

	@Override
	public double calculaArea() {
		return Base*Altura;
	}

	@Override
	public double calculaPerimetro() {
		
		return (Base*2)+(Altura*2);
	}
	

	public double getBase() {
		return Base;
	}

	public void setBase(double base) {
		Base = base;
	}

	public double getAltura() {
		return Altura;
	}

	public void setAltura(double altura) {
		Altura = altura;
	}

	public String toString(){return "Quadrado com area em "+Base+" e altura "+Altura;  } 
}
