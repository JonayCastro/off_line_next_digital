package services;

import java.util.List;

import dto.CuentaDto;
import dto.MovimientoDto;

public class CuentaServiceImpl implements CuentaService{

	@Override
	public Integer consultarSaldo(final Long numeroCuenta) {
		
		return null;
	}

	@Override
	public Boolean retirarSaldo(final Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean transferirSaldo(final CuentaDto cuentaOrigen, final CuentaDto cuentaDestino, final Integer cantidad) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MovimientoDto> consultarMovimientos(final Long numeroCuenta) {
		// TODO Auto-generated method stub
		return null;
	}

}
