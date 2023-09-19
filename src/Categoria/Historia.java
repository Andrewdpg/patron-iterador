package Categoria;

import java.util.List;

import Item.Libro;
import Iterador.Iterador;
import Iterador.IteradorPorAno;

public class Historia extends Categoria {

   public Historia(List<Libro> libros) {
     super(libros);
   }
  
   @Override
   public Iterador CrearIterador() {
     return new IteradorPorAno(libros);
   }
}
