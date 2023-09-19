package Iterador;
import Item.Libro;

public abstract class Iterador {
  public abstract void Primero();

  public abstract void Siguiente();

  public abstract boolean HayMas();

  public abstract Libro ElementoActual();
}
