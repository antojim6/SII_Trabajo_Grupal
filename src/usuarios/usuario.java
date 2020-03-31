/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuarios;

/**
 *
 * @author Antonio Jiménez
 */
public interface usuario {

    public Long getId();
    public String getNombre(); //Nombre y Apellidos o nombre de la ONG
    public String getCorreo();
    public String getHashPassword();
    public String getTelefono();
    public String getLocalidad();
    
    public String setNombre(String nombre, String Apellidos);
    public String setCorreo(String correo);
    public String setHashPassword(String hash);
    public String setTelefono(String telefono);
    public String setLocalidad(String Localidad);

}
