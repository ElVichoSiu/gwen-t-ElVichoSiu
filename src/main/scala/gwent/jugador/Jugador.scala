package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaclima.CartaClima
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}

class Jugador(val name: String, private var _deck: List[ICarta], var gems: Int = 2,
              private var _hand: List[ICarta] = List(), private var _caczone: List[CuerpoaCuerpo] = List(),
              private var _asediozone: List[Asedio] = List(), private var _adistanciazone: List[ADistancia] = List()) extends IJugador {

  def caczone: List[CuerpoaCuerpo] = _caczone

  def adistanciazone: List[ADistancia] = _adistanciazone

  def asediozone: List[Asedio] = _asediozone

  def playCuerpoaCuerpo(c: CuerpoaCuerpo): Unit = {
    if (hand.contains(c)) {
      _hand = hand.filterNot(_ == c)
      _caczone = c :: caczone
    }
    
  }

  def playADistancia(c: ADistancia): Unit = {
    if (hand.contains(c)) {
      _hand = hand.filterNot(_ == c)
      _adistanciazone = c :: adistanciazone
    }

  }

  def playAsedio(c: Asedio): Unit = {
    if (hand.contains(c)) {
      _hand = hand.filterNot(_ == c)
      _asediozone = c :: asediozone
    }

  }

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
