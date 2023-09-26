package Categoria;

import java.util.List;

import Item.Libro;
import Iterador.Iterador;
import Iterador.IteradorPorAutor;

public class CienciaFiccion extends Categoria {

  public CienciaFiccion(List<Libro> libros) {
    super(libros);
  }

  @Override
  public Iterador CrearIterador() {
    return new IteradorPorAutor(libros);
  }
}
