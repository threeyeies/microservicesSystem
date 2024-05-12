package mx.pasteleria.entity;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDCOMPRA" )
public class OrdCompra {
	@Id
	@Column(name = "id_ordcompra")
	private Integer idOrdCompra;
	
	@Column(name = "fecha_orden")
	private Date fechaOrden;
	
	@Column(name = "fecha_entrega")
	private Date fechaEntrega;
	
	@Column(name = "estado")
	private String estado;
	
	@Column(name = "forma_pago")
	private String formaPago;
	
	@Column(name = "precio_subtotal")
	private BigDecimal precioSubtotal;
	
	@Column(name = "iva")
	private Double iva;
	
	@Column(name = "precio_total")
	private BigDecimal precioTotal;
	
	@ManyToOne
	@JoinColumn(name = "id_respcompra")
	private RespCompra respCompra;
	
	@OneToMany(mappedBy = "ordCompra")
	private List<OrdCompra_MateriaPrima> ordCompra_MateriaPrima;

	public OrdCompra() {
		super();
	}

	public Integer getIdOrdCompra() {
		return idOrdCompra;
	}

	public void setIdOrdCompra(Integer idOrdCompra) {
		this.idOrdCompra = idOrdCompra;
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

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFormaPago() {
		return formaPago;
	}

	public void setFormaPago(String formaPago) {
		this.formaPago = formaPago;
	}

	public BigDecimal getPrecioSubtotal() {
		return precioSubtotal;
	}

	public void setPrecioSubtotal(BigDecimal precioSubtotal) {
		this.precioSubtotal = precioSubtotal;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}

	public BigDecimal getPrecioTotal() {
		return precioTotal;
	}

	public void setPrecioTotal(BigDecimal precioTotal) {
		this.precioTotal = precioTotal;
	}

	public RespCompra getRespCompra() {
		return respCompra;
	}

	public void setRespCompra(RespCompra respCompra) {
		this.respCompra = respCompra;
	}

	public List<OrdCompra_MateriaPrima> getOrdCompra_MateriaPrima() {
		return ordCompra_MateriaPrima;
	}

	public void setOrdCompra_MateriaPrima(List<OrdCompra_MateriaPrima> ordCompra_MateriaPrima) {
		this.ordCompra_MateriaPrima = ordCompra_MateriaPrima;
	}
}
