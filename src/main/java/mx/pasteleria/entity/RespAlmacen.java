package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "RESPALMACEN")
public class RespAlmacen {
	@Id
	@Column(name = "id_respalmacen")
	private Integer ipRespAlmacen;
	
	//completar
}
