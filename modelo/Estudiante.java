package modelo;

public class Estudiante {
    private int codigo;
    private String nombre;
    private String apellido;

    private Curso curso1;
    private Curso curso2;
    private Curso curso3;
    private Curso curso4;
    private Curso curso5;

    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;

       this.curso1 = new Curso("123", "POO",4);
       this.curso2 = new Curso("456", "Ingles Avanzado",2);
       this.curso3 = new Curso("789", "Habilidades Blandas",3);
       this.curso4 = new Curso("101", "Cultura General",2);
       this.curso5 = new Curso("112", "Politica",3);

       /* this.curso1 = curso1;
        this.curso2 = curso2;
        this.curso3 = curso3;
        this.curso4 = curso4;
        this.curso5 = curso5;
*/
    }

    public boolean asignarCurso(Curso Curso){

     if (Curso != null){
         return true;
     }else {
         return false;
     }
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
