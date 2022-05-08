package speakmuch.libreria;

public class SpeakingPresencial extends Contenido {

  private int codigoPostal;

  public SpeakingPresencial() {
  }
  
  public SpeakingPresencial(int codigoPostal) {
    this.codigoPostal = codigoPostal;
  }


  public int getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(int codigoPostal) {
    this.codigoPostal = codigoPostal;
  }

}
