package david.augusto.luan.entidades;

import david.augusto.luan.heranca.Veiculo;

public class Moto extends Veiculo {

	private int cilindradas;

	public Moto(String marca, String modelo, int ano, int cilindradas, double valorVenal) {
		super(marca, modelo, ano, valorVenal);
		this.cilindradas = cilindradas;
	}

	@Override
	public double calcularImposto() {
		return this.getValorVenal() * 0.3;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	@Override
	public String toString() {
		return "Veiculo \nMarca: " + getMarca() + " Modelo: " + getModelo() + " Ano: " + getAno()
				+ " Quantidade de cilindradas: " + cilindradas;
	}

}
