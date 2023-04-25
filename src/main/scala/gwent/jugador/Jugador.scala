package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta

class Jugador(val name: String, val deck: List[ICarta], var gems: Int = 2) extends IJugador {

}
