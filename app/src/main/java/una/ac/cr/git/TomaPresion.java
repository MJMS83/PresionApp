package una.ac.cr.git;

/**
 * Created by WILLIAM on 19/06/2017.
 */

public class TomaPresion {

    private String sistolica;
    private String diastolica;
    private String fechaToma;
    private String condicion;
    private String idUsuario;
    public TomaPresion() {
    }

    public TomaPresion(String idUsuario, String sistolica, String diastolica, String condicion, String fechaToma) {
        this.idUsuario=idUsuario;
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.condicion = condicion;
        this.fechaToma = fechaToma;

    }



    public TomaPresion(String sistolica, String diastolica, String condicion, String fechaToma) {
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.condicion = condicion;
        this.fechaToma = fechaToma;
    }
    public TomaPresion(String sistolica, String diastolica, String condicion) {
        this.sistolica = sistolica;
        this.diastolica = diastolica;
        this.condicion = condicion;
    }

    public String getCondicion() {
        return condicion;
    }

    public void setCondicion(String condicion) {this.condicion = condicion;
    }

    public String getSistolica() {
        return sistolica;
    }

    public void setSistolica(String sistolica) {
        this.sistolica = sistolica;
    }

    public String getDiastolica() {
        return diastolica;
    }

    public void setDiastolica(String diastolica) {
        this.diastolica = diastolica;
    }

    public String getFechaToma() {
        return fechaToma;
    }

    public void setFechaToma(String fechaToma) {
        this.fechaToma = fechaToma;
    }

    public String getIdUsuario() { return idUsuario;}

    public void setIdUsuario(String idUsuario) {this.idUsuario = idUsuario;}
}
