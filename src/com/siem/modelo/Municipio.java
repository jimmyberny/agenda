package com.siem.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;

/**
 * Representa una ciudad o municipio perteneciente a un estado
 *
 * @author
 */
@Entity
@Table(name = "municipio")
public class Municipio implements Serializable {

	private static final long serialVersionUID = 442141142L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@Column
	private String nombre;
	@ManyToOne
	@JoinColumn(name = "id_estado")
	private Estado estado;

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the idEstado
	 */
	public Estado getIdEstado() {
		return estado;
	}

	/**
	 * @param estado the idEstado to set
	 */
	public void setIdEstado(Estado estado) {
		this.estado = estado;
	}

	@Override
	public String toString() {
		return nombre;
	}
}
