package tp

class Expositor {

    String nombreUsuario
    String password
    String contacto
    String nombreComercial
    String rubro

    static hasMany = [reserva: Reserva]

    static constraints = {
      reserva nullable: true
    }
}
