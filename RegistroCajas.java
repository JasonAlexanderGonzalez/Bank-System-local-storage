import java.io.*;

/**
 * @author jason
 * Clase RegistroCajas
 */
public class RegistroCajas {

    /**
     * Como su nombre lo indica cada vez que se efectue determinada
     * accion se ira guardando en el archivo
     * HistorialCajas que este empleado realizo la operacion.
     *
     * @param nueva devuelve un mensaje
     */

    public void regitraCajas(EmpleadoCajas nueva) {
        try {
            File fileNuevo = new File("historialCajas.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;
            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getOperacion() +
                        "%" + nueva.getCuentaOrigen() + "%" + nueva.getCuentaDestino() +
                        "%" + nueva.getCedulaUsuario());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getOperacion() + "%" +
                        nueva.getCuentaOrigen() + "%" + nueva.getCuentaDestino() +
                        "%" + nueva.getCedulaUsuario());
            }
            buferEscribe.close();
            fileEscribe.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    /**
     * Metodo permite consultar el archivo de
     * los empleados en plataforma
     *
     * @return devuelve un mensaje
     */
    public String consultarCajas() {
        String salida = "";
        String temporal;
        FileReader fileLee;
        BufferedReader buferLee;
        try {
            fileLee = new FileReader("historialCajas.txt");
            buferLee = new BufferedReader(fileLee);
            while ((temporal = buferLee.readLine()) != null) {
                salida += temporal + "\n";
            }
        } catch (Exception e) {
            System.err.println("No se pudo leer");
        }
        return salida;
    }

    /**
     * metodo que busca un empleado en concreto
     *
     * @param mensaje devuelve un mensaje
     */
    public void buscarCajas(String mensaje) {
        try {
            File fileNuevo = new File("historialCajas.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);
                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[0].equalsIgnoreCase(mensaje)) { //lo busca en la primera posicion antes del %
                        encontro = true;
                        EmpleadoCajas p = new EmpleadoCajas(contacto[0], contacto[1], contacto[2], contacto[3],
                                contacto[4]);
                        System.out.println("Persona encontrada");
                        System.out.println(p.desplegaEmpleadoCajas());
                    }
                }
                if (encontro == false) {
                    System.out.println("El contacto no existe");
                }
            } else {
                System.out.println("Informacion no existe");
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
}
