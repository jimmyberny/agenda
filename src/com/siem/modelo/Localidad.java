
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
 *
 * @author 
 */
@Entity
@Table(name="localidad")
public class Localidad implements Serializable{
    
    private static final long serialVersionUID = 42L;

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    
    @Column
    private String id;
    @Column
    private String nombre;
    @ManyToOne
    @JoinColumn(name="id_municipio")
    private Municipio municipio;

    /**
     * @return el identificador de Localidad
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


    public Municipio getIdMunicipio() {
        return municipio;
    }

    public void setIdMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }
    
    @Override
	public String toString() {
		return  municipio.getNombre()+" "+nombre;
	}
    
    
    
    
}
