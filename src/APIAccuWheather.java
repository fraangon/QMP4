
public class APIAccuWheather implements APIClima{
	String condicionesClimaticasBA() {
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);  
		condicionesClimaticas.get(0).get("PrecipitationProbability"); // Y lo mismo con todos los datos que necesite
		
		return //Un string con la info necesaria, o una lista, o lo que sea.
	}
	int temperaturaActual() {
		AccuWeatherAPI apiClima = new AccuWeatherAPI();
		List<Map<String, Object>> condicionesClimaticas = apiClima.getWeather(“Buenos Aires, Argentina”);  
		return condicionesClimaticas.get(0).get("Temperature");
	}
}
