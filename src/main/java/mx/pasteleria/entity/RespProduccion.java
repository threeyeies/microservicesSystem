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
@Table(name = "RESPPRODUCCION")
public class RespProduccion {
	@Id
	@Column(name = "id_respproduccion")
	private Integer idRespAlmacen;

	@Column(name = "nombre")
	private String nombre;

	@Column(name = "cargo")
	private String cargo;

	@Column(name = "tel")
	private String tel;

	@Column(name = "turno")
	private String turno;

	@OneToOne
	@JoinColumn(name = "username")
	private Usuario usuario;
	
	@OneToMany(mappedBy = "respProduccion")
	private List<OrdProd> ordProd;

	public RespProduccion() {
		super();
	}

	public Integer getIdRespAlmacen() {
		return idRespAlmacen;
	}

	public void setIdRespAlmacen(Integer idRespAlmacen) {
		this.idRespAlmacen = idRespAlmacen;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getTurno() {
		return turno;
	}

	public void setTurno(String turno) {
		this.turno = turno;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<OrdProd> getOrdProd() {
		return ordProd;
	}

	public void setOrdProd(List<OrdProd> ordProd) {
		this.ordProd = ordProd;
	}
}
