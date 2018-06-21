package tp

class Evento {

    String nombre
    String contacto
    Double espacioAsignadoAStands
    Date fechaRealizacion
    Date fechaInicioInscripcion
    Date fechaLimiteReasignacion
    Date fechaInicioProcesoSeleccion
    PosibilidadDeReasignacion posibilidadDeReasignacion


    static hasMany = [reserva: Reserva]
    static hasOne = [predio: Predio, config: Config]


    static constraints = {
      nombre blank: false, nullable: false
      contacto blank: false, nullable: false, email: true      
      fechaInicioInscripcion blank: false, nullable: false
      fechaLimiteReasignacion blank: false, nullable: false
      fechaInicioProcesoSeleccion blank: false, nullable: false
      reserva nullable: true
    }

    static mapping = {

    }

    Evento(String nombre, String contacto, Date fechaRealizacion,
      PosibilidadDeReasignacion posibilidadDeReasignacion, Predio predio) {
        this.nombre = nombre
        this.contacto = contacto
        this.fechaRealizacion = fechaRealizacion
        this.posibilidadDeReasignacion = posibilidadDeReasignacion
        this.config = new Config(this)
        this.predio = predio
    }

    def agregarReserva(Expositor expositor) {
      int prioridad = this.config.numeroDeInscripcionActual
      this.config.incNumeroDeInscripcionActual()
      this.reserva = new Reserva(this,expositor,prioridad)
    }




}
