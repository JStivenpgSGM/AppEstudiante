package principal;

import modelo.Curso;
import modelo.Estudiante;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Registrar estudiante");
        System.out.printf("Nombre del estudiante: ");
        String nombre = scanner.nextLine();

        System.out.printf("Apellido del estudiante: ");
        String apellido = scanner.nextLine();

        System.out.printf("Código del estudiante: ");


        try {
            int codigo = scanner.nextInt();
            Estudiante estudiante = new Estudiante(codigo, nombre, apellido);
            System.out.println("El estudiante: "+ nombre + " " + apellido +", con el código: " + codigo);
            System.out.println("Se ha registrado satisfactoriamente.");
            System.out.println("Cursos matriculados del estudiante: "+nombre);

            estudiante.asignarCurso(estudiante.getCurso1());
            estudiante.asignarCurso(estudiante.getCurso2());
            estudiante.asignarCurso(estudiante.getCurso3());
            estudiante.asignarCurso(estudiante.getCurso4());
            estudiante.asignarCurso(estudiante.getCurso5());

            System.out.println(""+estudiante.getCurso1().getNombreCurso());
            System.out.println(""+estudiante.getCurso2().getNombreCurso());
            System.out.println(""+estudiante.getCurso3().getNombreCurso());
            System.out.println(""+estudiante.getCurso4().getNombreCurso());
            System.out.println(""+estudiante.getCurso5().getNombreCurso());

        }catch ( Exception e){
            System.out.println("Error en el procedimiento, se presenta la siguiente Excepcións: "+ e);
        }














    }
}
