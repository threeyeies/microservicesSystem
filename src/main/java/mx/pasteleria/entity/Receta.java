package mx.pasteleria.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "RECETA")
public class Receta {
	@ManyToOne
	@JoinColumn(name = "id_prod")
	private Prod prod;
	
	@ManyToOne
	@JoinColumn(name = "id_materiaprima")
	private MateriaPrima materiaPrima;
	
	@Column(name = "cantidad")
	private Integer cantidad;

	public Receta() {
		super();
	}

	public Prod getProd() {
		return prod;
	}

	public void setProd(Prod prod) {
		this.prod = prod;
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
