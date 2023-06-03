package cl.uchile.dcc
package gwent.carta.cartaunidad

import gwent.carta.ICarta

import cl.uchile.dcc.gwent.jugador.Jugador

abstract class AbstractCartaUnidad(val name: String, val description: String, var strength: Int) extends ICarta {

  var currentStrength: Int = strength

  override def play(j: Jugador): Unit
  
}
