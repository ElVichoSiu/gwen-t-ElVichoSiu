package cl.uchile.dcc
package gwent.carta

import gwent.jugador.Jugador

trait ICarta {

  val name: String

  val description: String
  
  def play(j: Jugador): Unit
}
