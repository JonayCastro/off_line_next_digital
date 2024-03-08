package dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CuentaDto {
	
	private String nombreCuenta;
	private String nombreUsuario;
	private String apellidoUsuario;
	private String saldoCuenta;
	private Long numeroCuenta;
	private String dni;
	private Integer limiteCuenta;
	private List<MovimientoDto> movimientos = new ArrayList<>();
}
