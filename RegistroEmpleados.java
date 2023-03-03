import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

/**
 * @author jason
 * Clase RegistroEmpleados
 */
public class RegistroEmpleados {

    /**
     * Metodo crea un archivo
     * @param nueva devuelve un mensaje
     */

    public void regitraEmpleados(ControlEmpleados nueva) {
        try {
            File fileNuevo = new File("controlEmpleados.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;
            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getPuesto() + "%" +
                        nueva.getOperacionRealizada() +"%" +nueva.getCuentaOrigen()+"%" +
                        nueva.getCuentaOrigen());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getPuesto() + "%" + nueva.getOperacionRealizada() +
                        "%" +nueva.getCuentaOrigen()+"%" +nueva.getCuentaOrigen());
            }

            buferEscribe.close();
            fileEscribe.close();

        } catch (Exception e) {
            System.out.println(e);

        }
    }
}
