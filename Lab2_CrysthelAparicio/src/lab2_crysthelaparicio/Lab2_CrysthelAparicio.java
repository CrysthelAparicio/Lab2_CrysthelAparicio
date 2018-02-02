package lab2_crysthelaparicio;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Lab2_CrysthelAparicio {

    public static void main(String[] args) {
        String estado = " ";
        String opcion = " ";
        ArrayList<Detectives> lista = new ArrayList();
        ArrayList lista2 = new ArrayList();
        while (!opcion.equalsIgnoreCase("f")) {
            opcion = JOptionPane.showInputDialog("Menu\n"
                    + "a- Agregar Detectives\n"
                    + "b- Modificar Detectives\n"
                    + "c- Eliminar in\n"
                    + "d- Log In \n"
                    + "e- Salir\n");
            if (opcion.equalsIgnoreCase("a")) {
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
            if (opcion.equalsIgnoreCase("b")) {

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
                                    p += lista.indexOf(t) + " " + ((Detectives) t) + "\n";

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
//                                int evi=Integer.parseInt((JOptionPane.showInputDialog("Cuantos evidencias va a ingresar?: ")));
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
                        }
                    }

                }

            }

//            if (opcion.equalsIgnoreCase("e")) {
//                if (estado.equalsIgnoreCase("Resuelto")) {
//                    String p1 = "";
//                    for (Object t1 : lista2) {
//                        if (t1 instanceof Casos) {
//                            p1 += lista2.indexOf(t1) + " " + ((Casos) t1) + "\n";
//                        }
//
//                    }
//                    JOptionPane.showMessageDialog(null, p1);
//                }
//            }
//            if (opcion.equalsIgnoreCase("e")) {
//                if (estado.equalsIgnoreCase("Proceso")) {
//                    String p1 = "";
//                    for (Object t1 : lista2) {
//                        if (t1 instanceof Casos) {
//                            p1 += lista2.indexOf(t1) + " " + ((Casos) t1) + "\n";
//                        }
//
//                    }
//                    JOptionPane.showMessageDialog(null, p1);
//                }
//            }
//        }
            if (opcion.equalsIgnoreCase("e")) {
                System.exit(0);
            }
        }
    }
}