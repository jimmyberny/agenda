package com.siem.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.util.Date;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author
 */
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

	private static final long serialVersionUID = 42L;

	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	@Column(name = "razon_social")
	private String razonSocial;
	@Column
	private String cliente;
	@ManyToOne
	@JoinColumn(name = "id_localidad")
	private Localidad localidad;
	@Column
	private String calle;
	@Column(name = "num_int")
	private String numInt;
	@Column(name = "num_ext")
	private String numExt;
	@Column
	private String cp;
	@Column
	private String telefono;
	@Column
	private String fax;
	@Column
	private String email;
	@Column(name = "fecha_inicio")
	@Temporal(TemporalType.TIMESTAMP)
	private Date fechaInicio;
	@ManyToOne
	@JoinColumn(name = "id_rango")
	private RangoVentas rangoVentas;
	@ManyToOne
	@JoinColumn(name = "id_giro")
	private Giro giro;

	public Cliente() {
	}

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
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}

	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}

	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}

	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	/**
	 * @return the localidad
	 */
	public Localidad getLocalidad() {
		return localidad;
	}

	/**
	 * @param localidad the localidad to set
	 */
	public void setLocalidad(Localidad localidad) {
		this.localidad = localidad;
	}

	/**
	 * @return the calle
	 */
	public String getCalle() {
		return calle;
	}

	/**
	 * @param calle the calle to set
	 */
	public void setCalle(String calle) {
		this.calle = calle;
	}

	/**
	 * @return the numInt
	 */
	public String getNumInt() {
		return numInt;
	}

	/**
	 * @param numInt the numInt to set
	 */
	public void setNumInt(String numInt) {
		this.numInt = numInt;
	}

	/**
	 * @return the numExt
	 */
	public String getNumExt() {
		return numExt;
	}

	/**
	 * @param numExt the numExt to set
	 */
	public void setNumExt(String numExt) {
		this.numExt = numExt;
	}

	/**
	 * @return the cp
	 */
	public String getCp() {
		return cp;
	}

	/**
	 * @param cp the cp to set
	 */
	public void setCp(String cp) {
		this.cp = cp;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the fechaInicio
	 */
	public Date getFechaInicio() {
		return fechaInicio;
	}

	/**
	 * @param fechaInicio the fechaInicio to set
	 */
	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	/**
	 * @return the rangoVentas
	 */
	public RangoVentas getRangoVentas() {
		return rangoVentas;
	}

	/**
	 * @param rangoVentas the rangoVentas to set
	 */
	public void setRangoVentas(RangoVentas rangoVentas) {
		this.rangoVentas = rangoVentas;
	}

	/**
	 * @return the giro
	 */
	public Giro getGiro() {
		return giro;
	}

	/**
	 * @param giro the giro to set
	 */
	public void setGiro(Giro giro) {
		this.giro = giro;
	}

	@Override
	public String toString() {
		return cliente + "," + razonSocial + "," + localidad.toString() + "," + calle + "," + numExt + "," + cp + "," + telefono + "," + email + "," + fechaInicio.toString();
	}
}
