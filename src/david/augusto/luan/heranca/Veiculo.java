package david.augusto.luan.heranca;

public class Veiculo {

	private String marca;
	private String modelo;
	private int ano;
	private double valorVenal;

	public Veiculo(String marca, String modelo, int ano, double valorVenal) {
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.valorVenal = valorVenal;
	}

	public double calcularImposto() {
		return this.valorVenal * 0.1;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public double getValorVenal() {
		return valorVenal;
	}

	public void setValorVenal(double valorVenal) {
		this.valorVenal = valorVenal;
	}

	@Override
	public String toString() {
		return "Veiculo \nMarca: " + marca + " Modelo: " + modelo + " Ano: " + ano + " Valor venal: " + valorVenal;
	}

}
