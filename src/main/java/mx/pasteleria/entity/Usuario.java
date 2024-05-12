package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "USUARIO")
public class Usuario {
	@Id
	@Column(name = "username")
	private String username;

	@Column(name = "tipo")
	private String tipo;

	@Column(name = "password")
	private String password;

	@OneToOne(mappedBy = "usuario")
	private RespAlmacen respAlmacen;

	@OneToOne(mappedBy = "usuario")
	private RespProduccion respProduccion;

	@OneToOne(mappedBy = "usuario")
	private RespCompra respCompra;

	public Usuario() {
		super();
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RespAlmacen getRespAlmacen() {
		return respAlmacen;
	}

	public void setRespAlmacen(RespAlmacen respAlmacen) {
		this.respAlmacen = respAlmacen;
	}

	public RespProduccion getRespProduccion() {
		return respProduccion;
	}

	public void setRespProduccion(RespProduccion respProduccion) {
		this.respProduccion = respProduccion;
	}

	public RespCompra getRespCompra() {
		return respCompra;
	}

	public void setRespCompra(RespCompra respCompra) {
		this.respCompra = respCompra;
	}
}