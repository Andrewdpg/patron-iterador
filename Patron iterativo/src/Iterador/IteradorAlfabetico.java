package Iterador;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Item.Libro;

public class IteradorAlfabetico extends Iterador {
  List<Libro> libros;
  int indice;

  public IteradorAlfabetico(List<Libro> libros) {
    this.libros = libros;
    this.indice = 0;
    // Ordenar la lista alfabéticamente por el título del libro
    Collections.sort(this.libros, new Comparator<Libro>() {
      @Override
      public int compare(Libro l1, Libro l2) {
        return l1.getTitulo().compareTo(l2.getTitulo());
      }
    });
  }

  @Override
  public void Primero() {
    // Establecer el índice al primer elemento de la lista
    this.indice = 0;
  }

  @Override
  public void Siguiente() {
    // Incrementar el índice si no se ha llegado al final de la lista
    if (this.indice < this.libros.size()) {
      this.indice++;
    }
  }

  @Override
  public boolean HayMas() {
    // Devolver true si el índice es menor que el tamaño de la lista
    return this.indice < this.libros.size();
  }

  @Override
  public Libro ElementoActual() {
    // Devolver el libro correspondiente al índice actual
    return this.libros.get(this.indice);
  }
}
