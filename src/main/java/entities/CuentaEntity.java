package entities;

import java.util.ArrayList;
import java.util.List;

import dto.MovimientoDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cuentas")
@Data
public class CuentaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cuenta_id")
	private Long cuentaId;
	
	@Column(name = "nombre_cuenta")
	private String nombreCuenta;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "propietario", foreignKey = @ForeignKey(name = "usuario_cuenta_fk"))
	private UsuarioEntity usuario;
	
	@Column(name = "saldo")
	private Integer saldoCuenta;
	
	@Column(name = "numero_cuenta")
	private Long numeroCuenta;
	
	@Column(name = "cuenta_id")
	private List<MovimientoDto> movimientos = new ArrayList<>();

}
