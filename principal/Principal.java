package principal;

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
        int codigo = scanner.nextInt();

        Estudiante estudiante = new Estudiante(codigo, nombre, apellido);

        System.out.println("El estudiante: "+ nombre + " " + apellido +", con el código: " + codigo);
        System.out.printf("Se ha registrado satisfactoriamente.");






    }
}
