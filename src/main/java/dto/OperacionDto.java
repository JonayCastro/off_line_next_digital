package dto;

import enums.TipoOperacionEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OperacionDto {
	
	private TipoOperacionEnum tipoMovimiento;
	private Integer cantidad;
	private String destinatario;
	private String remitente;
	private Long numeroTarjeta;
	private UsuarioDto usuario;
	private Integer pin;
}
