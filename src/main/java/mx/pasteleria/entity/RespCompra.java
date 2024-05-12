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
@Table(name = "RESPCOMPRAS")
public class RespCompra {
	@Id
	@Column(name = "id_respcompra")
	private Integer idRespCompra;

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
	
	@OneToMany(mappedBy = "respCompra")
	private List<OrdCompra> ordCompra;

	public RespCompra() {
		super();
	}

	public Integer getIdRespCompra() {
		return idRespCompra;
	}

	public void setIdRespCompra(Integer idRespCompra) {
		this.idRespCompra = idRespCompra;
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

	public List<OrdCompra> getOrdCompra() {
		return ordCompra;
	}

	public void setOrdCompra(List<OrdCompra> ordCompra) {
		this.ordCompra = ordCompra;
	}
}
