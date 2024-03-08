package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.CuentaDao;
import dto.CuentaDto;
import dto.MovimientoDto;
import dto.OperacionDto;
import entities.CuentaEntity;



public class CuentaServiceImpl implements CuentaService{
	
	@Autowired
	private CuentaDao cuentaDao;

	@Override
	public Boolean consultarSaldo(final OperacionDto operacion) {
		CuentaEntity cuentaEntity = cuentaDao.getCuentaByNumeroDeTarjeta(operacion.getNumeroTarjeta());
		Integer saldoCuenta = cuentaEntity.getSaldoCuenta();
		Integer cantidadSolicitada = operacion.getCantidad();
		return saldoCuenta > cantidadSolicitada;
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
