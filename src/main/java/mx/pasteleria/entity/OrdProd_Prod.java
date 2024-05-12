package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDPROD_PROD")
public class OrdProd_Prod {
	@ManyToOne
	@JoinColumn(name = "id_ordprod")
	private OrdProd ordProd;
	
	@ManyToOne
	@JoinColumn(name = "id_prod")
	private Prod prod;
	
	@Column(name = "cantidad")
	private Integer cantidad;

	public OrdProd_Prod() {
		super();
	}

	public OrdProd getOrdProd() {
		return ordProd;
	}

	public void setOrdProd(OrdProd ordProd) {
		this.ordProd = ordProd;
	}

	public Prod getProd() {
		return prod;
	}

	public void setProd(Prod prod) {
		this.prod = prod;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
