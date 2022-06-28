package speakmuch.libreria;

import java.util.ArrayList;
import java.util.List;

public class Curso {
  private Alumno alumno;
  private List<Contenido> contenidos = new ArrayList<>();

  public Curso() {
  }

  public Curso(Alumno alumno, List<Contenido> contenidos) {
    this.alumno = alumno;
    this.contenidos = contenidos;
  }

  public Alumno getAlumno() {
    return alumno;
  }

  public void setAlumno(Alumno alumno) {
    this.alumno = alumno;
  }

  public List<Contenido> getContenidos() {
    return contenidos;
  }

  public void setContenidos(List<Contenido> contenidos) {
    this.contenidos = contenidos;
  }

  public int calcularPrecioTotal() {
    int acumulador = 0;
    for (Contenido contenido : getContenidos()) {
      acumulador += (contenido.numeroHora * contenido.precioPorHora);
    }
    return acumulador;
  }
  
}
