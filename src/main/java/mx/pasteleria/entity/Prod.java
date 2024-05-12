package mx.pasteleria.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "PROD")
public class Prod {
	@Id
	@Column(name = "id_prod")
	private Integer idProd;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "modelo")
	private String modelo;
	
	@Column(name = "especificaciones")
	private String especificaciones;
	
	@OneToMany(mappedBy = "prod")
	private List<OrdProd_Prod> ordProd_Prod;
	
	@OneToMany(mappedBy = "prod")
	private List<Receta> receta;

	public Prod() {
		super();
	}

	public Integer getIdProd() {
		return idProd;
	}

	public void setIdProd(Integer idProd) {
		this.idProd = idProd;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getEspecificaciones() {
		return especificaciones;
	}

	public void setEspecificaciones(String especificaciones) {
		this.especificaciones = especificaciones;
	}

	public List<OrdProd_Prod> getOrdProd_Prod() {
		return ordProd_Prod;
	}

	public void setOrdProd_Prod(List<OrdProd_Prod> ordProd_Prod) {
		this.ordProd_Prod = ordProd_Prod;
	}

	public List<Receta> getReceta() {
		return receta;
	}

	public void setReceta(List<Receta> receta) {
		this.receta = receta;
	}
}
