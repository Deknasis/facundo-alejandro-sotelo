package demo.extension.conexionesBDs;

import demo.extension.factory.IConexionBD;

public class ConexionSQL implements IConexionBD {


    private String user;
    private String cadenaConexion;
    private String nombreBD;

    public ConexionSQL(){
        this.user = "root";
        this.cadenaConexion = "localhost:8000";
        this.nombreBD = "mydb";
    }

    @Override
    public String conectar() {
        return "Conexion Exitosa";
    }

    @Override
    public String desconectar() {
        return "No se pudo conectar";
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getCadenaConexion() {
        return cadenaConexion;
    }

    public void setCadenaConexion(String cadenaConexion) {
        this.cadenaConexion = cadenaConexion;
    }

    public String getNombreBD() {
        return nombreBD;
    }

    public void setNombreBD(String nombreBD) {
        this.nombreBD = nombreBD;
    }
}
