package Viagem;

public class CarroEsportivo extends Veiculo {
	
	private boolean Turbo;

	public CarroEsportivo(String Modelo, String Cor, int Ano, double Tanque, boolean turbo) {
		super(Modelo, Cor, Ano, Tanque);
		this.setTurbo(turbo);
	}
	

	public void RodarKm() {
		int multiplicador = 1;

		if (this.getViagemCarro().getDistPercorrida() >= 100 && this.getViagemCarro().getDistPercorrida() <= 130) {
			multiplicador = 2;
		}
		
		if (this.getViagemCarro().getDistPercorrida() <= 50) {
			this.setVelocidade(80);
		} else if (this.getViagemCarro().getDistPercorrida() > 50 && this.getViagemCarro().getDistPercorrida() <= 150 ) {
			this.setVelocidade(130);
		} else {
			this.setVelocidade(100);
		}

		if (this.getVelocidade() <= 80) {
			this.setTanque(this.getTanque() - (0.4 * multiplicador));
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + (0.4 * multiplicador));
		} else if (this.getVelocidade() > 80 && this.getVelocidade() <= 120) {
			this.setTanque(this.getTanque() - (0.3 * multiplicador));
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + (0.3 * multiplicador));
		} else {
			this.setTanque(this.getTanque() - (0.6 * multiplicador));
			this.getViagemCarro().setGastoGasolina(this.getViagemCarro().getGastoGasolina() + (0.6 * multiplicador));
		}
		this.getViagemCarro().setDistPercorrida(this.getViagemCarro().getDistPercorrida() + 1);
		
		if (this.getTanque() < 5.0) {
			this.setTanque(35.0);
			System.out.println(this.getModelo() + " abastecido no kilometro " + this.getViagemCarro().getDistPercorrida());
		}
	}

	public boolean getTurbo() {
		return Turbo;
	}

	public void setTurbo(boolean turbo) {
		Turbo = turbo;
	}
}
