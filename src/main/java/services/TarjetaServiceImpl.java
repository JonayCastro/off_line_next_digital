package services;

import org.springframework.beans.factory.annotation.Autowired;

import dao.TarjetaDao;
import dto.OperacionDto;
import entities.TarjetaEntity;

public class TarjetaServiceImpl implements TarjetaService{
	
	@Autowired
	private TarjetaDao tarjetaDao;

	@Override
	public Boolean consultarPin(OperacionDto operacion) {
		String numeroTarjeta = operacion.getNumeroTarjeta();
		TarjetaEntity tarjetaEntity= tarjetaDao.getTarjetaByNumeroTarjeta(numeroTarjeta);
		Integer pinTarjetaEntity = tarjetaEntity.getPin();
		Integer pinOperacion = operacion.getPin();
		return pinOperacion.equals(pinOperacion);
	}

}
