package modelo;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;

    Curso curso1;
    Curso curso2;
    Curso curso3;
    Curso curso4;
    Curso curso5;

    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;

    }
    public boolean asignarCurso(Curso Curso){


        return false;
    }
    public double calcularPromedio(){

        return 0.0;
    }
    public boolean pensumIncluyeCurso(String codigoCurso){

        return false;
    }
    public boolean estudianteEstaPrueba(){
        return false;
    }
    public boolean tieneCursosCompletos(String codigoCurso){

        return false;
    }
    public Curso buscarCurso(String codigoCurso){

        return null;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Curso getCurso1() {
        return curso1;
    }

    public Curso getCurso2() {
        return curso2;
    }

    public Curso getCurso3() {
        return curso3;
    }

    public Curso getCurso4() {
        return curso4;
    }

    public Curso getCurso5() {
        return curso5;
    }
}
