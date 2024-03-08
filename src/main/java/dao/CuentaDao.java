package dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import entities.CuentaEntity;

@Repository(value = "cuentaDao")
public interface CuentaDao extends JpaRepository<CuentaEntity, Long>{

	CuentaEntity getCuentaByNumeroDeTarjeta (Long numeroDeTarjeta);
}
