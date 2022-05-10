package speakmuch.libreria;

public class Contenido {
	public String idioma;
	public String nivel;
	public int numeroHora;
	public int precioPorHora;

	public Contenido() {
	}
	
	public Contenido(String idioma, String nivel, int numeroHora, int precioPorHora) {
    this.idioma = idioma;
    this.nivel = nivel;
    this.numeroHora = numeroHora;
    this.precioPorHora = precioPorHora;
  }

  public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		this.nivel = nivel;
	}

	public int getNumeroHora() {
		return numeroHora;
	}

	public void setNumeroHora(int numeroHora) {
		this.numeroHora = numeroHora;
	}

	public int getPrecioPorHora() {
		return precioPorHora;
	}

	public void setPrecioPorHora(int precioPorHora) {
		this.precioPorHora = precioPorHora;
	}

}
