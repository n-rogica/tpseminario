package tp

class Config {

    int numeroDeInscripcionActual
    int cantidadDeSponsors
    int maxCantidadDeSponsors

    static belongsTo = [evento: Evento]

    static constraints = {
    }

    static mapping = {

    }

    Config(Evento evento) {
      this.numeroDeInscripcionActual = 1
      this.cantidadDeSponsors = 0
      this.maxCantidadDeSponsors = 5
      this.evento = evento
    }

    void incNumeroDeInscripcionActual() {
      this.numeroDeInscripcionActual += 1
    }




}
