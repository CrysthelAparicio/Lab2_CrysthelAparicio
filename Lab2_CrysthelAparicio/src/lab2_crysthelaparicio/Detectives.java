package lab2_crysthelaparicio;

import java.util.ArrayList;

public class Detectives {

    private String nombre;
    private int edad;
    private String nacionalidad;
    private int ano_lab;
    private int nivel;
    private ArrayList<String> buzon = new ArrayList();
    private String usuario;
    private String contrasena;

    public Detectives() {

    }

    public Detectives(String nombre, int edad, String nacionalidad, int ano_lab, int nivel, String usuario, String contrasena) {
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.ano_lab = ano_lab;
        this.nivel = nivel;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setAno_lab(int ano_lab) {
        this.ano_lab = ano_lab;
    }

    public int getAno_lab() {
        return ano_lab;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public int getNivel() {
        return nivel;
    }

    public void setBuzon(ArrayList<String> buzon) {
        this.buzon = buzon;
    }

    public ArrayList<String> getBuzon() {
        return buzon;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getContrasena() {
        return contrasena;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre + " Edad: " + edad + " Nacionalidad: " + nacionalidad + " Años Laborales: " + ano_lab + " Nivel: " + nivel + " Usuario: " + usuario + " Contraseña: " + contrasena;
    }

}
