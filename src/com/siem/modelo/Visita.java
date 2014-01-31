
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
@Table(name = "visita")
public class Visita implements Serializable {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;
    
    @ManyToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;
    
    @ManyToOne
    @JoinColumn(name="id_cliente")
    private Cliente cliente;
     
    @ManyToOne
    @JoinColumn(name="id_supervisor")
    private Supervisor supervisor;
    
    @Column(name="fecha_programada")
    @Temporal(TemporalType.TIMESTAMP)
     private Date fechaProgramada;
    
        
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Date getFechaProgramada() {
        return fechaProgramada;
    }

    public Supervisor getSupervisor() {
        return supervisor;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setFechaProgramada(Date fechaProgramada) {
        this.fechaProgramada = fechaProgramada;
    }

    public void setSupervisor(Supervisor supervisor) {
        this.supervisor = supervisor;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s %s %s ", id, cliente,fechaProgramada,supervisor,usuario);
    }
        


    
}
