package cl.uchile.dcc
package gwent.carta.cartaclima

import gwent.carta.ICarta

import cl.uchile.dcc.gwent.jugador.Jugador

trait CartaClima extends ICarta {

  override def play(j: Jugador): Unit

}
