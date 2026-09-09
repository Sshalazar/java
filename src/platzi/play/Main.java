package platzi.play;

import platzi.play.contenido.Pelicula;
import platzi.play.plataforma.Usuario;
import platzi.play.util.ScannerUtils;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Platzi play ");

String nombre = ScannerUtils.CapturarTexto("Nombre del contenido");
        String genero = ScannerUtils.CapturarTexto("Genero del contenido");
        int duracion = ScannerUtils.CapturarNumero("Duracion del contenido");
        double calificacion = ScannerUtils.CapturarDecimal("Calificacion del contenido");


        Pelicula pelicula = new Pelicula();
        pelicula.titulo = nombre;
        pelicula.fechaEstreno = LocalDate.of(2018,10,15);
        pelicula.genero = genero;
        pelicula.calificar(calificacion);
        pelicula.duracion = duracion;

        System.out.println(pelicula.obtenerFichaTecnica());

        Usuario usuario = new Usuario();
            usuario.nombre = "Juan";
        usuario.fechaRegistro = LocalDateTime.of(2025,2,22,17,33,3);

        System.out.println(usuario.fechaRegistro);
            usuario.ver(pelicula);
    }
}
