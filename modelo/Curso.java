package modelo;
public class Curso {
    private String codigoCurso;
    private String nombreCurso;
    private double nota;
    private int creditos;

    public Curso(String codigoCurso, String nombreCurso, double nota) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.nota = nota;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public double getNota() {
        return nota;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public String getDescripcion(){

        return null;
    }
    public boolean estaCalificado(){

        return false;
    }
}

