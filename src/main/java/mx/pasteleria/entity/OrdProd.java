package mx.pasteleria.entity;

import java.sql.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDPROD")
public class OrdProd {
	@Id
	@Column(name = "id_ordprod")
	private Integer idOrdProd;
	
	@Column(name = "nombre_cliente")
	private String nombreCliente;
	
	@Column(name = "fecha_orden")
	private Date fechaOrden;
	
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;
	
	@Column(name = "indicaciones")
	private String indicaciones;
	
	@ManyToOne
	@JoinColumn(name = "id_respproduccion")
	private RespProduccion respProduccion;
	
	@OneToMany(mappedBy = "ordProd")
	private List<OrdProd_Prod> ordProd_Prod;

	public OrdProd() {
		super();
	}

	public Integer getIdOrdProd() {
		return idOrdProd;
	}

	public void setIdOrdProd(Integer idOrdProd) {
		this.idOrdProd = idOrdProd;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public Date getFechaOrden() {
		return fechaOrden;
	}

	public void setFechaOrden(Date fechaOrden) {
		this.fechaOrden = fechaOrden;
	}

	public Date getFechaEntrega() {
		return fechaEntrega;
	}

	public void setFechaEntrega(Date fechaEntrega) {
		this.fechaEntrega = fechaEntrega;
	}

	public String getIndicaciones() {
		return indicaciones;
	}

	public void setIndicaciones(String indicaciones) {
		this.indicaciones = indicaciones;
	}

	public RespProduccion getRespProduccion() {
		return respProduccion;
	}

	public void setRespProduccion(RespProduccion respProduccion) {
		this.respProduccion = respProduccion;
	}

	public List<OrdProd_Prod> getOrdProd_Prod() {
		return ordProd_Prod;
	}

	public void setOrdProd_Prod(List<OrdProd_Prod> ordProd_Prod) {
		this.ordProd_Prod = ordProd_Prod;
	}
}
