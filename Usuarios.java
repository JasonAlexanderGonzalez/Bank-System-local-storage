/**
 * @author jason
 * Clase Usuarios
 */
public class Usuarios {
    private String usuario = "";
    private String operacionBancaria = "";
    private String numeroCuenta = "";
    private String dineroTransaccion = "";
    private String numeroCuentaDepositar = "";

    public Usuarios(String usuario, String operacionBancaria,
                    String numeroCuenta, String dineroTransaccion, String numeroCuentaDepositar) {
        setUsuario(usuario);
        setOperacionBancaria(operacionBancaria);
        setNumeroCuenta(numeroCuenta);
        setDineroTransaccion(dineroTransaccion);
        setNumeroCuentaDepositar(numeroCuentaDepositar);


    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public void setOperacionBancaria(String operacionBancaria) {
        this.operacionBancaria = operacionBancaria;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDineroTransaccion(String dineroTransaccion) {
        this.dineroTransaccion = dineroTransaccion;
    }

    public void setNumeroCuentaDepositar(String numeroCuentaDepositar) {
        this.numeroCuentaDepositar = numeroCuentaDepositar;
    }

    public String getUsuario() {
        return usuario;
    }


    public String getOperacionBancaria() {
        return operacionBancaria;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDineroTransaccion() {
        return dineroTransaccion;
    }

    public String getNumeroCuentaDepositar() {
        return numeroCuentaDepositar;
    }

    /**
     * Metodo permite hacer un
     * mensaje estruturado de
     * variables de clase
     * @return retorna mensaje
     */
    public String desplegaUsuarioCliente() {
        String salida = "";

        salida += "Banco Internacional de California\n";
        salida += "Transacciones hechas por el usuario\n";

        salida += "| Usuario |    | Operacion Bancaria | | Numero Cuenta | " +
                " | Total transaccion | | Cuenta a Transferir |" +
                "| Fecha y Hora creacion |\n";

        salida += "\t" + usuario + "\t" + "\t"  +"\t"  + operacionBancaria  +"\t"  +
                "\t" + "\t" + numeroCuenta + "\t" +  "\t" + "\t" + "\t"
                +dineroTransaccion + "\t" + "\t" + "\t"  + "\t" + "\t" + numeroCuentaDepositar;

        return salida;
    }

    /**
     *
     * @return devuelve variables
     * de clase
     */
    @Override
    public String toString() {
        return "Usuarios{" +
                "usuario='" + usuario + '\'' +
                ", operacionBancaria='" + operacionBancaria + '\'' +
                ", numeroCuenta='" + numeroCuenta + '\'' +
                ", dineroTransaccion='" + dineroTransaccion + '\'' +
                ", numeroCuentaDepositar='" + numeroCuentaDepositar + '\'' +
                '}';
    }
}
