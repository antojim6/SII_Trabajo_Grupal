/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectos;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author a_tm1
 */
public class ArchivoAdjunto implements Serializable {
    private static final long serialVersionUID = 1L;
    private Long id;
    private String extension;
    private String nombre;
    private String fecha_subida;
    private String comentario;
          
    
    //Lista de getters
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }
    @Column(name = "extension", nullable = false, length = 50)
    public String getExtension() {
       return extension;
    }
    @Column(name = "nombre", nullable = false, length = 50)
    public String getNombre() {
        return nombre;
    }
    @Column(name = "fecha_subida", nullable = false, length = 50)
    public String getFecha_subida() {
        return fecha_subida;
    }  
    @Column(name = "comentario", nullable = false, length = 50)
    public String getComentario() {
        return comentario;
    }
    
    //Lista de setters
    public void setId(Long id){
        this.id = id;
    }
    public void setExtension(String extension){
        this.extension = extension;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setFecha_subida(String fecha){
        this.fecha_subida = fecha;
    }
    public void setComentario(String comentario){
        this.comentario = comentario;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ArchivoAdjunto)) {
            return false;
        }
        ArchivoAdjunto other = (ArchivoAdjunto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Archivo Adjunto[ id=" + id + " ]";
    }
}
