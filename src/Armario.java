
public class Armario {
	list<Prenda> prendas;
	
	list<Prenda> sugerencia() {
		list<Prenda> sugerencia;
		
		for(TipoDePrenda unTipoDePrenda: listaTiposDePrenda() ) {
			sugerencia.add(unaPrendaParaSugerir(unTipoDePrenda));
		}
		
		return sugerencia;
	}
	
	Set<TipoDePrenda> listaTiposDePrenda() {
		Set<TipoDePrenda> tiposDePrenda;
		
		for (Prenda unaPrenda : prendas) {
			tiposDePrendas.add( unaPrenda.getTipoDePrenda() );
		}
		
		return tiposDePrenda;
	}
	
	Prenda unaPrendaParaSugerir( TipoDePrenda unTipoDePrenda ) {
		return prendas.Steam().filter(unaPrenda -> unaPrenda.getTipoDePrenda() == unTipoDePrenda && unaPrenda.aptaParaTempActual()).first();
	}
	
	
}
