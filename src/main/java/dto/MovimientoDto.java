package dto;

import java.util.Date;

import enums.TipoOperacionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MovimientoDto {
	
	private Integer cantidad;
	private String concepto;
	private CuentaDto cuentaDestino;
	private CuentaDto cuentaOrigen;
	private UsuarioDto ordenante;
	private Date fecha;
	private TipoOperacionEnum tipo;

}
