package lab2_crysthelaparicio;

import javax.swing.JOptionPane;

public class Mensaje {

    private String titulo;
    private String emisor;
    private String receptor;
    private String cuerpo;
    private int importancia;

    public Mensaje(String emisor, String receptor) {
        this.emisor = emisor;
        this.receptor = receptor;
    }

    public int getImportancia() {
        return importancia;
    }

    public String getEmisor() {
        return emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void nuevoMensaje() {
        titulo = JOptionPane.showInputDialog("Inesrte el titulo");
        cuerpo = JOptionPane.showInputDialog("Inserte el cuerpo del mensaje");
        importancia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la importancia del mensaje (1-3)"));
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", emisor: " + emisor + ", receptor: " + receptor
                + ", cuerpo: " + cuerpo + ", importancia: " + importancia;
    }

    Object getUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
