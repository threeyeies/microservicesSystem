package mx.pasteleria.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ALMACEN")
public class Almacen {
	@Id
	@Column(name = "id_almacen")
	private Integer idAlmacen;
	
	@Column(name = "nombre_almacen")
	private String nombreAlmacen;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "max_capacidad")
	private Integer maxCapacidad;
	
	@Column(name = "ubicacion")
	private String ubicacion;
	
	@OneToOne
	@JoinColumn(name = "id_respalmacen")
	private RespAlmacen respAlmacen;
	
	//Se mapea desde el objeto tipo Almacen creado en MateriaPrima
	@OneToMany(mappedBy = "almacen")
	//Se recupera como una lista de materias primas porque un almacen tiene una lista de materias primas
	private List<MateriaPrima> materiaPrima;
	
	
	public Almacen() {
		super();
	}


	public Integer getIdAlmacen() {
		return idAlmacen;
	}


	public void setIdAlmacen(Integer idAlmacen) {
		this.idAlmacen = idAlmacen;
	}


	public String getNombreAlmacen() {
		return nombreAlmacen;
	}


	public void setNombreAlmacen(String nombreAlmacen) {
		this.nombreAlmacen = nombreAlmacen;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Integer getMaxCapacidad() {
		return maxCapacidad;
	}


	public void setMaxCapacidad(Integer maxCapacidad) {
		this.maxCapacidad = maxCapacidad;
	}


	public String getUbicacion() {
		return ubicacion;
	}


	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}


	public RespAlmacen getRespAlmacen() {
		return respAlmacen;
	}


	public void setRespAlmacen(RespAlmacen respAlmacen) {
		this.respAlmacen = respAlmacen;
	}


	public List<MateriaPrima> getMateriaPrima() {
		return materiaPrima;
	}


	public void setMateriaPrima(List<MateriaPrima> materiaPrima) {
		this.materiaPrima = materiaPrima;
	}
}
