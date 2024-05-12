package mx.pasteleria.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "MATERIAPRIMA_PROVEEDOR")
public class MateriaPrima_Proveedor {
	@ManyToOne
	@JoinTable(name = "id_materiaprima")
	private MateriaPrima materiaPrima;
	
	@ManyToOne
	@JoinTable(name = "idProveedor")
	private Proveedor proveedor;

	public MateriaPrima_Proveedor() {
		super();
	}

	public MateriaPrima getMateriaPrima() {
		return materiaPrima;
	}

	public void setMateriaPrima(MateriaPrima materiaPrima) {
		this.materiaPrima = materiaPrima;
	}

	public Proveedor getProveedor() {
		return proveedor;
	}

	public void setProveedor(Proveedor proveedor) {
		this.proveedor = proveedor;
	}
}
