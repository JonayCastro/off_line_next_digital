package exceptions;

import dto.CuentaDto;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BancoExceptions extends Exception{

	private static final long serialVersionUID = 1L;
	
	private String mensaje;

}
