package Viagem;

public class Veiculo {
	private String Modelo;
	private String Cor;
	private int Ano;
	private int Velocidade;
	private double Tanque; //litros
	private ViagemCarro ViagemCarro;
	
	public Veiculo(String Modelo, String Cor, int Ano, double Tanque) {
		this.setModelo(Modelo);
		this.setCor(Cor);
		this.setAno(Ano);
		this.setVelocidade(0);
		this.setTanque(Tanque);
	}
	
	public void MarcarViagem(ViagemCarro viagemCarro) {
		this.setViagemCarro(viagemCarro);
	}
	
	public void terminaViagem() {
		System.out.println(this.getModelo() + " chegou a " + this.getViagemCarro().getDestino());
		System.out.println("Combustivel restante: " + (float) this.getTanque());
		System.out.println("Combustivel gasto: " +  (float) this.getViagemCarro().getGastoGasolina());
	}
	
	public void RodarKm() {
		if (this.getViagemCarro().getDistPercorrida() <= 50) {
			this.setVelocidade(80);
		} else if (this.getViagemCarro().getDistPercorrida() > 80 && this.getViagemCarro().getDistPercorrida() <= 130 ) {
			this.setVelocidade(130);
		} else {
			this.setVelocidade(110);
		}

		if (this.getVelocidade() <= 80) {
			this.setTanque(this.getTanque() - 0.2);
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + 0.2);
		} else if (this.getVelocidade() > 80 && this.getVelocidade()  <= 120) {
			this.setTanque(this.getTanque() - 0.1);
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + 0.1);
		} else {
			this.setTanque(this.getTanque() - 0.4);
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + 0.4);
		}
		this.getViagemCarro().setDistPercorrida(this.getViagemCarro().getDistPercorrida() + 1);
		
		if (this.getTanque() <= 5.0) {
			this.setTanque(45.0);
			System.out.println(this.getModelo() + " abastecido no kilometro " + this.getViagemCarro().getDistPercorrida());
		}
	}

	public String getModelo() {
		return Modelo;
	}
	public void setModelo(String modelo) {
		Modelo = modelo;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String cor) {
		Cor = cor;
	}
	public int getAno() {
		return Ano;
	}
	public void setAno(int ano) {
		Ano = ano;
	}
	public int getVelocidade() {
		return Velocidade;
	}
	public void setVelocidade(int velocidade) {
		Velocidade = velocidade;
	}
	public double getTanque() {
		return Tanque;
	}
	public void setTanque(double tanque) {
		Tanque = tanque;
	}
	public ViagemCarro getViagemCarro() {
		return ViagemCarro;
	}
	public void setViagemCarro(ViagemCarro viagemCarro) {
		ViagemCarro = viagemCarro;
	}
}
