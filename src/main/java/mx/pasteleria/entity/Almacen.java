package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table
public class Almacen {
	@Id
	@Column(name = "id_almacen")
	private Integer idAlmacen;
	
	@Column(name = "nombre_almacen")
	private String nombreAlmacen;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name="max_capacidad")
	private Integer maxCapacidad;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@OneToOne
	@JoinColumn(name = "id_respalmacen")
	private RespAlmacen respAlmacen;
	
}
