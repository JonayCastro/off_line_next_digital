package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.TarjetaEntity;

@Repository(value = "tarjetaDao")
public interface TarjetaDao extends JpaRepository<TarjetaEntity, Long>{

	TarjetaEntity getTarjetaByNumeroTarjeta(String numeroTarjeta);
}
