package cl.uchile.dcc
package gwent.jugador

import gwent.carta.ICarta
import cl.uchile.dcc.gwent.carta.cartaunidad.classesunidad.{ADistancia, Asedio, CuerpoaCuerpo}

trait IJugador {
  def shuffleDeck(): Unit
  
  def drawCarta(): ICarta
  
  def playADistancia(c: ADistancia): Unit
  
  def playAsedio(c: Asedio): Unit
  
  def playCuerpoaCuerpo(c: CuerpoaCuerpo): Unit

}
