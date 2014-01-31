package com.siem.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name = "supervisor")
public class Supervisor implements Serializable {
    
    private static final long serialVersionUID = 4L;
    
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    @Column
    private String nombre;

    public String getId() {
        return id;
    } 

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
        
    
    public void setId(String id) {
        this.id = id;
    }


    @Override
    public String toString() {
        return String.format("%s %s", id, nombre);
    }

   
    
    
   
}
