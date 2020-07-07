package Viagem;

public class Principal {
	public static void main(String[] args) {
		Veiculo Carro1 = new Veiculo ("GOL", "Branco", 2002, (float) 45.0);
		ViagemCarro ViagemCarro1 = new ViagemCarro("Joinville", "Florianopolis", 250); 
		Carro1.MarcarViagem(ViagemCarro1);

		viajar(Carro1);
		
		
		CarroEsportivo Carro2 = new CarroEsportivo("GOLF", "Vermelho", 2018, (float) 35.0, false);
		ViagemCarro ViagemCarro2 = new ViagemCarro("Joinville", "Florianopolis", 250); 
		Carro2.MarcarViagem(ViagemCarro2);
		viajar(Carro2);
		
	}
	
	public static void viajar(Veiculo Veiculo) {
		int a = 0;
		
		while (a < Veiculo.getViagemCarro().getDistTotal()) {
			Veiculo.RodarKm();
			a = a+1;
		}
		Veiculo.terminaViagem();
	}
	
	public static void viajar(CarroEsportivo CarroEsportivo) {
		int a = 0;
		
		while (a < CarroEsportivo.getViagemCarro().getDistTotal()) {
			CarroEsportivo.RodarKm();
			a = a+1;
		}
		CarroEsportivo.terminaViagem();
	}
}