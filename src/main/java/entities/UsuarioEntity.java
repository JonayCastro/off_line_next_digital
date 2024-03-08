package entities;

import java.util.ArrayList;
import java.util.List;

import dto.CuentaDto;
import dto.TarjetaDto;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "usuarios")
@Data
public class UsuarioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "usuario_id")
	private Long usuarioId;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "apellido")
	private String apellido;
	
	@Column(name = "dni")
	private String dni;
	
	@OneToMany(mappedBy = "tarjeta", cascade = CascadeType.ALL)
	private List<TarjetaDto> tarjetas = new ArrayList<>();
	
	@OneToMany(mappedBy = "cuenta", cascade = CascadeType.ALL)
	private List<CuentaEntity> cuenta = new ArrayList<>();

}
