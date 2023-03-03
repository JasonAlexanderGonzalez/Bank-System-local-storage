import java.io.*;

/**
 * @author gonza
 * Clase RegistroIngresoUsuario
 */
public class RegistroIngresoUsuario {

    /**
     * Metodo crea un archivo
     * @param nueva devuelve un mensaje
     */
    public void escribirUsuario(Usuarios nueva) {
        try {
            File fileNuevo = new File("usuarioCliente.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;
            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();
                buferEscribe.write(nueva.getUsuario() + "%" + nueva.getOperacionBancaria() +
                        "%" + nueva.getNumeroCuenta() + "%" + nueva.getDineroTransaccion()+
                        "%"+nueva.getNumeroCuentaDepositar());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getUsuario() + "%" + nueva.getOperacionBancaria() + "%" +
                        nueva.getNumeroCuenta() + "%" +  nueva.getDineroTransaccion()+ "%" +
                        nueva.getNumeroCuentaDepositar());
            }
            buferEscribe.close();
            fileEscribe.close();
        } catch (Exception e) {
            System.out.println(e);

        }

    }

    /**
     * Metodo permite consultar
     * toda la informacion de un archivo
     * @return devuelve un mensaje
     */
    public String consultarArchivoUsuarios() {
        String salida = "";
        String temporal;
        FileReader fileLee;
        BufferedReader buferLee;
        try {
            fileLee = new FileReader("usuarioCliente.txt");
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
     * Metodo permite buscar un
     * cliente en especifico
     * @param mensaje devuelve un mensaje
     */
    public void buscarUsuarioCliente(String mensaje) {
        try {
            File fileNuevo = new File("usuarioCliente.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);
                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[0].equalsIgnoreCase(mensaje)) {
                        encontro = true;
                        Usuarios usuario = new Usuarios(contacto[0], contacto[1], contacto[2],
                                contacto[3], contacto[4]);
                        System.out.println("Persona encontrada");
                        System.out.println(usuario.desplegaUsuarioCliente());
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
