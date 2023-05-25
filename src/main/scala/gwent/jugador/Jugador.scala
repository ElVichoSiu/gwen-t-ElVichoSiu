package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta

import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}

class Jugador(val name: String, private var _deck: List[ICarta], var gems: Int = 2, 
              private var _hand: List[ICarta] = List(), private var _caczone: List[CuerpoaCuerpo] = List(),
              private var _asediozone: List[Asedio] = List(), private var _adistanciazone: List[ADistancia] = List()) extends IJugador {

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
