package Item;

public class Libro {
  private String titulo;
  private String autor;
  private int año;

  public Libro(String titulo, String autor, int año) {
    this.titulo = titulo;
    this.autor = autor;
    this.año = año;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getAutor() {
    return this.autor;
  }

  public int getAño() {
    return this.año;
  }
}