package com.siem.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "reporte")
public class Reporte implements Serializable {

	private static final long serialVersionUID = 4343262L;
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@ManyToOne
	@JoinColumn(name = "id_vista")
	private Visita visita;

	@ManyToOne
	@JoinColumn(name = "id_supervisor")
	private Supervisor supervisor;

	@ManyToOne
	@JoinColumn(name = "id_usuario")
	private Usuario usuario;

	@Column
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;

	@Column
	private byte[] observaciones;

	@Column
	private byte[] imagen;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public Object getImagen() {
		return imagen;
	}

	public Object getObservaciones() {
		return observaciones;
	}

	public Supervisor getSupervisor() {
		return supervisor;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public Visita getVisita() {
		return visita;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public void setSupervisor(Supervisor supervisor) {
		this.supervisor = supervisor;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public void setVisita(Visita visita) {
		this.visita = visita;
	}

}
