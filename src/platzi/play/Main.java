package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi play");

        Pelicula pelicula = new Pelicula();
        pelicula.titulo = "El señor de los anillos";
        pelicula.fechaEstreno = LocalDate.of(2018,10,15);
        pelicula.genero = "Fantasia";
        pelicula.calificar(4.7);
        pelicula.duracion = 120;

        long duracionLong = pelicula.duracion;
        int calificacionInt = (int)pelicula.calificacion;
        long numeroDePremios = Long.parseLong("25");

        System.out.println("Duracion Long: " + duracionLong);
        System.out.println("calificacion Int: " + calificacionInt);
        System.out.println("Numero de premios: " + numeroDePremios);
        Usuario usuario = new Usuario();
            usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2025,2,22,17,33,3);

        System.out.println(usuario.fechaRegistro);
            usuario.ver(pelicula);

/*        Scanner scanner = new Scanner(System.in);
        System.out.println("Cual es tu nombre");
        String nombre = scanner.nextLine();

        System.out.println("Hola " + nombre + ", esto es platzi play");

        System.out.println(nombre + " cuantos años tienes?");
        int edad = scanner.nextInt();

        System.out.println(nombre + " puedes ver contenido +" + edad);*/
    }
}
