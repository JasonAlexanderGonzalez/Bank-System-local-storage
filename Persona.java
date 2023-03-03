/**
 * @author Jason
 * Clase Persona tipo beans
 */
public class Persona {
    String cedula = "";
    String tipoCuenta = "";
    String saldoCuenta = "";
    String monedaCuenta = "";
    String titularCuenta = "";
    String telefono = "";
    String domicilio = "";
    String numeroCuenta = "";
    String usuario = "";
    String claveUsuario = "";

    public Persona(String cedula, String tipoCuenta, String saldoCuenta,
                   String monedaCuenta, String titularCuenta, String telefono,
                   String domicilio, String numeroCuenta, String usuario, String claveUsuario) {

        setCedula(cedula);
        setTipoCuenta(tipoCuenta);
        setSaldoCuenta(saldoCuenta);
        setMonedaCuenta(monedaCuenta);
        setTitularCuenta(titularCuenta);
        setTelefono(telefono);
        setDomicilio(domicilio);
        setNumeroCuenta(numeroCuenta);
        setUsuario(usuario);
        setClaveUsuario(claveUsuario);

    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public void setSaldoCuenta(String saldoCuenta) {
        this.saldoCuenta = saldoCuenta;
    }

    public void setMonedaCuenta(String monedaCuenta) {
        this.monedaCuenta = monedaCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public String getSaldoCuenta() {
        return saldoCuenta;
    }

    public String getMonedaCuenta() {
        return monedaCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setClaveUsuario(String claveUsuario) {
        this.claveUsuario = claveUsuario;
    }

    public String getClaveUsuario() {
        return claveUsuario;
    }

    /**
     *
     * @return retorna variables globales
     */
    @Override
    public String toString() {
        return "Persona{" +
                "numero de cuenta='" + numeroCuenta + '\'' +
                ", tipo de cuenta='" + tipoCuenta + '\'' +
                ", saldo de la cuenta='" + saldoCuenta + '\'' +
                ", moneda de la cuenta='" + monedaCuenta + '\'' +
                ", titular de la cuenta='" + titularCuenta + '\'' +
                ", telefono usuario='" + telefono + '\'' +
                ", Domicilio usuario='" + domicilio + '\'' +
                ", cedula usuario='" + cedula + '\'' +
                "  usuario='" + usuario + '\'' +
                "  La clave del usuario='" + claveUsuario + '\'' +
                '}';
    }

    /**
     *
     * @return retona mensaje estructurado
     * de las variables globales
     */
    public String desplegaPersona() {
        String salida="";

        salida+="Banco Internacional de California\n";

        salida+="| Cedula |  | Tipo Cuenta | | Saldo | | Moneda | "+
                " | Titular | | Telefono | | Domicilio || #Cuenta || Usuario |  | Clave |"+
                "    | Fecha y Hora creacion |\n";

        salida+=cedula+ "\t" +"\t" + tipoCuenta+"\t" +"\t"+saldoCuenta+
                "\t"+"\t" + monedaCuenta+ "\t"+"\t"+"\t" +titularCuenta+ "\t"+"\t" +telefono+
                "\t"+"\t" +domicilio+"\t"+"\t"+"\t" +numeroCuenta+"\t"+"\t"+"\t"+usuario+"\t"+
                "\t"+"\t"+claveUsuario;

        return salida;
    }

    /**
     * metodo devuelve otra estructura de mensaje de
     * las variables globales
     * @param numeroCuenta
     * @param tipoCuenta
     * @param saldoCuenta
     * @param monedaCuenta
     * @param titularCuenta
     * @param telefono
     * @param domicilio
     * @param cedula
     * @param usuario
     * @param claveUsuario
     */
    public void reemplazo(String numeroCuenta, String tipoCuenta, String saldoCuenta,
                          String monedaCuenta, String titularCuenta, String telefono,
                          String domicilio, String cedula, String usuario, String claveUsuario) {

        System.out.println("numero de cuenta: " + numeroCuenta);
        System.out.println("tipo de cuenta: " + tipoCuenta);
        System.out.println("saldo de la cuenta: " + saldoCuenta);
        System.out.println("moneda de cuenta: " + monedaCuenta);
        System.out.println("titular de la cuenta: " + titularCuenta);
        System.out.println("telefono de usuario: " + telefono);
        System.out.println("domicilio de usuario: " + domicilio);
        System.out.println("cedula de usuario: " + cedula);
        System.out.println("usuario: " + usuario);
        System.out.println("La clave del usuario: " + claveUsuario);


    }

    /**
     *
     * @return retorna mensaje estructurado de variables globales
     */
    public String despliegaCuenta() {
        String salida="";

        salida+="Banco Internacional de California\n";

        salida+="| #Cuenta |  | Tipo Cuenta | | Saldo | | Moneda | "+
                " | Titular | | Telefono | | Domicilio | |Cedula || Usuario |  | Clave |"+
                "    | Fecha y Hora creacion |\n";

        salida+=numeroCuenta+ "\t" +"\t" + tipoCuenta+"\t" +"\t"+saldoCuenta+
                "\t"+"\t" + monedaCuenta+ "\t"+"\t"+"\t" +titularCuenta+ "\t"+"\t" +telefono+ "\t"+"\t" +domicilio+
                "\t"+"\t"+"\t" +cedula+"\t"+"\t"+"\t"+usuario+"\t"+"\t"+"\t"+claveUsuario;

        return salida;
    }


}