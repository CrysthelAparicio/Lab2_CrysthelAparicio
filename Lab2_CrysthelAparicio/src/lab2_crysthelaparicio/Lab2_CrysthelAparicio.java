package lab2_crysthelaparicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2_CrysthelAparicio {
    private static ArrayList<Mensaje> baseMensajes = new ArrayList();
    public static void main(String[] args) {
        String estado = " ";
        String opcion = " ";
        String mensaje = "";
        ArrayList<Detectives> lista = new ArrayList();
        ArrayList lista2 = new ArrayList();
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("MENU DETECTIVES F.B.I\n"
                    + "Bienvenido al Sistema de Alta Seguridad, Ingrese una opcion\n"
                    + "a- Agregar Detectives\n"
                    + "b- Modificar Detectives\n"
                    + "c- Eliminar Detectives\n"
                    + "d- Log In \n"
                    + "e- Salir\n");
            
            if (opcion.equalsIgnoreCase("a")) { //Agrego los Detectives
                String nombre, nacion, usuario, contrasena;
                int edad, a_lab, nivel;
                nombre = (JOptionPane.showInputDialog("Ingrese su Nombre: "));
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad: "));
                nacion = (JOptionPane.showInputDialog("Ingrese su Nacionalidad: "));
                a_lab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Años Laborales: "));
                nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Nivel: "));
                usuario = (JOptionPane.showInputDialog("Ingrese su Nuevo Usuario: "));
                contrasena = (JOptionPane.showInputDialog("Ingrese su Nueva Contraseña: "));
                lista.add(new Detectives(nombre, edad, nacion, a_lab, nivel, usuario, contrasena));
            }

            if (opcion.equalsIgnoreCase("b")) { //Modifica los Detectives
                int pos1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un parametro a modificar: \n 0- Nombre ,"
                        + " \n 1- Edad , "
                        + "\n 2- Nacionalidad, "
                        + "\n 3- Años Laborales, "
                        + "\n 4- Nivel, \n 5- Usuario , "
                        + "\n 6- Contraseña"));
                if (pos1 >= 0 && pos1 < lista.size() && lista.get(pos1) instanceof Detectives) {
                    if (pos1 == 0) {
                        String nombre = JOptionPane.showInputDialog("Nuevo nombre");
                        ((Detectives) lista.get(pos1)).setNombre(nombre);
                    }
                    if (pos1 == 1) {
                        int edad = Integer.parseInt(JOptionPane.showInputDialog("nueva edad"));
                        ((Detectives) lista.get(pos1)).setEdad(edad);
                    }
                    if (pos1 == 2) {
                        String nacionalidad = JOptionPane.showInputDialog("nueva nacionalidad");
                        ((Detectives) lista.get(pos1)).setNacionalidad(nacionalidad);
                    }
                    if (pos1 == 3) {
                        int años = Integer.parseInt(JOptionPane.showInputDialog("nuevos años laborales"));
                        ((Detectives) lista.get(pos1)).setAno_lab(años);
                    }
                    if (pos1 == 4) {
                        int nivel = Integer.parseInt(JOptionPane.showInputDialog("nuevo nivel"));
                        ((Detectives) lista.get(pos1)).setNivel(nivel);
                    }
                    if (pos1 == 7) {
                        String usuario = JOptionPane.showInputDialog("nuevo usuario");
                        ((Detectives) lista.get(pos1)).setUsuario(usuario);
                    }
                    if (pos1 == 8) {
                        String contraseña = JOptionPane.showInputDialog("nueva contraseña");
                        ((Detectives) lista.get(pos1)).setContrasena(contraseña);
                    }
                }
            }

            if (opcion.equalsIgnoreCase("c")) {
                int p = Integer.parseInt(
                        JOptionPane.showInputDialog("Posicion de Detectice a Eliminar"));
                lista.remove(p);
            }

            if (opcion.equalsIgnoreCase("d")) {
                String esp_us = (JOptionPane.showInputDialog("Ingrese su Usuario: "));
                String esp_contra = (JOptionPane.showInputDialog("Ingrese su Contraseña: "));

                for (int i = 0; i < lista.size(); i++) {
                    if (lista.get(i).getUsuario().equals(esp_us) && lista.get(i).getContrasena().equals(esp_contra)) {
                        String opcion1 = " ";
                        while (!opcion1.equalsIgnoreCase("i")) {
                            opcion1 = JOptionPane.showInputDialog(""
                                    + "a- Modificar sus Datos\n"
                                    + "b- Listar todos sus Datos\n"
                                    + "c- Registar sus casos\n"
                                    + "d- Modificar sus casos\n"
                                    + "e- Listar sus Casos\n"
                                    + "f- Enviar Mensaje\n"
                                    + "h- Listar Mensajes\n"
                                    + "i- Log Out\n");
                            if (opcion1.equals("a")) {
                                int pos = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese la Posicion del Detective: "));
                                String nombre, nacion, usuario, contrasena;
                                int edad, a_lab, nivel;
                                nombre = (JOptionPane.showInputDialog("Ingrese su Nombre: "));
                                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Edad: "));
                                nacion = (JOptionPane.showInputDialog("Ingrese su Nacionalidad: "));
                                a_lab = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Años Laborales: "));
                                nivel = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su Nivel: "));
                                usuario = (JOptionPane.showInputDialog("Ingrese su Nuevo Usuario: "));
                                contrasena = (JOptionPane.showInputDialog("Ingrese su Nueva Contraseña: "));
                                lista.get(pos).setNombre(nombre);
                                lista.get(pos).setEdad(edad);
                                lista.get(pos).setNacionalidad(nacion);
                                lista.get(pos).setAno_lab(a_lab);
                                lista.get(pos).setNivel(nivel);
                                lista.get(pos).setUsuario(usuario);
                                lista.get(pos).setContrasena(contrasena);
                            }

                            if (opcion1.equals("b")) {
                                String p = "";
                                for (Object t : lista) {
                                    if (t instanceof Detectives) {
                                        p += lista.indexOf(t);
                                        p += t + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, p);
                            }

                            if (opcion1.equals("c")) {
                                String lugar, descripcion, tipo, detec, nombre, descripcion2, nivel2;
                                lugar = (JOptionPane.showInputDialog("Ingrese Lugar: "));
                                descripcion = (JOptionPane.showInputDialog("Ingrese Descripcion del Caso: "));
                                tipo = (JOptionPane.showInputDialog("Ingrese el Tipo de Caso[Homicidio,Robo,Secuestro,Violacion]: "));
                                detec = (JOptionPane.showInputDialog("Ingrese el Detective a Cargo: "));
                                estado = (JOptionPane.showInputDialog("Ingrese el Estado del Caso[Proceso, Resuelto]: "));
                                nombre = (JOptionPane.showInputDialog("Ingrese Nombre de Evidencia: "));
                                descripcion2 = (JOptionPane.showInputDialog("Ingrese Descripcion de Evidencia: "));
                                nivel2 = (JOptionPane.showInputDialog("Ingrese Nivel de Evidencia: "));
                                lista2.add(new Casos(lugar, descripcion, tipo, detec, estado));
                                lista2.add(new Evidencia(nombre, descripcion2, nivel2));
                            }

                            if (opcion1.equals("d")) {//modifica sus casos
                                int pos1 = Integer.parseInt(
                                        JOptionPane.showInputDialog("Ingrese la Posicion del Caso: "));
                                String lugar, descripcion, tipo, detec;
                                lugar = (JOptionPane.showInputDialog("Ingrese Lugar: "));
                                descripcion = (JOptionPane.showInputDialog("Ingrese Descripcion del Caso: "));
                                tipo = (JOptionPane.showInputDialog("Ingrese el Tipo de Caso[Homicidio,Robo,Secuestro,Violacion]: "));
                                detec = (JOptionPane.showInputDialog("Ingrese el Detective a Cargo: "));
                                estado = (JOptionPane.showInputDialog("Ingrese el Estado del Caso[Proceso, Resuelto]: "));
                                ((Casos) lista2.get(pos1)).setLugar(lugar);
                                ((Casos) lista2.get(pos1)).setDescripcion(descripcion);
                                ((Casos) lista2.get(pos1)).setTipo_hom(tipo);
                                ((Casos) lista2.get(pos1)).setDetec(detec);
                                ((Casos) lista2.get(pos1)).setEstado(estado);
                            }

                            if (opcion1.equals("e")) {
                                String p1 = "";
                                for (Object t1 : lista2) {
                                    if (t1 instanceof Casos) {
                                        p1 += lista2.indexOf(t1) + " " + ((Casos) t1) + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, p1);
                            }
                            mensaje = mensajeria(esp_us);
                            if(opcion1.equals("f")){
                                
                                System.out.println(mensaje);
                            }
                            if(opcion1.equals("g")){
                                String p1 = "";
                                for (Object t1 : lista2) {
                                    if (t1 instanceof Casos) {
                                        p1 += lista2.indexOf(t1) + " " + ((Casos) t1) + "\n";
                                    }
                                }
                                JOptionPane.showMessageDialog(null, p1);
                            }
                        }
                    }

                }
            }
            if (opcion.equalsIgnoreCase("e")) {
                System.exit(0);
            }
        }
    }
    
    //private Iterable<Mensaje> baseMensajes;
    
     private static String mensajeria(String emisor){
        int opcion;
        String mensajes= "";
        do {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("MENSAJERIA:\n"
                    + "1) Nuevo mensaje\n"
                    + "2) Buzon\n"
                    + "0) Volver"));
            switch(opcion) {
                case 1:
                    enviarMensaje(emisor);
                    break;
                case 2:
                    mensajes = "";
                    for (int i = 3; i > 0; i--)
                        mensajes += mostrarMensajes(emisor, i);
                    JOptionPane.showMessageDialog(null, mensajes);
                    break;
                case 0:
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida!");
                    break;
            }
        } while (opcion != 0);
        return mensajes;
    }
    
    public static String mostrarMensajes(String receptor, int importancia){
        String output = "";
        for (Mensaje msj: baseMensajes){
            if (msj.getReceptor().equals(receptor) && msj.getImportancia() == importancia){
                output += msj + "\n";
            }
        }
        return output;
    }
    
    public static void enviarMensaje(String emisor){
        ArrayList<String> usuariosAgregados = new ArrayList<>(); 
        String detective = "";
        Iterable<Mensaje> baseMensaje = new ArrayList<>();
        for (Mensaje usuario: baseMensaje){
            if (!emisor.equals(usuario.getUsuario()) && !usuariosAgregados.contains(usuario.getUsuario())
                    && detectives(emisor, usuario.getUsuario())) {
                usuariosAgregados.add((String) usuario.getUsuario());
                detective += usuario + "\n";
            }
        }
        String usuario = " ";
        String receptor = JOptionPane.showInputDialog("A que usuario le quiere enviar un mensaje?\n" + usuario);
        Mensaje msj = new Mensaje(emisor, receptor);
        msj.nuevoMensaje();
        baseMensajes.add(msj);
        
    }

    public static boolean detectives(String emisor, Object usuario) {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}
