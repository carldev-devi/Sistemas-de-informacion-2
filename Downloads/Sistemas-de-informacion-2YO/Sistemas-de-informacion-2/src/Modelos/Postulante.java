package Modelos;

// Clase para contener los datos del postulante
public class Postulante {
    private int id; // ID simulado o real de la BD
    private String nombreCompleto;
    private String correoPersonal;
    private boolean aprobado;
    
    // Campos generados por el sistema (se guardan en la BD)
    private String correoInstitucional;
    private String contrasenaAleatoria;
    private String codigoTomaMaterias;

    public Postulante(int id, String nombreCompleto, String correoPersonal, boolean aprobado) {
        this.id = id;
        this.nombreCompleto = nombreCompleto;
        this.correoPersonal = correoPersonal;
        this.aprobado = aprobado;
    }

    // Getters y Setters
    public int getId() {
        return id; 
    }
    public String getNombreCompleto(){
        return nombreCompleto; 
    }
    public String getCorreoPersonal() {
        return correoPersonal; 
    }
    public boolean isAprobado() {
        return aprobado; 
    }
    
    public String getCorreoInstitucional() { 
        return correoInstitucional; 
    }
    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional; 
    }
    
    public String getContrasenaAleatoria() { 
        return contrasenaAleatoria; 
    }
    public void setContrasenaAleatoria(String contrasenaAleatoria) {
        this.contrasenaAleatoria = contrasenaAleatoria; 
    }
    
    public String getCodigoTomaMaterias() {
        return codigoTomaMaterias;
    }
    // CORRECCIÓN: Cambié 'codigoTigoMaterias' por 'codigoTomaMaterias'
    public void setCodigoTomaMaterias(String codigoTomaMaterias) {
        this.codigoTomaMaterias = codigoTomaMaterias;
    }

    @Override
    public String toString() {
        return "Postulante{" +
                "id=" + id +
                ", nombre='" + nombreCompleto + '\'' +
                ", correoInst='" + correoInstitucional + '\'' +
                ", contrasena='" + contrasenaAleatoria + '\'' +
                ", codigoMat='" + codigoTomaMaterias + '\'' +
                '}';
    }
}
