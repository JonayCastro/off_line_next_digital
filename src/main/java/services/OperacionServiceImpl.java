package services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dto.MovimientoDto;
import dto.OperacionDto;
import dto.TarjetaDto;

public class OperacionServiceImpl implements OperacionService{
	
	@Autowired
	private TarjetaService tarjetaService;
	
	@Autowired
	private CuentaService cuentaService;
	

	@Override
	public List<MovimientoDto> consultarMovimientos(final OperacionDto operacion){
		consultaDePin(operacion);
		return cuentaService.consultarMovimientos(operacion.getUsuario().getCuenta().getNumeroCuenta());
	}

	@Override
	public Boolean sacarDinero(OperacionDto operacion) {
		consultaDePin(operacion);
		
		
		
		return null;
	}

	@Override
	public Boolean ingresar(OperacionDto operacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean transferecia(OperacionDto operacion) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean activarTarjeta(TarjetaDto tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean cambiarPin(TarjetaDto tarjeta) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private void consultaDePin(final OperacionDto operacion) {
		Boolean pinEsCorrecto = tarjetaService.consultarPin(operacion);
		if(pinEsCorrecto != true) {
			// TODO: Aquí lanzaremos excepcion
			System.out.print("Pin incorrecto");
		}
	}

}
