package services;

import java.util.List;

import dto.CuentaDto;
import dto.MovimientoDto;
import dto.OperacionDto;

public interface CuentaService {
	
	Boolean consultarSaldo(OperacionDto operacion);
	List<MovimientoDto> consultarMovimientos(Long numeroCuenta);
	Boolean retirarSaldo(Integer cantidad);
	Boolean transferirSaldo(CuentaDto cuentaOrigen, CuentaDto cuentaDestino, Integer cantidad);
	Boolean ingresarSaldo(OperacionDto operacion);

}
