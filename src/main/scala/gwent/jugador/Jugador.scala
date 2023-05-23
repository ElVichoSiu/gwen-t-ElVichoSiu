package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta

class Jugador(val name: String, private var _deck: List[ICarta], var gems: Int = 2, private var _hand: List[ICarta] = List()) extends IJugador {

  def deck: List[ICarta] = _deck

  def hand: List[ICarta] = _hand

  def shuffleDeck(): Unit = {
    _deck = scala.util.Random.shuffle(_deck)

  }

  def drawCarta(): ICarta = {
    val carta = deck.head
    _deck = deck.tail
    _hand = carta :: hand
    carta

  }

}
