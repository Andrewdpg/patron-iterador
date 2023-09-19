package Categoria;

import java.util.List;

import Item.Libro;
import Iterador.Iterador;
import Iterador.IteradorAlfabetico;

public class Novela extends Categoria {

   public Novela(List<Libro> libros) {
     super(libros);
   }
  
   @Override
   public Iterador CrearIterador() {
     return new IteradorAlfabetico(libros);
   }
}
