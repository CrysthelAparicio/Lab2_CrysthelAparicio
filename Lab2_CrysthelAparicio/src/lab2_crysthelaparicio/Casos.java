package lab2_crysthelaparicio;

public class Casos {

    private String lugar;
    private String descripcion;
    private String tipo_hom;
    private String detec;
    private String estado;

    public Casos() {

    }

    public Casos(String lugar, String descripcion, String tipo_hom, String detec, String estado) {
        this.lugar = lugar;
        this.descripcion = descripcion;
        this.tipo_hom = tipo_hom;
        this.detec = detec;
        this.estado = estado;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getLugar() {
        return lugar;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setTipo_hom(String tipo_hom) {
        this.tipo_hom = tipo_hom;
    }

    public String getTipo_hom() {
        return tipo_hom;
    }

    public void setDetec(String detec) {
        this.detec = detec;
    }

    public String getDetec() {
        return detec;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getEstado() {
        return estado;
    }

    @Override
    public String toString() {
        if (tipo_hom.equalsIgnoreCase("homicidio")) {
            return "Tipo de Caso: " + tipo_hom + " Lugar: " + lugar + " Descripcion: " + descripcion + " Detective a Cargo: " + detec + " Estado: " + estado;
        } else if (tipo_hom.equalsIgnoreCase("secuestro")) {
            return "Tipo de Caso: " + tipo_hom + " Lugar: " + lugar + " Descripcion: " + descripcion + " Detective a Cargo: " + detec + " Estado: " + estado;
        } else if (tipo_hom.equalsIgnoreCase("violacion")) {
            return "Tipo de Caso: " + tipo_hom + " Lugar: " + lugar + " Descripcion: " + descripcion + " Detective a Cargo: " + detec + " Estado: " + estado;
        } else if (tipo_hom.equalsIgnoreCase("robo")) {
            return "Tipo de Caso: " + tipo_hom + " Lugar: " + lugar + " Descripcion: " + descripcion + " Detective a Cargo: " + detec + " Estado: " + estado;
        } else {
            return "NO INGRESO CORRECTAMENTE EL TIPO DE HOMICIDIO";
        }
    }
}
