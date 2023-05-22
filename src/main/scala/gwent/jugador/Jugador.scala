package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta

class Jugador(val name: String, private var _deck: List[ICarta], var gems: Int = 2) extends IJugador {

  def deck: List[ICarta] = {
    _deck

  }

  def shuffleDeck(): Unit = {
    _deck = scala.util.Random.shuffle(_deck)

  }
  
}
