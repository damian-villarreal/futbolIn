package ar.edu.unlam.tallerweb1.modelo;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Partido {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@ManyToOne
	private Usuario organizador;
	private String nombreCancha;
	private Long latitud;
	private Long longitud;
	private String descripcion;
	private Date fecha;
	

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	public String getNombreCancha() {
		return nombreCancha;
	}
	public void setNombreCancha(String nombreCancha) {
		this.nombreCancha = nombreCancha;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getLatitud() {
		return latitud;
	}
	public void setLatitud(Long latitud) {
		this.latitud = latitud;
	}
	public Long getLongitud() {
		return longitud;
	}
	public void setLongitud(Long longitud) {
		this.longitud = longitud;
	}
	
	
	
}