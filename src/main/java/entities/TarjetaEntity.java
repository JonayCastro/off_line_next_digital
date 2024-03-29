package entities;

import enums.TipoTarjetaEnum;
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
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "tarjetas")
@Data
public class TarjetaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "tarjeta_id")
	private Long tarjetaId;
	
	@Column(name = "nombre_tarjeta")
	private String nombreTarjeta;
	
	@Column(name = "saldo")
	private Integer saldo;
	
	@Column(name = "entidad_emisora")
	private String entidadEmisora;
	
	@Column(name = "tipo_tarjeta")
	private TipoTarjetaEnum tipoTarjeta;
	
	@Column(name = "estado")
	private Boolean estado;
	
	@Column(name = "pin")
	private Integer pin;
	
	@Column(name = "numero_tarjeta")
	private Integer numeroTarjeta;
	
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "propietario", foreignKey = @ForeignKey(name = "tarjeta_usuario_fk"))
    private UsuarioEntity propietario;
	
	

}
