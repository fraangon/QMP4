public class Clima {
	APIClima servicioInformacionClimatica;
	
	
	int aptaParaTempActual() {
		return servicioInformacionClimatica.temperaturaActual();
	}
	
	
	string condicionesClimaticasBA() {
		return servicioInformacionClimatica.condicionesClimaticasBA();
		
	}
	
}

