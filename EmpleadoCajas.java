/**
 * @author jason
 * Clase EmpleadoCajas tipo beans
 */

public class EmpleadoCajas {
    private String idEmpleado = "";
    private String operacion = "";
    private String cuentaDestino = "";
    private String cuentaOrigen = "";
    private String cedulaUsuario = "";

    public EmpleadoCajas(String idEmpleado, String operacion,
                         String cuentaDestino, String cuentaOrigen, String cedulaUsuario) {
        setIdEmpleado(idEmpleado);
        setOperacion(operacion);
        setCuentaDestino(cuentaDestino);
        setCuentaOrigen(cuentaOrigen);
        setCedulaUsuario(cedulaUsuario);

    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public void setCedulaUsuario(String cedulaUsuario) {
        this.cedulaUsuario = cedulaUsuario;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getOperacion() {
        return operacion;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public String getCedulaUsuario() {
        return cedulaUsuario;
    }

    /**
     *
     * @return retorna variables glogables
     */
    @Override
    public String toString() {
        return "EmpleadoCajas{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", operacion='" + operacion + '\'' +
                ", cuentaDestino='" + cuentaDestino + '\'' +
                ", cuentaOrigen='" + cuentaOrigen + '\'' +
                ", cedulaUsuario='" + cedulaUsuario + '\'' +
                '}';
    }

    /**
     *
     * @return retorna  un mensaje estructurado
     * de las variables globales.
     *
     */

    public String desplegaEmpleadoCajas() {
        String salida = "";

        salida += "Banco Internacional de California\n";
        salida += "Historial  Empleado Cajas \n";

        salida += "| idEmpleado |   | Operacion  | | Cuenta Destino | " +
                " | Cuenta Origen | |Cedula Usuario |\n";

        salida += "\t" + idEmpleado + "\t" + "\t" + "\t" + operacion + "\t" + "\t" + "\t" + cuentaDestino
                + "\t" + "\t" + "\t" + "\t" + cuentaOrigen + "\t" + "\t" + cedulaUsuario;

        return salida;
    }

}
