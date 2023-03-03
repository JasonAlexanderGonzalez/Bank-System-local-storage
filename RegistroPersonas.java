import java.io.*;                         //CLASE MAS IMPORTANTE O HUB

/**
 * @author jason
 * Clase RegistroPersonas
 */
public class RegistroPersonas {

    /**
     * Metodo crea un archivo
     * @param nueva devuelve un mensaje
     */
    public void ingresarDatos(Persona nueva) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;

            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();

                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() + "%" +
                        nueva.getSaldoCuenta() +"%" + nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" +nueva.getClaveUsuario());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() + "%" +
                        nueva.getSaldoCuenta() + "%" +nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" + nueva.getClaveUsuario());
            }

            buferEscribe.close();
            fileEscribe.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo permite consultar
     * toda la informacion
     * del archivo
     * @return devuelve un mensaje
     */
    public String consultarArchivo() {
        String salida = "";
        String temporal;
        FileReader fileLee;
        BufferedReader buferLee;
        try {
            fileLee = new FileReader("cuentasBancarias.txt");
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
     * Metodo permite buscar un dato en
     * especifico y manipular el metodo
     * que modifica el archivo.
     * Metodo para sumar a la cuenta
     * @param uno devuelve mensaje
     * @param dos devuelve mensaje
     * @param tres devuelve mensaje
     */

    public void buscar(String uno, String dos, String tres) {

        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);
                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[7].equalsIgnoreCase(uno)) {
                        encontro = true;
                        Persona person = new Persona(contacto[0], contacto[1], contacto[2],
                                contacto[3], contacto[4], contacto[5], contacto[6], contacto[7],
                                contacto[8], contacto[9]);
                        System.out.println("Persona encontrada");

                        person.setSaldoCuenta(dos);
                        person.desplegaPersona();
                        person.setSaldoCuenta(dos); //reemplaza la informacion de la persona que se busco
                        person.reemplazo(person.getNumeroCuenta(),person.getTipoCuenta(),
                                person.getSaldoCuenta(), person.getMonedaCuenta(),
                                person.getTitularCuenta(), person.getTelefono(),
                                person.getDomicilio(),person.getCedula(),
                                person.getUsuario(), person.getClaveUsuario());
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

    /**
     * Metodo elimina por numero cedula
     * un contacto
     * @param eliminado devuelve un mensaje
     */
    public void eliminar(String eliminado) {

        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);
                String linea;
                int contador = 0;
                while ((linea = buferLee.readLine()) != null) {                  //hasta que sea null
                    contador++;
                }

                System.out.println("total de contactos: " + contador);
                String contactos[] = new String[contador];                    //creamos un arreglo de contactos, guardamos el contador
                buferLee = new BufferedReader(new FileReader(fileNuevo));
                int i = 0;
                while ((linea = buferLee.readLine()) != null) {
                    contactos[i] = linea;
                    i++;
                }

                buferLee.close();
                fileLee.close();
                FileWriter fileEscribe = new FileWriter(fileNuevo);
                BufferedWriter bw = new BufferedWriter(fileEscribe);

                boolean bandera = false;
                boolean primeraLinea = true;
                for (int h = 0; h < contactos.length; h++) {
                    String arreglo[] = contactos[h].split("%"); // con el i me elimina a todos
                    if (arreglo[0].equalsIgnoreCase(eliminado)) {
                        bandera = true;
                        System.out.println("Contacto eliminado");

                    } else {
                        if (primeraLinea == true) {
                            bw.write(contactos[h]);//con el i elimina
                            primeraLinea = false;

                        } else {
                            bw.newLine();
                            bw.write(contactos[h]);
                        }
                    }
                }

                if (bandera == false) {
                    System.out.println("No se encontro el contacto");
                }

                bw.close();
                fileEscribe.close();
                if (contador == 1 && bandera == true) {
                    fileNuevo.delete();
                }

            } else {
                System.out.println("no hay contactos que eliminar");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo busca un contacto
     * por el # cedula
     * @param mensaje devuelve un mensaje
     */
    public void buscarNadaMas(String mensaje) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);

                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {

                    String contacto[] = linea.split("%");
                    if (contacto[0].equalsIgnoreCase(mensaje)) { //lo busca en la primera posicion antes del %
                        encontro = true;
                        Persona person = new Persona(contacto[0], contacto[1], contacto[2],
                                contacto[3], contacto[4], contacto[5], contacto[6],
                                contacto[7], contacto[8], contacto[9]);
                        System.out.println("Persona encontrada");

                        System.out.println(person.desplegaPersona());
                        person.desplegaPersona();
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

    /**
     * Metodo modifica el archivo,
     * permite ingresar dinero a la cuenta
     * @param nueva devuelve un mensaje
     * @param uno devuelve un mensaje
     * @param dos devuelve un mensaje
     * @param tres devuelve un mensaje
     */

    public void ingresarDinero(Persona nueva, String uno, String dos, String tres) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;

            buscar(uno, dos, tres);                              //string tres se agrego
            int primero = Integer.parseInt(dos);                 //ingreso el monto a depositar
            int segundo = Integer.parseInt(tres);               //ingreso monto total de la cuenta
            int operaciones = primero + segundo;
            String copiaValor = String.valueOf(operaciones);      //converti el int en texto
            nueva.setSaldoCuenta(copiaValor);                     //cambie el segundo por el copiaValor

            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();

                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() + "%" +
                        nueva.getSaldoCuenta() + "%" + nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" + nueva.getClaveUsuario());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);

                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() + "%" +
                        nueva.getSaldoCuenta() + "%" + nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" + nueva.getClaveUsuario());
            }

            buferEscribe.close();
            fileEscribe.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo elimina un # cuenta
     * en especifico
     * @param eliminado devuelve un mensaje
     */
    public void eliminarPorCedula(String eliminado) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);

                String linea;
                int contador = 0;
                while ((linea = buferLee.readLine()) != null) {
                    contador++;
                }

                System.out.println("total de contactos: " + contador);
                String contactos[] = new String[contador];
                buferLee = new BufferedReader(new FileReader(fileNuevo));
                int i = 0;
                while ((linea = buferLee.readLine()) != null) {
                    contactos[i] = linea;
                    i++;
                }

                buferLee.close();
                fileLee.close();
                FileWriter fileEscribe = new FileWriter(fileNuevo);
                BufferedWriter bw = new BufferedWriter(fileEscribe);

                boolean bandera = false;
                boolean primeraLinea = true;
                for (int h = 0; h < contactos.length; h++) {
                    String arreglo[] = contactos[h].split("%");
                    if (arreglo[7].equalsIgnoreCase(eliminado)) {
                        bandera = true;
                        System.out.println("Contacto eliminado");

                    } else {
                        if (primeraLinea == true) {
                            bw.write(contactos[h]);//con el i elimina a todos
                            primeraLinea = false;

                        } else {
                            bw.newLine();
                            bw.write(contactos[h]);
                        }
                    }
                }

                if (bandera == false) {
                    System.out.println("No se encontro el contacto");
                }

                bw.close();
                fileEscribe.close();
                if (contador == 7 && bandera == true) { //unos se cambio a 7
                    fileNuevo.delete();
                }

            } else {
                System.out.println("no hay contactos que eliminar");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo que permite buscar
     * # cuenta a restar
     * @param uno
     * @param dos
     * @param tres
     */
    public void buscarSumar(String uno, String dos, String tres) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);

                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[7].equalsIgnoreCase(uno)) {
                        encontro = true;
                        Persona person = new Persona(contacto[0], contacto[1], contacto[2],
                                contacto[3], contacto[4], contacto[5], contacto[6],
                                contacto[7], contacto[8], contacto[9]);

                        System.out.println("Persona encontrada");
                        person.setSaldoCuenta(dos);
                        person.desplegaPersona();
                        person.setSaldoCuenta(dos); //reemplaza la informacion de la persona que se busco
                        person.reemplazo(person.getNumeroCuenta(), person.getTipoCuenta(),
                                person.getSaldoCuenta(), person.getMonedaCuenta(),
                                person.getTitularCuenta(), person.getTelefono(),
                                person.getDomicilio(), person.getCedula(),
                                person.getUsuario(), person.getClaveUsuario());
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

    /**
     * Metodo que realiza la resta a la cuenta
     * @param nueva devuelve un mensaje
     * @param uno devuelve un mensaje
     * @param dos devuelve un mensaje
     * @param tres devuelve un mensaje
     */
    public void ingresarResta(Persona nueva, String uno, String dos, String tres) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            FileWriter fileEscribe;
            BufferedWriter buferEscribe;
            buscarSumar(uno, dos, tres);                              // metodo restar
            int primerMonto = Integer.parseInt(dos);                 //ingreso el monto a restar
            int segundoMonto = Integer.parseInt(tres);               //ingreso monto total de la cuenta

            int operaciones = primerMonto - segundoMonto;
            String copia = String.valueOf(operaciones);      //converti el int en texto

            nueva.setSaldoCuenta(copia);

            if (fileNuevo.exists()) {
                fileEscribe = new FileWriter(fileNuevo, true);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.newLine();

                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() +
                        "%" + nueva.getSaldoCuenta() + "%" +nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" + nueva.getClaveUsuario());

            } else {
                fileEscribe = new FileWriter(fileNuevo);
                buferEscribe = new BufferedWriter(fileEscribe);
                buferEscribe.write(nueva.getCedula() + "%" + nueva.getTipoCuenta() + "%" +
                        nueva.getSaldoCuenta() +  "%" + nueva.getMonedaCuenta() + "%" +
                        nueva.getTitularCuenta() + "%" + nueva.getTelefono() + "%" +
                        nueva.getDomicilio() + "%" + nueva.getNumeroCuenta() + "%" +
                        nueva.getUsuario() + "%" + nueva.getClaveUsuario());
            }

            buferEscribe.close();
            fileEscribe.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    /**
     * Metodo encuentra el # de cuenta
     * @param mensaje devuelve un mensaje
     */
    public void buscarNumeroCuenta(String mensaje) {
        try {
            File fileNuevo = new File("cuentasBancarias.txt");
            if (fileNuevo.exists()) {
                FileReader fileLee = new FileReader(fileNuevo);
                BufferedReader buferLee = new BufferedReader(fileLee);

                String linea;
                boolean encontro = false;
                while ((linea = buferLee.readLine()) != null) {
                    String contacto[] = linea.split("%");
                    if (contacto[7].equalsIgnoreCase(mensaje)) { //lo busca en la primera posicion antes del %
                        encontro = true;
                        Persona person = new Persona(contacto[0], contacto[1], contacto[2],
                                contacto[3],contacto[4], contacto[5], contacto[6], contacto[7],
                                contacto[8], contacto[9]);

                        System.out.println("Numero Cuenta encontrada");
                        System.out.println(person.desplegaPersona());
                        person.despliegaCuenta();
                    }
                }

                if (encontro == false) {
                    System.out.println("La cuenta no existe");
                }

            } else {
                System.out.println("Informacion inexistente");
            }

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
