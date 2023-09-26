package Categoria;


import java.util.List;

import Item.Libro;
import Iterador.Iterador;

public abstract class Categoria {
  List<Libro> libros;
  
   public Categoria(List<Libro> libros) {
     this.libros = libros;
   }
  
   public abstract Iterador CrearIterador();
}
