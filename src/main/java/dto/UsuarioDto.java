package dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDto {
	
	private String nombre;
	private String apellido;
	private String dni;
	private TarjetaDto tarjetasUsuario;
	private CuentaDto cuenta;

}
