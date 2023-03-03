/**
 * @author jason
 * Clase EmpleadoPlataformas tipo beans
 */
public class EmpleadoPlataformas {
    private String idEmpleado="";
    private  String operacionBancaria="";
    private String cuentaBancaria="";
    private String cedulaCuentaBancaria="";

    public EmpleadoPlataformas(String idEmpleado, String operacionBancaria,
                               String cuentaBancaria, String cedulaCuentaBancaria) {
        setIdEmpleado(idEmpleado);
        setOperacionBancaria(operacionBancaria);
        setCuentaBancaria(cuentaBancaria);
        setCedulaCuentaBancaria(cedulaCuentaBancaria);

    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public void setOperacionBancaria(String operacionBancaria) {
        this.operacionBancaria = operacionBancaria;
    }

    public void setCuentaBancaria(String cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }

    public void setCedulaCuentaBancaria(String cedulaCuentaBancaria) {
        this.cedulaCuentaBancaria = cedulaCuentaBancaria;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public String getOperacionBancaria() {
        return operacionBancaria;
    }

    public String getCuentaBancaria() {
        return cuentaBancaria;
    }

    public String getCedulaCuentaBancaria() {
        return cedulaCuentaBancaria;
    }

    /**
     *
     * @return retorna un mensaje estructurado
     * de las variables globales.
     */
    public String desplegaEmpleadoPlataforma() {
        String salida = "";

        salida += "Banco Internacional de California\n";
        salida += "Cuenta creadas por el Empleado Plataformas\n";

        salida += "| idEmpleado |   | Operacion Bancaria | | Numero Cuenta | " +
                " | Cedula Cliente | \n";

        salida += "\t" + idEmpleado + "\t" + "\t"  +"\t"  + operacionBancaria  +"\t"
                + "\t" + "\t" + cuentaBancaria
                + "\t" +  "\t" + "\t" + "\t" +cedulaCuentaBancaria;

        return salida;
    }

    /**
     *
     * @return retorna las variables globales
     */
    @Override
    public String toString() {
        return "EmpleadoPlataformas{" +
                "idEmpleado='" + idEmpleado + '\'' +
                ", operacionBancaria='" + operacionBancaria + '\'' +
                ", cuentaBancaria='" + cuentaBancaria + '\'' +
                ", cedulaCuentaBancaria='" + cedulaCuentaBancaria + '\'' +
                '}';
    }
}
