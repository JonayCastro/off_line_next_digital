package services;

import java.util.List;

import dto.CuentaDto;
import dto.MovimientoDto;

public interface CuentaService {
	
	Integer consultarSaldo(Long numeroCuenta);
	List<MovimientoDto> consultarMovimientos(Long numeroCuenta);
	Boolean retirarSaldo(Integer cantidad);
	Boolean transferirSaldo(CuentaDto cuentaOrigen, CuentaDto cuentaDestino, Integer cantidad);

}
