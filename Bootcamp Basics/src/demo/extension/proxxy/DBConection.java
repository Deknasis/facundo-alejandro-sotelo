package demo.extension.proxxy;

public class DBConection {

    private String nameDB;
    private String host;
    private String pass;

    public DBConection(){}

    public DBConection(String nameDB, String host, String pass){
        this.nameDB = nameDB;
        this.host = host;
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "Nombre DB: "+ nameDB + " operando en el puerto: "+ host;
    }

    public String getNameDB() {
        return nameDB;
    }

    public void setNameDB(String nameDB) {
        this.nameDB = nameDB;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
