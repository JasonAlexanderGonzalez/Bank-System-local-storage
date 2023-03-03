import java.io.*;

/**
 * @author jason
 * Clase RegistroEmpleadoPlatafroma
 */

public class RegistroEmpleadoPlatafroma {

    /**
     * Metodo crea arhivo del EmpleadoPlataforma
     * @param nueva devuelve mensaje
     */

    public void regitraEmpleadoPlataforma(EmpleadoPlataformas nueva) {
        try {
            File fileNuevo = new File("historiaEmpleadoPlataforma.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;
            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getOperacionBancaria() +
                        "%" + nueva.getCuentaBancaria() +"%" +nueva.getCedulaCuentaBancaria());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getIdEmpleado() + "%" + nueva.getOperacionBancaria() + "%" +
                        nueva.getCuentaBancaria() +"%" +nueva.getCedulaCuentaBancaria());
            }
            buferEscribe.close();
            fileEscribe.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo que permite consultar
     * toda la informacion almacenada
     * @return devuelve un mensaje
     */
    public String consultarEmpleadoPlataforma() {
        String salida = "";
        String temporal;
        FileReader fileLee;
        BufferedReader buferLee;
        try {
            fileLee = new FileReader("historiaEmpleadoPlataforma.txt");
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
     * Metodo permite encontrar a un
     * determinado empleado de plataformas.
     * @param mensaje devuelve un mensaje
     */
    public void buscarEmpleadoPlataforma(String mensaje) {
        try {
            File fileNuevo = new File("historiaEmpleadoPlataforma.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);
                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[0].equalsIgnoreCase(mensaje)) { //lo busca en la primera posicion antes del %
                        encontro = true;
                        EmpleadoPlataformas p = new EmpleadoPlataformas(contacto[0], contacto[1],
                                contacto[2], contacto[3]);
                        System.out.println("Persona encontrada");
                        System.out.println(p.desplegaEmpleadoPlataforma());
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
