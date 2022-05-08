package speakmuch.libreria;

import java.net.URL;

public class SpeakingOnline extends Contenido {

  public URL enlace;

  public SpeakingOnline() {
  }

  public SpeakingOnline(URL enlace) {
    this.enlace = enlace;
  }

  public URL getEnlace() {
    return enlace;
  }

  public void setEnlace(URL enlace) {
    this.enlace = enlace;
  }

}
