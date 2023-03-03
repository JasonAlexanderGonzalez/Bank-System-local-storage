import javax.swing.*;
import java.time.*;

public class PruebaCuentasBancarias {
    public static void main(String[] args) {

        RegistroPersonas operaciones = new RegistroPersonas();
        Criptografia criptografia = new Criptografia();
        RegistroIngresoUsuario regis = new RegistroIngresoUsuario();
        RegistroEmpleadoPlatafroma plataformas = new RegistroEmpleadoPlatafroma();
        RegistroCajas cajas = new RegistroCajas();
        RegistroEmpleados empleados = new RegistroEmpleados();

        int opcion;
        String msj = "===============================================================" +
                "\n                    Banco Internacional de California \n" +

                "\t" + "                                     \n" +
                "Contactos Bancarios\n"
                + "_______________________ \n"
                + " \t" + "| 1.Crea cuenta Bancaria |" + " \t" + "" + " \t" +
                " \t" + "| 2. Todos Los Contactos Bancarios en archivo |" + " \n"
                + "_______________________ \n"
                + " \t" + "| 3. Elimina cuentas bancarias por su numero de cedula  |" + " \t" + "" +
                " \t" + " \t" + "|  5. Consulta un  contacto bancario por # cedula |" + " \n" +
                "_______________________ \n"
                + " \t" + "| 7 Agregar dinero a la cuenta bancaria y/o modifica la cuenta  |" + " \t" + "" +
                " \t" + " \t" + "|  12. Eliminar cuenta Bancaria por su # cuenta |" + " \n"
                + "_______________________ \n" +
                " \t" + "| 13 Rebaja dinero a la cuenta bancaria y/o modifica la cuenta  |" + " \t" + "" +
                " \t" + "| 14. Consulta un contacto por # cuenta  |" + " \t" + "" +

                "\t" + "                                     \n" +
                "\t" + "                                     \n" +

                "Clientes\n"
                + "_______________________ \n"
                + " \t" + "| 6. Acceso al App bancaria  |" + " \t" + "" + " \t" +
                " \t" + "|   4. App desecriptar contraseñas |" + " \n"
                + "_______________________ \n" +

                "Consultas Internas Bancarias\n" +

                "_______________________ \n"
                + " \t" + "|8 Historial Empleado Plataformas |" + " \t" +
                "" + " \t" + " \t" + "| 9 GUI Empleado Plataformas y sus transacciones |" + " \n"
                + "_______________________ \n"
                + " \t" + "|10 Historial empleado cajas |" + " \t" +
                "" + " \t" + " \t" + "| 11 Encuentra un Empleado cajas y sus transacciones |" + " \n"

                + "\n"
                + "| 15.Cerrar Aplicacion |\n"
                + "                     2021 Copyright*";

        do {

            opcion = demeNumero(msj);
            switch (opcion) {
                case 1:

                    String idEmpleado = JOptionPane.showInputDialog("Digite," +
                            " id Empleado");
                    String operacioBancaria = JOptionPane.showInputDialog("Digite," +
                            " operacion bancaria");
                    String cedula = JOptionPane.showInputDialog("Digite," +
                            " la cedula, del titular de la cuenta");
                    String tipoCuenta = JOptionPane.showInputDialog("Digite," +
                            " el tipo, de cuenta a crear");
                    String saldoCuenta = JOptionPane.showInputDialog("Digite," +
                            " el saldo, de la cuenta ");
                    String monedaCuenta = JOptionPane.showInputDialog("Digite," +
                            " tipo de moneda, de la cuenta");
                    String titularCuenta = JOptionPane.showInputDialog("Digite," +
                            " el titular de, la cuenta");
                    String telefono = JOptionPane.showInputDialog("Digite," +
                            " el # telefono, del titular de la cuenta");
                    String domicilio = JOptionPane.showInputDialog("Digite," +
                            " el domicilio, del titular de la cuenta");
                    String numeroCuenta = JOptionPane.showInputDialog("Digite," +
                            " el numero, de cuenta a crear");
                    String usuario = JOptionPane.showInputDialog("Cree," +
                            " un usuario para esta cuenta,de esta cuenta");
                    String claveUsuario = JOptionPane.showInputDialog("Cree la contraseña," +
                            " esta se encriptara");

                    operaciones.ingresarDatos(new Persona(cedula, tipoCuenta, saldoCuenta,
                            monedaCuenta, titularCuenta, telefono, domicilio, numeroCuenta,
                            usuario, criptografia.encriptacion(claveUsuario)
                            + "\t" + LocalDateTime.now()));

                    plataformas.regitraEmpleadoPlataforma(new EmpleadoPlataformas(idEmpleado, //guardamos algunos datos en el archivo de plataforma
                            operacioBancaria, numeroCuenta, cedula));

                    break;
                case 2:

                    System.out.println(operaciones.consultarArchivo()); //en consola
                    JOptionPane.showMessageDialog(null, operaciones.consultarArchivo(), //en pantalla
                            "Consultar Archivo",
                            JOptionPane.WARNING_MESSAGE);

                    break;
                case 3:

                    String eliminado = JOptionPane.showInputDialog("Ingrese," +
                            "la cedula de quien desea eliminar," +
                            "1 dato antes del %");
                    operaciones.eliminar(eliminado);

                    break;
                case 4:

                    String desencriptaClaveUsuario = JOptionPane.showInputDialog("Copie," +
                            " y pegue el codigo, encriptado de la clave del usuario");
                    System.out.println("La contraseña de este usuario es : "
                            + criptografia.desEncriptacion(desencriptaClaveUsuario));

                    break;
                case 5:

                    String dato = JOptionPane.showInputDialog("Ingrese el # cedula a buscar");
                    operaciones.buscarNadaMas(dato);

                    break;
                case 6:

                    int arreglo[] = new int[1];                            //genera codigo acceso
                    for (int i = 0; i < arreglo.length; i++) {
                        arreglo[i] = (int) (Math.random() * 1000000);
                        System.out.println("el codigo de acceso es " + arreglo[i]);


                        String codigoAcceso = JOptionPane.showInputDialog("Ingrese el codigo," +
                                "de acceso para para ingresar a la plataforma");
                        int codeAcces = Integer.parseInt(codigoAcceso);

                        if (codeAcces == arreglo[0]) {

                            String userName = JOptionPane.showInputDialog("Ingrese su numero de cedula");
                            System.out.println("Se accedio el: " + LocalDateTime.now());
                            operaciones.buscarNadaMas(userName);  //busca la cedula del usuario

                            String deseaHacer = JOptionPane.showInputDialog("Ingrese que desea hacer 1.Deposito +" +
                                    "2. salir");

                            if (deseaHacer.equalsIgnoreCase("1") || deseaHacer.equalsIgnoreCase("Deposito")) {

                                String depositoCuenta = "Deposito";
                                String numerodeCuenta = JOptionPane.showInputDialog("Ingrese el # de cuenta");

                                String dineroTransaccion = JOptionPane.showInputDialog("Ingrese el dinero a transferir");
                                String cuentaDepositar = JOptionPane.showInputDialog("Ingrese la cuenta a despositar");


                                regis.escribirUsuario(new Usuarios(userName, depositoCuenta, numerodeCuenta, dineroTransaccion,
                                        cuentaDepositar + " " + LocalDateTime.now()));
                                //usa su metodo propio y escribe lo que hizo el usuario.

                            }


                        } else if (codeAcces != arreglo[0]) {

                            System.out.println("Has salido con exito");
                        }

                    }


                    break;
                case 7: //metodo puedo o no cambiar los datos y sumar  pero la funcion principal es sumar

                    String identificacionEmpleado = JOptionPane.showInputDialog("Ingrese el # id empleado,");
                    String departamentoEmpleado = JOptionPane.showInputDialog("Ingrese el," +
                            " # departamento de empleado,");
                    String operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar,");


                    String ceduActualizada = JOptionPane.showInputDialog("Ingrese la cedula," +
                            " del titular de la cuenta");
                    String tipCuenta = JOptionPane.showInputDialog("Ingrese/Actualice el tipo," +
                            " de cuenta a crear");
                    String saldCuenta = JOptionPane.showInputDialog("Ingrese/Actualice el saldo," +
                            " inicial de la cuenta ");
                    String moneCuenta = JOptionPane.showInputDialog("Ingrese/Actualice el tipo moneda," +
                            " de la cuenta");
                    String tituCuenta = JOptionPane.showInputDialog("Ingrese/Actualice el titular de, " +
                            "la cuenta");
                    String celularUsuario = JOptionPane.showInputDialog("Ingrese/Actualice el # telefono," +
                            " del titular de la cuenta");
                    String domicilioUsuario = JOptionPane.showInputDialog("Ingrese/Actualice el domicilio," +
                            "del titular de la cuenta");
                    String numCuenta = JOptionPane.showInputDialog("Digite el # de cuenta," +
                            " a depositar o cuenta destino");
                    String cuentaOrigen = JOptionPane.showInputDialog("Ingrese # cuenta a rebajar el dinero o cuenta origen,");

                    String usuarioActualizado = JOptionPane.showInputDialog("Actualice el usuario, " +
                            "de esta cuenta");
                    String claveUsuarior = JOptionPane.showInputDialog("Actualice la clave," +
                            " esta se encriptara");

                    String uno = JOptionPane.showInputDialog("Ingrese," +
                            " cuenta a despositar"); //correcto pero no actualiza en el archivo
                    String dos = JOptionPane.showInputDialog("Ingrese," +
                            " monto sumar, en caso contrario digite 0");

                    operaciones.ingresarDinero(new Persona(ceduActualizada, tipCuenta, saldCuenta, moneCuenta, tituCuenta,
                                    celularUsuario, domicilioUsuario, numCuenta, usuarioActualizado,
                                    criptografia.encriptacion(claveUsuarior) + "\t" + LocalDateTime.now()),
                            uno, dos, saldCuenta); //al final se agrego saldo cuetas para realizar la operacion

                    empleados.regitraEmpleados(new ControlEmpleados(identificacionEmpleado, departamentoEmpleado, operacion,
                            numCuenta, cuentaOrigen));

                    break;
                case 8:

                    System.out.println(plataformas.consultarEmpleadoPlataforma());
                    JOptionPane.showMessageDialog(null, plataformas.consultarEmpleadoPlataforma(),
                            "Empleado Plataformas",
                            JOptionPane.WARNING_MESSAGE);

                    break;
                case 9:

                    String consultandoEmpleado = JOptionPane.showInputDialog("Ingrese el id del empleado");
                    plataformas.buscarEmpleadoPlataforma(consultandoEmpleado);

                    break;
                case 10:

                    System.out.println(cajas.consultarCajas());
                    JOptionPane.showMessageDialog(null, cajas.consultarCajas(),
                            "Empleado Cajas",
                            JOptionPane.WARNING_MESSAGE);


                    break;
                case 11:

                    String usuarioClientes = JOptionPane.showInputDialog("Digite el id cajero, " +
                            "para buscar sus transacciones");
                    cajas.buscarCajas(usuarioClientes);

                    break;
                case 12:

                    String eliminaCuenta = JOptionPane.showInputDialog("Ingrese cuenta a eliminar," +
                            " 8 dato despues del %");
                    operaciones.eliminarPorCedula(eliminaCuenta);

                    break;
                case 13:   //rebaja dinero de la cuenta y/0 actualiza la cuenta

                    String identificaEmpleado = JOptionPane.showInputDialog("Ingrese el # id empleado,");
                    String departaEmpleado = JOptionPane.showInputDialog("Ingrese el," +
                            " # departamento de empleado,");
                    String operacionHecha = JOptionPane.showInputDialog("Ingrese la operacion a realizar,");

                    String cedActualiza = JOptionPane.showInputDialog("Digite/Actualice la cedula," +
                            " del titular de la cuenta");
                    String tipoCuenActualizada = JOptionPane.showInputDialog("Digite/Actualice el tipo," +
                            " de cuenta a crear");
                    String saldCuentaActualizada = JOptionPane.showInputDialog("Ingrese/Actualice el saldo," +
                            " inicial de la cuenta ");
                    String monCuentaActualiza = JOptionPane.showInputDialog("Digite/Actualice la moneda," +
                            " de la cuenta");
                    String titulaCuenta = JOptionPane.showInputDialog("Digite/Actualice el titular de, " +
                            "la cuenta");
                    String telefonoActualiza = JOptionPane.showInputDialog("Digite/Actualice el telefono," +
                            " del titular de la cuenta");
                    String domiciActualiza = JOptionPane.showInputDialog("Digite/Actualice el domicilio," +
                            "del titular de la cuenta");

                    String numCuenActualiza = JOptionPane.showInputDialog("Digite el numero," +  //cuenta de origen
                            " de cuenta de origen donde se reabajara");
                    String actualizaUsuario = JOptionPane.showInputDialog("Digite/actualice para crear el usuario, " +
                            "de esta cuenta");
                    String claveUsuarioActualiza = JOptionPane.showInputDialog("Digite/actualice la contraseña," +
                            " esta se encriptara");

                    String tres = JOptionPane.showInputDialog("Ingrese cuenta buscar/disminuir saldo"); //correcto pero no actualiza en el archivo
                    String cuatro = JOptionPane.showInputDialog("Ingrese monto rebajar/ 0 para continuar");

                    operaciones.ingresarResta(new Persona(cedActualiza, tipoCuenActualizada, saldCuentaActualizada,
                                    monCuentaActualiza, titulaCuenta, telefonoActualiza, domiciActualiza, numCuenActualiza, actualizaUsuario,
                                    criptografia.encriptacion(claveUsuarioActualiza) + "\t" + LocalDateTime.now()), tres,
                            cuatro, saldCuentaActualizada);

                    empleados.regitraEmpleados(new ControlEmpleados(identificaEmpleado, departaEmpleado, operacionHecha,
                            numCuenActualiza, tres));

                    break;
                case 14:

                    String buscandoCuenta = JOptionPane.showInputDialog("Ingrese # cuenta a buscar");
                    operaciones.buscarNumeroCuenta(buscandoCuenta);

                    break;
                default:
            }
        } while (opcion != 15);
    }

    public static int demeNumero(String mensaje) {
        String respuesta = javax.swing.JOptionPane.showInputDialog(mensaje);
        return Integer.parseInt(respuesta);
    }


}





