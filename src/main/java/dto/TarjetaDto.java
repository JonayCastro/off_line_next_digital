package dto;

import enums.TipoTarjetaEnum;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TarjetaDto {
	
	private String nombreTarjeta;
	private Integer saldo;
	private String entidadEmisora;
	private TipoTarjetaEnum tipoTarjeta;
	private Boolean estado;
	private Integer pin;
	private Integer numeroTarjeta;
	private UsuarioDto propietario;
}
