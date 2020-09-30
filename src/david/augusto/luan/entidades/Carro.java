package david.augusto.luan.entidades;

import david.augusto.luan.heranca.Veiculo;

public class Carro extends Veiculo {

	private int quantidadeDePortas;

	public Carro(String marca, String modelo, int ano, int quantidadeDePortas, double valorVenal) {
		super(marca, modelo, ano, valorVenal);
		this.quantidadeDePortas = quantidadeDePortas;
	}

	@Override
	public double calcularImposto() {
		return getValorVenal() * 0.7;
	}

	public int getQuantidadeDePortas() {
		return quantidadeDePortas;
	}

	public void setQuantidadeDePortas(int quantidadeDePortas) {
		this.quantidadeDePortas = quantidadeDePortas;
	}

	@Override
	public String toString() {
		return "Veiculo \nMarca: " + getMarca() + " Modelo: " + getModelo() + " Ano: " + getAno()
				+ " Quantidade de portas: " + quantidadeDePortas;
	}

}
