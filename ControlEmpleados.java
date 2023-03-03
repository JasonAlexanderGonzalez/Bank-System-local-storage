/**
 * @author jason
 * Clase tipo beans ControlEmpleados
 */
public class ControlEmpleados {
    private String idEmpleado = "";
    private String puesto = "";
    private String operacionRealizada = "";
    private String cuentaOrigen = "";
    private String cuentaDestino = "";

    public ControlEmpleados(String idEmpleado, String puesto, String operacionRealizada,
                            String cuentaOrigen, String cuentaDestino) {
        setIdEmpleado(idEmpleado);
        setPuesto(puesto);
        setOperacionRealizada(operacionRealizada);
        setCuentaOrigen(cuentaOrigen);
        setCuentaDestino(cuentaDestino);
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setOperacionRealizada(String operacionRealizada) {
        this.operacionRealizada = operacionRealizada;
    }

    public void setCuentaOrigen(String cuentaOrigen) {
        this.cuentaOrigen = cuentaOrigen;
    }

    public void setCuentaDestino(String cuentaDestino) {
        this.cuentaDestino = cuentaDestino;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getOperacionRealizada() {
        return operacionRealizada;
    }

    public String getCuentaOrigen() {
        return cuentaOrigen;
    }

    public String getCuentaDestino() {
        return cuentaDestino;
    }

    /**
     *
     * @return retorna las variables globales
     */
    @Override
    public String toString() {
        return "ControlEmpleados{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", puesto='" + puesto + '\'' +
                ", operacionRealizada='" + operacionRealizada + '\'' +
                ", cuentaOrigen='" + cuentaOrigen + '\'' +
                ", cuentaDestino='" + cuentaDestino + '\'' +
                '}';
    }
}
