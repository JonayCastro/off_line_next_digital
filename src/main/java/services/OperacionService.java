package services;

import java.util.List;

import dto.MovimientoDto;
import dto.OperacionDto;
import dto.TarjetaDto;

public interface OperacionService {
	
	List<MovimientoDto> consultarMovimientos(OperacionDto operacion);
	Boolean sacarDinero(OperacionDto operacion);
	Boolean ingresar(OperacionDto operacion);
	Boolean transferecia(OperacionDto operacion);
	Boolean activarTarjeta(TarjetaDto tarjeta);
	Boolean cambiarPin(TarjetaDto tarjeta);
}
