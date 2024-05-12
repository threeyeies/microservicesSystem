package mx.pasteleria.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "Proveedor")
public class Proveedor {
	@Id
	@Column(name = "id_proveedor")
	private Integer idProveedor;
	
	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "razon_social")
	private String razonSocial;
	
	@Column(name = "rfc")
	private String rfc;
	
	@Column(name = "direccion")
	private String direccion;
	
	@Column(name = "raiting")
	private Integer raiting;
	
	@Column(name = "tel")
	private String tel;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "responsable")
	private String responsable;
	
	@Column(name = "cargo_responsable")
	private String cargoResponsable;
	
	@OneToMany(mappedBy = "proveedor")
	private List<MateriaPrima_Proveedor> materiaPrima_Proveedor;

	public Proveedor() {
		super();
	}

	public Integer getIdProveedor() {
		return idProveedor;
	}

	public void setIdProveedor(Integer idProveedor) {
		this.idProveedor = idProveedor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRazonSocial() {
		return razonSocial;
	}

	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public Integer getRaiting() {
		return raiting;
	}

	public void setRaiting(Integer raiting) {
		this.raiting = raiting;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getResponsable() {
		return responsable;
	}

	public void setResponsable(String responsable) {
		this.responsable = responsable;
	}

	public String getCargoResponsable() {
		return cargoResponsable;
	}

	public void setCargoResponsable(String cargoResponsable) {
		this.cargoResponsable = cargoResponsable;
	}

	public List<MateriaPrima_Proveedor> getMateriaPrima_Proveedor() {
		return materiaPrima_Proveedor;
	}

	public void setMateriaPrima_Proveedor(List<MateriaPrima_Proveedor> materiaPrima_Proveedor) {
		this.materiaPrima_Proveedor = materiaPrima_Proveedor;
	}
}
