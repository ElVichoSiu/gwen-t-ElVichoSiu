package cl.uchile.dcc
package gwent.carta.cartaclima

import cl.uchile.dcc.gwent.jugador.Jugador

abstract class AbstractCartaClima(val name: String, val description: String) extends CartaClima {

  override def play(j: Jugador): Unit = {
    
  }
  
}
