import java.util.ArrayList;
import java.util.List;

import Categoria.Categoria;
import Categoria.CienciaFiccion;
import Categoria.Historia;
import Categoria.Novela;
import Item.Libro;
import Iterador.Iterador;

public class Main {
  public static void main(String[] args) {
    // Crear algunas categorías con sus respectivos libros
    List<Libro> novelas = new ArrayList<>();
    novelas.add(new Libro("Cien años de soledad", "Gabriel García Márquez", 1967));
    novelas.add(new Libro("El Quijote", "Miguel de Cervantes", 1605));
    novelas.add(new Libro("El principito", "Antoine de Saint-Exupéry", 1943));
    Categoria categoriaN = new Novela(novelas);

    List<Libro> cienciaFiccion = new ArrayList<>();
    cienciaFiccion.add(new Libro("1984", "George Orwell", 1949));
    cienciaFiccion.add(new Libro("La guerra de los mundos", "H. G. Wells", 1898));
    cienciaFiccion.add(new Libro("El juego de Ender", "Orson Scott Card", 1985));
    Categoria categoriaCF = new CienciaFiccion(cienciaFiccion);

    List<Libro> historia = new ArrayList<>();
    historia.add(new Libro("Los pilares de la Tierra", "Ken Follett", 1989));
    historia.add(new Libro("La catedral del mar", "Ildefonso Falcones", 2006));
    historia.add(new Libro("El nombre de la rosa", "Umberto Eco", 1980));
    Categoria categoriaH = new Historia(historia);

    // Crear un iterador para cada categoría
    Iterador iteradorNovela = categoriaN.CrearIterador();
    Iterador iteradorCienciaFiccion = categoriaCF.CrearIterador();
    Iterador iteradorHistoria = categoriaH.CrearIterador();

    // Recorrer los libros de cada categoría usando el iterador correspondiente
    iterar(iteradorNovela);
    iterar(iteradorCienciaFiccion);
    iterar(iteradorHistoria);
  }

  public static void iterar(Iterador iterador){
    System.out.println("\nLibros de la categoría: ");
    iterador.Primero();
    while (iterador.HayMas()) {
      Libro libro = iterador.ElementoActual();
      System.out.println(libro.getTitulo() + " - " + libro.getAutor() + " - " + libro.getAño());
      iterador.Siguiente();
    }
  }
}

