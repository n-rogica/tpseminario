package tp

class Mobiliario {

    String nombre
    //Categoria enum
    Double tamanio

    static belongsTo = [stand: Stand]

    static constraints = {
    }
}
