package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "ORDCOMPRA_MATERIAPRIMA")
public class OrdCompra_MateriaPrima {
	@ManyToOne
	@JoinTable(name = "id_ordcompra")
	private OrdCompra ordCompra;
	
	@ManyToOne
	@JoinTable(name = "id_materiaprima")
	private MateriaPrima materiaPrima;
	
	@Column(name = "cantidad")
	private Integer cantidad;

	public OrdCompra_MateriaPrima() {
		super();
	}

	public OrdCompra getOrdCompra() {
		return ordCompra;
	}

	public void setOrdCompra(OrdCompra ordCompra) {
		this.ordCompra = ordCompra;
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
}
