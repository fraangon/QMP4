public class Prenda {
	  public Prenda(
	    TipoDePrenda tipoDePrenda, 
	    Material material, 
	    Color colorPrincial,
	    Color colorSecundario,
	    int temperaturaAdecuadaMax,
	    Trama trama) {
	     // ...validaciones...
	     this.tipoDePrenda = tipoDePrenda;
	     this.material = material;
	     this.color = color;
	     // etc...
	  }
	  int TemperaturaAdecuadaMax
	  
	  Boolean aptaParaTempActual() {
		  return TemperaturaAdecuadaMax <= (new Clima).temperaturaActual();
	  }
	}

