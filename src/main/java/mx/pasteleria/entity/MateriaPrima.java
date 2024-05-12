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
@Table(name = "MATERIAPRIMA")
public class MateriaPrima {
	@Id
	@Column(name = "id_materiaprima")
	private Integer idMateriaPrima;
	
	@Column(name = "codigo")
	private String codigo;
	
	@Column(name = "nombre")
	private String nombre;
		
	@Column(name = "cantidad_disp")
	private Integer cantidadDisp;
	
	@Column(name = "nivel_stock")
	private Integer nivelStock;
	
	@Column(name = "unidad_medida")
	private String unidadMedida;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "detalles_manejo")
	private String detallesManejo;
	
	@Column(name = "caducidad")
	private Date caducidad;
	
	@Column(name = "toxicidad")
	private Integer toxicidad;
	
	@Column(name = "pediodicidad")
	private String periodicidad;
	
	@Column(name = "fecha_ultingreso")
	private Date fechaUltIngreso;
	
	@Column(name = "costo_unit")
	private BigDecimal costoUnit;
	
	@ManyToOne
    @JoinColumn(name = "id_almacen")
	//este nombre de variable es para mapear, se crea un objeto del tipo de la entidad con la que se va relacionar
    private Almacen almacen;
	
	@OneToMany(mappedBy = "materiaPrima")
	private List<OrdCompra_MateriaPrima> ordCompra_MateriaPrima;
	
	@OneToMany(mappedBy = "materiaPrima")
	private List<MateriaPrima_Proveedor> materiaPrima_Proveedor;
	
	public MateriaPrima() {
		super();
	}

	public Integer getIdMateriaPrima() {
		return idMateriaPrima;
	}

	public void setIdMateriaPrima(Integer idMateriaPrima) {
		this.idMateriaPrima = idMateriaPrima;
	}
	
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getCantidadDisp() {
		return cantidadDisp;
	}

	public void setCantidadDisp(Integer cantidadDisp) {
		this.cantidadDisp = cantidadDisp;
	}

	public Integer getNivelStock() {
		return nivelStock;
	}

	public void setNivelStock(Integer nivelStock) {
		this.nivelStock = nivelStock;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDetallesManejo() {
		return detallesManejo;
	}

	public void setDetallesManejo(String detallesManejo) {
		this.detallesManejo = detallesManejo;
	}

	public Date getCaducidad() {
		return caducidad;
	}

	public void setCaducidad(Date caducidad) {
		this.caducidad = caducidad;
	}

	public Integer getToxicidad() {
		return toxicidad;
	}

	public void setToxicidad(Integer toxicidad) {
		this.toxicidad = toxicidad;
	}

	public String getPeriodicidad() {
		return periodicidad;
	}

	public void setPeriodicidad(String periodicidad) {
		this.periodicidad = periodicidad;
	}

	public Date getFechaUltIngreso() {
		return fechaUltIngreso;
	}

	public void setFechaUltIngreso(Date fechaUltIngreso) {
		this.fechaUltIngreso = fechaUltIngreso;
	}

	public BigDecimal getCostoUnit() {
		return costoUnit;
	}

	public void setCostoUnit(BigDecimal costoUnit) {
		this.costoUnit = costoUnit;
	}

	public Almacen getAlmacen() {
		return almacen;
	}

	public void setAlmacen(Almacen almacen) {
		this.almacen = almacen;
	}

	public List<OrdCompra_MateriaPrima> getOrdCompra_MateriaPrima() {
		return ordCompra_MateriaPrima;
	}

	public void setOrdCompra_MateriaPrima(List<OrdCompra_MateriaPrima> ordCompra_MateriaPrima) {
		this.ordCompra_MateriaPrima = ordCompra_MateriaPrima;
	}

	public List<MateriaPrima_Proveedor> getMateriaPrima_Proveedor() {
		return materiaPrima_Proveedor;
	}

	public void setMateriaPrima_Proveedor(List<MateriaPrima_Proveedor> materiaPrima_Proveedor) {
		this.materiaPrima_Proveedor = materiaPrima_Proveedor;
	}
}

