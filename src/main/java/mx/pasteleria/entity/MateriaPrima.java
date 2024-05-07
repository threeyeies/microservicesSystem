package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATERIAPRIMA")
public class MateriaPrima {
	@Id
	@Column(name = "id_materiaprima")
	private Integer idMateriaPrima;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "nombre")
	private String nombre;
		
	@Column(name = "cantidad_disp")
	private Integer cantidadDisp;
	
	@Column(name = "nivel_stock")
	private Integer nivelStock;
	
	@Column(name = "unidad_medida")
	private String unidadMedida;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "detalles_manejo")
	private String detallesManejo;
	
	//Checar si se puede hacer tipo Date en postgreSQL
	@Column(name = "caducidad")
	private String caducidad;
	
	@Column(name = "toxicidad")
	private Integer toxicidad;
	
	@Column(name = "pediodicidad")
	private String periodicidad;
	
	@Column(name = "fecha_ultingreso")
	private String fechaUltIngreso;
	
	@Column(name = "costo_unit")
	private String costoUnit;
	
	@ManyToOne
    @JoinColumn(name = "id_almacen")
    private Almacen idAlmacen;
	
	

	
	
	
	
}

