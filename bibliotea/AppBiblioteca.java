import java.util.Scanner;

import com.biblioteca.mantener.*;

public class AppBiblioteca {
    private Libro libro;
    public static void main(String[] args) throws Exception {
        AppBiblioteca biblioteca = new AppBiblioteca();
        biblioteca.cargar();
        biblioteca.imprimir();

    }

    public void cargar(){
        Scanner sc = new Scanner(system.in);
        libro = new libro();
        System.out.println(("digite el codigo del libro: "));
        Libro.setCodigo(sc.nextInt());
        System.out.println(("digite el codigo del libro: "));
        libro.setNombre(sc.next());
        System.out.println(("digite la edicion del libro: "));
        libro.setEdicion(sc.nextInt());
        System.out.println(("digite la edicion del libro: "));



    }
    public void imprimir(){


    }
}
