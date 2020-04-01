/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Pablo Andrés Domínguez
 */
@Entity
public class PDI extends Usuario implements Serializable {

    private final Long id = super.getId();

    private String Area_de_Estudio;
    private String Departamento;
    
    @Column(name = "Area_de_Estudio", nullable = false, length = 50)
    public String getAreaDeEstudio() {
        return Area_de_Estudio;
    }

    public void setAreaDeEstudio(Long id) {
        this.Area_de_Estudio = Area_de_Estudio;
    }

    @Column(name = "Departamento", nullable = false, length = 50)
    public String getDepartamento() {
        return Departamento;
    }

    public void setDepartamento(String nombre) {
        this.Departamento = Departamento;
    }

    @Override
    public String toString() {
        return "usuarios.PDI[ id=" + id + " ]";
    }
    
}
