package tp

class Stand {

    Double precio
    EstadoStand estado
    Double superficie
    TipoDeStand tipo
    String descripcion
    

    static hasMany = [mobiliario: Mobiliario]

    static constraints = {
      mobiliario nullable: true
      descripcion blank: true, nullable: true
    }

    Stand(Double precio, Double superficie, TipoDeStand tipo,
      String descripcion) {
      this.precio = precio
      this.estado = ESTADO.DISPONIBLE
      this.superficie = superficie
      this.tipo = tipo
      if (descripcion && !descripcion.allWhitespace) {
          this.descripcion = descripcion
      } else {
        this.descripcion = ""
      }
    }

    // TODO agregar constructor con mobiliario


    double calcularEspacioTotalOcupado() {

    }
}
