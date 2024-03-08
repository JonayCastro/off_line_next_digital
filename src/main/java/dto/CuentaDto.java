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
	private Integer saldoCuenta;
	private Long numeroCuenta;
	private List<MovimientoDto> movimientos = new ArrayList<>();
	private UsuarioDto usuario;
}
