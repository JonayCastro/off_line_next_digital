package resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ApiParams.ApiPaths;
import dto.MovimientoDto;
import services.OperacionService;

@RestController
@RequestMapping(path= ApiPaths.PATH_CONSULTAR)
public class BancoResource {
	
	@Autowired
	private OperacionService operacionService;
	
	@GetMapping(path=ApiPaths.PATH_MOVIMIENTO)
	public ResponseEntity< List<MovimientoDto>> consultarSaldo(){
		operacionService.consultarMovimientos(null);
	}

}
