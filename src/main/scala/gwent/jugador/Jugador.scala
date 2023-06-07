package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta

import gwent.carta.cartaclima.CartaClima
import gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}
import scala.util.Random
import java.util.Objects

class Jugador(val name: String, private var _deck: List[ICarta], var _gems: Int = 2,
              private var _hand: List[ICarta] = List(), private var _adistanciazone: List[ADistancia] = List(),
              private var _asediozone: List[Asedio] = List(), private var _caczone: List[CuerpoaCuerpo] = List()) extends IJugador {

  def shuffleDeck(): Unit = {
    _deck = Random.shuffle(_deck)

  }

  def drawCarta(): ICarta = {
    val carta = deck.head
    _deck = deck.tail
    _hand = carta :: hand
    carta

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

  def playCuerpoaCuerpo(c: CuerpoaCuerpo): Unit = {
    if (hand.contains(c)) {
      _hand = hand.filterNot(_ == c)
      _caczone = c :: caczone
    }

  }

  override def equals(obj: Any): Boolean = {
    if (obj.isInstanceOf[Jugador]) {
      val other = obj.asInstanceOf[Jugador]
      (this eq other) ||
        other.name == name && 
          other.deck == deck &&
          other.gems == gems &&
          other.hand == hand &&
          other.adistanciazone == adistanciazone &&
          other.asediozone == asediozone &&
          other.caczone == caczone
    } else {
      false
    }
  }

  override def hashCode(): Int = {
    Objects.hash(
      classOf[Jugador], name, deck, gems, hand, adistanciazone, asediozone, caczone)
    
  }

  def deck: List[ICarta] = _deck
  
  def gems: Int = _gems
  
  def gems_=(newGems: Int): Unit = {
    _gems = math.max(0,newGems)
  }

  def hand: List[ICarta] = _hand

  def adistanciazone: List[ADistancia] = _adistanciazone

  def asediozone: List[Asedio] = _asediozone

  def caczone: List[CuerpoaCuerpo] = _caczone

}
