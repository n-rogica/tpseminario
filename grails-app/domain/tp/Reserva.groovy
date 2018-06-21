package tp

class Reserva {

    EstadoReserva estadoReserva
    int numeroPrioridad
    //boolean esSponsor

    static belongsTo = [evento: Evento]
    static hasOne = [expositor: Expositor]
    static hasMany = [stands: Stand]

    static constraints = {
      stands nullable: true
    }

    Reserva(Evento evento, Expositor expositor, int prioridad) {
      this.evento = evento
      this.expositor = expositor
      this.numeroPrioridad = prioridad
      this.estadoReserva = EstadoReserva.ACEPTADA
    }




}
